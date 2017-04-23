package cn.lonecloud.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lonecloud on 17/4/16.
 * 部门
 */
public class Department implements Serializable{

    private String id;

    private String name;

    private Set<Employee> employees=new HashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
