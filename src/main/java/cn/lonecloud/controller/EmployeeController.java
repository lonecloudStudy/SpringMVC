package cn.lonecloud.controller;

import cn.lonecloud.dao.EmployeeDao;
import cn.lonecloud.entity.Employee;
import cn.lonecloud.util.RandomUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lonecloud on 17/4/16.
 * @author lonecloud
 */
@Controller
@RequestMapping("/emp")
public class EmployeeController {

    private Log logger= LogFactory.getLog(EmployeeController.class);

    @Resource
    private EmployeeDao employeeDao;

    /**
     * 防止一些未填写的属性被清空
     * @param id id
     * @param model model
     */
    @ModelAttribute
    public void getModel(@RequestParam("id") String id, Model model){
        if (null!=id){
            model.addAttribute("employee",employeeDao.queryById(id));
        }
    }

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
        return "redirect:/emp/list";
    }

    /**
     * 显示添加员工的界面
     * @param model model
     * @return view
     */
    @RequestMapping(value = "/emp",method = RequestMethod.GET)
    public String empShow(Model model){
        //不管需不需要如果使用了form标签必须加上
        model.addAttribute("employee",new Employee());
        return "input";
    }

    /**
     * 修改员工的界面
     * @param employee 人员参数
     * @return view
     */
    @RequestMapping(value = "/emp",method = RequestMethod.PUT)
    public String empUpdate(Employee employee){
        employeeDao.update(employee);
        return "redirect:/emp/list";
    }

    /**
     * 删除员工的界面
     * @param id id
     * @return view
     */
    @RequestMapping(value = "/emp/{id}",method=RequestMethod.DELETE)
    public String empDelete(@PathVariable("id") String id){
        logger.debug("delete->>>>>>>>>"+id);
        employeeDao.deleteById(id);
        return "redirect:/emp/list";
    }

    /**
     * 添加一个人员
     * @param employee 人员
     * @return view
     */
    @RequestMapping(value = "/emp",method=RequestMethod.POST)
    public String empAdd(Employee employee){
        employee.setId(RandomUtils.getUUID());
        employeeDao.insert(employee);
        return "redirect:/emp/list";
    }
}
