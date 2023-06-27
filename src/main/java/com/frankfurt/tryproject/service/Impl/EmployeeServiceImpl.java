package com.frankfurt.tryproject.service.Impl;

import com.frankfurt.tryproject.domain.Employee;
import com.frankfurt.tryproject.service.EmployeeService;
import com.frankfurt.tryproject.utils.R;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public R<List<Employee>> getAll() {

        return null;
    }
}
