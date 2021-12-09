package com.example.MySpringBoot.aopXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP
{
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        com.example.MySpringBoot.aopXml.EmployeeManager manager = (com.example.MySpringBoot.aopXml.EmployeeManager) context.getBean("employeeManager");

        manager.getEmployeeById(1);

        manager.createEmployee(new com.example.MySpringBoot.aopXml.EmployeeDTO());

        manager.deleteEmployee(100);
    }
}