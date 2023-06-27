package com.frankfurt.tryproject.controller;


import com.frankfurt.tryproject.domain.Employee;
import com.frankfurt.tryproject.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {



    //查询所有的讯息
    @GetMapping("/people")
    public R<List<Employee>> getAll(){

        return null;
    }


}
