package practice13.common;

public class Employee extends  Person{
	private String departmentNm; //部署名
	private int departmentCnt; //部署人数

	public String getDepartmentNm() {
		return this.departmentNm;
	}

	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}

	public int getDepartmentCnt() {
		return this.departmentCnt;
	}

	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}

}
