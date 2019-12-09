jpackage com.capgemini.springcore.annotations.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {
	private int empId;
	private String empName;
	@Autowired(required= false)
	@Qualifier("test")
	private DepartmentBean deptBean;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public DepartmentBean getDeptBean() {
		return deptBean;
	}

	public void setDeptBean(DepartmentBean deptBean) {
		this.deptBean = deptBean;
	}

	// bean life-cycle methods
	@PostConstruct
	public void init() {
		System.out.println("Init phase...");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Destroy phase...");
	}
}
