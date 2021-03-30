package myproject.action;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.jdbc.where.SimpleWhere;
import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.framework.beans.util.BeanUtil;
import org.seasar.framework.beans.util.Beans;
import org.seasar.s2csv.csv.S2CSVWriteCtrl;
import org.seasar.s2csv.csv.factory.S2CSVCtrlFactory;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;

import myproject.EmpCsv;
import myproject.dto.EmpDto;
import myproject.entity.Emp;
import myproject.form.EmpForm;
import myproject.service.EmpService;

public class EmpAction {

    private static final String PRE_PAGE_EDIT = "edit";
    private static final String PRE_PAGE_CREATE = "create";
    private static final String PRE_PAGE_DELETE = "delete";
    private static final String PRE_PAGE_SEARCH = "search";

    public List<Emp> empItems;
    public List<EmpDto> empDtoList = new ArrayList<EmpDto>();

    public JdbcManager jdbcManager;

    @ActionForm
    @Resource
    protected EmpForm empForm;

    @Resource
    public EmpDto empDto;

    @Resource
    protected EmpService empService;

    @Resource
    protected S2CSVCtrlFactory csvCtrlFactory;

    @Resource
    protected HttpServletResponse response;


    /*****************************
     * 一覧
     * ****************************/
	@Execute(validator = false)
	@RemoveSession(name = "empDto")
	public String index() {
//	empItems = empService.findAll();
	empItems = jdbcManager.from(Emp.class)
							.orderBy("empId")
							.getResultList();

		return "index.jsp";
	}


    /*****************************
     * 編集
     * ****************************/
	@Execute(validator = false, urlPattern = "showEdit/{id}")
	public String showEdit() {
		Emp entity = empService.findById(Integer.valueOf(empForm.id));
		Beans.copy(entity, empForm).execute();
		return "showEdit.jsp";
	}

	@Execute(input = "showEdit.jsp")
	public String editConfirm() {
		// 呼び出し元ページ情報
		empForm.prePage = PRE_PAGE_EDIT;

		// DTOに値を入れ、確認ページに渡す
		Beans.copy(empForm, empDto).execute();

		return  "confirm.jsp";
	}

	@Execute(validator = false)
	public String update() {
		Emp entity = Beans.createAndCopy(Emp.class, empDto).execute();
		empService.update(entity);

		return "finish.jsp";
	}


    /*****************************
     * 削除
     * ****************************/
	@Execute(validator = false, urlPattern = "delete/{id}")
	public String deleteConfirm() {
		// 呼び出し元ページ情報
		empForm.prePage = PRE_PAGE_DELETE;

		Emp entity = empService.findById(Integer.valueOf(empForm.id));
		Beans.copy(entity, empForm).execute();

		// DTOに値を入れ、確認ページに渡す
		Beans.copy(empForm, empDto).execute();

		return "confirm.jsp";
	}

	@Execute(validator = false)
	public String delete() {
		Emp entity = Beans.createAndCopy(Emp.class, empDto).execute();
		empService.delete(entity);

		return "finish.jsp";
	}


    /*****************************
     * 新規作成
     * ****************************/
	@Execute(validator = false)
	public String create() {
		// 新規作成のときのIDをフォームに設定
		//      ==> フォームで初期値を入れれば不要だったので削除
		//final long count = jdbcManager.from(Emp.class).getCount();
		//empForm.id = String.valueOf(count + 1);

		return "create.jsp";
	}

	@Execute(validator = true, input = "create.jsp")
	public String createConfirm() {
		// 呼び出し元ページ情報
		empForm.prePage = PRE_PAGE_CREATE;

		// DTOに値を入れ、確認ページに渡す
		Beans.copy(empForm, empDto).execute();

		return  "confirm.jsp";
	}

	@Execute(validator = false)
	public String insert() {
		Emp entity = Beans.createAndCopy(Emp.class, empDto).execute();
		empService.insert(entity);

		return "finish.jsp";
	}


    /*****************************
     * 検索
     * ****************************/
	@Execute(validator = false)
	public String search() {

		return "search.jsp";
	}

	@Execute(validator = false)
	public String searchExe() {
		// 呼び出し元ページ情報
		empForm.prePage = PRE_PAGE_SEARCH;

		// プロパティが空文字だったらnullに変換する
		if(empForm.id.isEmpty()) empForm.id = null;
		if(empForm.empId.isEmpty()) empForm.empId = null;
		if(empForm.name.isEmpty()) empForm.name = null;
		if(empForm.age.isEmpty()) empForm.age = null;
		if(empForm.genderId.isEmpty()) empForm.genderId = null;
		if(empForm.address.isEmpty()) empForm.address = null;
		if(empForm.deptId.isEmpty()) empForm.deptId = null;

		empItems = jdbcManager.from(Emp.class)
								.where(new SimpleWhere()
										.eq("deptId", empForm.deptId)
										.eq("empId", empForm.empId)
										.contains("name", empForm.name))
								.orderBy("empId")
								.getResultList();

		// List<Emp> empItems -> List<EmpDto> empDtoList
		//  で別メソッドに渡せるかと思ったけどダメ
		//
		//for(Emp e: empItems){
		//	EmpDto ed = new EmpDto();
		//	BeanUtil.copyProperties(e, ed);
		//	empDtoList.add(ed);
		//}

		return "result.jsp";
	}


    /*****************************
     * csv出力
     * ****************************/
	@Execute(validator = false)
	public String download() {
		// DBからデータを取得
		//if(!(empForm.prePage.equals(PRE_PAGE_SEARCH))){
			empItems = jdbcManager.from(Emp.class)
					.orderBy("empId")
					.getResultList();
		//}

		// List<EmpDto> empDtoList -> List<Emp> empItems に値をコピー
		//  で別メソッドに渡せるかと思ったけどダメ
		//
		//for(EmpDto ed: empDtoList){
		//	Emp e = new Emp();
		//	BeanUtil.copyProperties(e, ed);
		//	empItems.add(e);
		//}

		// List<Emp> empItems -> List<EmpCsv> csvList に値をコピー
		List<EmpCsv> csvList = new ArrayList<EmpCsv>();

		for (Emp row : empItems) {								//拡張for
		//for (int i=0; i < empItems.size(); i++) {				//普通のfor文で書いた場合
			EmpCsv csv = new EmpCsv();
			BeanUtil.copyProperties(row, csv);					//拡張for
			//BeanUtil.copyProperties(empItems.get(i), csv);	//普通のfor文で書いた場合
			csvList.add(csv);					//csvListにadd
		}

		// CSVファイルを出力
		try {

			ByteArrayOutputStream os = new ByteArrayOutputStream(1024);
			OutputStreamWriter writer = new OutputStreamWriter(os, "Shift_JIS");

			S2CSVWriteCtrl<EmpCsv> csvWriter
					= csvCtrlFactory.getWriteController(EmpCsv.class, writer);

			csvWriter.writeAll(csvList);
			writer.close();

			byte[] byteArray = os.toByteArray();
			ByteArrayInputStream is = new ByteArrayInputStream(byteArray);

			ResponseUtil.download("emp.csv", is, byteArray.length);

			} catch(Exception e) {
				e.printStackTrace();
			}

	    return null;
	}

}

