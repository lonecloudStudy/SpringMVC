package cn.lonecloud.controller;

import cn.lonecloud.dao.EmployeeDao;
import cn.lonecloud.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by lonecloud on 17/4/16.
 */
@Controller
public class EmployeeController {

    @Resource
    private EmployeeDao employeeDao;

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("employee", employeeDao.query());
        return "list";
    }

    @RequestMapping("edit/{id}")
    public String edit(@PathVariable("id") String id, Model model) {
        if (id != null) {
            model.addAttribute(employeeDao.query(id));
        }
        return "edit";
    }
}
