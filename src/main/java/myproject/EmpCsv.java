package myproject;

import java.io.Serializable;

import org.seasar.s2csv.csv.annotation.column.CSVColumn;
import org.seasar.s2csv.csv.annotation.entity.CSVEntity;

@CSVEntity(header=true)
public class EmpCsv implements Serializable{

	@CSVColumn(columnIndex=0, columnName="ID", quote=true)
	public String id;

	@CSVColumn(columnIndex=1, columnName="社員ID", quote=true)
	public String empId;

	@CSVColumn(columnIndex=2, columnName="名前", quote=true)
	public String name;

	@CSVColumn(columnIndex=3, columnName="年齢", quote=true)
	public String age;

	@CSVColumn(columnIndex=4, columnName="性別ID", quote=true)
	public String genderId;

	@CSVColumn(columnIndex=5, columnName="住所", quote=true)
	public String deptId;
}
