package myproject.form;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

public class EmpForm {
	@Required
	@IntegerType
	public String id = "0";

	@Required
	@IntegerType
	public String empId = "";

	@Required
	public String name = "";

	@Required
	@IntegerType
	public String age = "";

	@Required
	@IntegerType
	public String genderId = "";

	public String address = "";

	@Required
	public String deptId = "";


	// 確認画面で呼び出し元ページ情報を持つパラメータ
	public String prePage = "";

}
