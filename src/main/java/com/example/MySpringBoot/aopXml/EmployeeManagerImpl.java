package com.example.MySpringBoot.aopXml;


import java.util.ArrayList;
import java.util.List;

public class EmployeeManagerImpl implements com.example.MySpringBoot.aopXml.EmployeeManager
{
    public com.example.MySpringBoot.aopXml.EmployeeDTO getEmployeeById(Integer employeeId) {
        System.out.println("Method getEmployeeById() called");
        return new com.example.MySpringBoot.aopXml.EmployeeDTO();
    }

    public List<com.example.MySpringBoot.aopXml.EmployeeDTO> getAllEmployee() {
        System.out.println("Method getAllEmployee() called");
        return new ArrayList<com.example.MySpringBoot.aopXml.EmployeeDTO>();
    }

    public void createEmployee(com.example.MySpringBoot.aopXml.EmployeeDTO employee) {
        System.out.println("Method createEmployee() called");
    }

    public void deleteEmployee(Integer employeeId) {
        System.out.println("Method deleteEmployee() called");
    }

    public void updateEmployee(com.example.MySpringBoot.aopXml.EmployeeDTO employee) {
        System.out.println("Method updateEmployee() called");
    }
}