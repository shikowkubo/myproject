package myproject.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.IntegerType;

@Component(instance = InstanceType.SESSION)
public class DeptDto implements Serializable {

    private static final long serialVersionUID = 1L;

	@IntegerType
	public String id = "";

	@IntegerType
	public String deptId = "";

	public String deptName = "";


}
