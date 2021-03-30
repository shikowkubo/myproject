package myproject.form;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

public class DeptForm {

	@Required(target = "createConfirm, editConfirm" )
	@IntegerType
	public String id = "0";

	@Required(target = "createConfirm, editConfirm")
	@IntegerType
    public String deptId = "";

	@Required(target = "createConfirm, editConfirm")
    public String deptName = "";


	public String prePage = "";
}
