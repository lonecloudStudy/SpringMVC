package cn.lonecloud.controller;

import cn.lonecloud.dao.EmployeeDao;
import cn.lonecloud.entity.Employee;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lonecloud on 17/4/16.
 */
@Controller
@RequestMapping("/emp")
public class EmployeeController {

    private Log logger= LogFactory.getLog(EmployeeController.class);

    @Resource
    private EmployeeDao employeeDao;

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("employee", employeeDao.query());
        return "list";
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, Model model) {
        if(logger.isDebugEnabled()){
            logger.debug(id);
        }
        if (id != null) {
            Employee employee = employeeDao.queryById(id);
            model.addAttribute(employee);
        }
        return "edit";
    }
    @RequestMapping("/show/{id}")
    public String show(@PathVariable("id") String id){
        return "list";
    }

    @RequestMapping(value = "/update/",method = RequestMethod.PUT)
    public String update(Employee employee){
        employeeDao.update(employee);
        return "list";
    }

    @RequestMapping(value = "/emp",method = RequestMethod.GET)
    public String empShow(Model model){
        model.addAttribute("employee",employeeDao.query());
        return "list";
    }
    @RequestMapping(value = "/emp",method = RequestMethod.PUT)
    public String empUpdate(Employee employee){
        employeeDao.update(employee);
        return "list";
    }
    @RequestMapping(value = "/emp",method=RequestMethod.DELETE)
    public String empDelete(@PathVariable("id") String id){
        employeeDao.deleteById(id);
        return "list";
    }
}
