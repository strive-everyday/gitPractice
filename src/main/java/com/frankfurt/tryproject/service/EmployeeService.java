package com.frankfurt.tryproject.service;

import com.frankfurt.tryproject.domain.Employee;
import com.frankfurt.tryproject.utils.R;

import java.util.List;

public interface EmployeeService {


    R<List<Employee>> getAll();
}
