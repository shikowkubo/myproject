package myproject.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import myproject.dto.DeptDto;
import myproject.entity.Dept;
import myproject.form.DeptForm;
import myproject.service.DeptService;

public class DeptAction {

    private static final String PRE_PAGE_EDIT = "edit";
    private static final String PRE_PAGE_CREATE = "create";
    private static final String PRE_PAGE_DELETE = "delete";

    public List<Dept> deptItems;

    public JdbcManager jdbcManager;

    @ActionForm
    @Resource
    protected DeptForm deptForm;

    @Resource
    public DeptDto deptDto;

    @Resource
    protected DeptService deptService;


	@Execute(validator = false)
	@RemoveSession(name = "deptDto")
	public String index() {
	deptItems = jdbcManager.from(Dept.class)
							.orderBy("deptId")
							.getResultList();

		return "index.jsp";
	}


	@Execute(validator = false, urlPattern = "showEdit/{id}")
	public String showEdit() {
		Dept entity = deptService.findById(Integer.valueOf(deptForm.id));
		Beans.copy(entity, deptForm).execute();
		return "showEdit.jsp";
	}

	@Execute(input = "showEdit.jsp")
	public String editConfirm() {
		// 呼び出し元ページ情報
		deptForm.prePage = PRE_PAGE_EDIT;

		// DTOに値を入れ、確認ページに渡す
		Beans.copy(deptForm, deptDto).execute();

		return  "confirm.jsp";
	}

	@Execute(validator = false)
	public String update() {
		Dept entity = Beans.createAndCopy(Dept.class, deptDto).execute();
		deptService.update(entity);

		return "finish.jsp";
	}


	@Execute(validator = false, urlPattern = "delete/{id}")
	public String deleteConfirm() {
		// 呼び出し元ページ情報
		deptForm.prePage = PRE_PAGE_DELETE;

		Dept entity = deptService.findById(Integer.valueOf(deptForm.id));
		Beans.copy(entity, deptForm).execute();

		// DTOに値を入れ、確認ページに渡す
		Beans.copy(deptForm, deptDto).execute();

		return "confirm.jsp";
	}

	@Execute(validator = false)
	public String delete() {
		Dept entity = Beans.createAndCopy(Dept.class, deptDto).execute();
		deptService.delete(entity);

		return "finish.jsp";
	}


	@Execute(validator = false)
	public String create() {
		/*************************************
		* idはauto increment→値が自動で入るので以下の処理は不要だった...
		 ***************************************/
		// 新規作成のときのIDをフォームに設定
		//final long count = jdbcManager.from(Dept.class).getCount();
		// 追加するデータのidに、現在の件数+1の値を設定する
		//deptForm.id = String.valueOf(count + 1);

		return "create.jsp";
	}

	@Execute(input = "create.jsp")
	public String createConfirm() {
		// 呼び出し元ページ情報
		deptForm.prePage = PRE_PAGE_CREATE;

		// DTOに値を入れ、確認ページに渡す
		Beans.copy(deptForm, deptDto).execute();

		return  "confirm.jsp";
	}

	@Execute(validator = false)
	public String insert() {
		Dept entity = Beans.createAndCopy(Dept.class, deptDto).execute();
		deptService.insert(entity);

		return "finish.jsp";
	}

}
