package com.example.demo.Controller;

import com.example.demo.Model.Department;
import com.example.demo.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    //display list of departments
    /*
    @GetMapping("/")
   public String viewHomePage(Model model) {
        model.addAttribute("listDepartments", departmentService.getAllDepartments());
        return "index";
    }
*/

    @GetMapping("/showNewDepartmentForm")
    public String showNewDepartmentForm(Model model) {
        Department department = new Department();
        model.addAttribute("department", department);
        return "new_department";
    }

    @PostMapping("/saveDepartment")
    public String saveDepartment(@ModelAttribute("department") Department department){
       //save
       departmentService.saveDepartment(department);
       return "redirect:/";
    }

}