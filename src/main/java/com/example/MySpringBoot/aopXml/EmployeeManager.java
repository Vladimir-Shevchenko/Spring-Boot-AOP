package com.example.MySpringBoot.aopXml;

import java.util.List;

public interface EmployeeManager
{
    public com.example.MySpringBoot.aopXml.EmployeeDTO getEmployeeById(Integer employeeId);

    public List<com.example.MySpringBoot.aopXml.EmployeeDTO> getAllEmployee();

    public void createEmployee(com.example.MySpringBoot.aopXml.EmployeeDTO employee);

    public void deleteEmployee(Integer employeeId);

    public void updateEmployee(com.example.MySpringBoot.aopXml.EmployeeDTO employee);
}