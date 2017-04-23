package cn.lonecloud.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lonecloud on 17/4/16.
 * 雇员
 */
public class Employee  implements Serializable{

    private String id;

    private String name;

    private int age;

    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
