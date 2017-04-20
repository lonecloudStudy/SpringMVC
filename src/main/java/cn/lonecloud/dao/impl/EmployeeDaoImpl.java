package cn.lonecloud.dao.impl;

import cn.lonecloud.dao.EmployeeDao;
import cn.lonecloud.entity.Employee;
import cn.lonecloud.util.DBUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lonecloud on 17/4/16.
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void insert(Employee employee) {
        DBUtils.insertOrUpdate("insert into employee values(?,?,?,?)", employee);
    }

    @Override
    public void update(Employee employee) {
        DBUtils.insertOrUpdate("update employee set name=?,age=? where id=?", employee.getId());
    }

    @Override
    public void delete(Employee employee) {
        DBUtils.delete("delete from employee where id = ?", employee.getId());
    }

    @Override
    public void deleteById(String id) {
        DBUtils.delete("delete from employee where id = ?", id);
    }

    @Override
    public List<? extends Object> query(Object... args) {
        return args.length != 0 ? DBUtils.query("select id,name,age from employee where id=?", Employee.class, args) : DBUtils.query("select id,name,age from employee", Employee.class);
    }
    @Override
    public Employee queryById(String id) {
        List<?> objects = DBUtils.query("select id,name,age from employee where id=?", Employee.class, id);
        return objects!=null&&objects.size()!=0?(Employee)objects.get(0):null;
    }
}
