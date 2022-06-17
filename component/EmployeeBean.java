package com.bridgelabz.springconcept.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private int eid;
    private  String eName;

    @Autowired
    private DepartmentBean departmentBean;
    public static final Logger log = LoggerFactory.getLogger(EmployeeBean.class);

    public  EmployeeBean(){ }

    @Autowired
    public EmployeeBean(DepartmentBean departmentBean ){
        log.trace("*** @autowiring by using @autowired annotation on constructor ***");
        this.departmentBean = departmentBean;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public DepartmentBean getDepartmentBean() {
        return departmentBean;
    }

    @Autowired
    public void setDepartmentBean(DepartmentBean departmentBean) {
        log.trace("*** @autowiring by using @autowired annotation on setter  ***");
        this.departmentBean = departmentBean;
    }

    public void showEmployeeDetails() {
            log.debug("Employee ID :{}", eid);
            log.debug("Employee name: {}", eName);
            departmentBean.setDeptName("Information Technology");
            log.debug("Department : {}", departmentBean.getDeptName());
    }
}
