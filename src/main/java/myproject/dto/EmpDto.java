package myproject.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.IntegerType;

@Component(instance = InstanceType.SESSION)
public class EmpDto implements Serializable {

    private static final long serialVersionUID = 1L;

	@IntegerType
	public String id = "";

	@IntegerType
	public String empId = "";

	public String name = "";

	@IntegerType
	public String age = "";

	@IntegerType
	public String genderId = "";

	public String address = "";

	@IntegerType
	public String deptId = "";
}
