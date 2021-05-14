package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.Salary;
import ua.lviv.iot.service.SalaryService;
import ua.lviv.iot.service.ServiceInterface;

@RestController
@RequestMapping("/salary")
public class SalaryController extends GeneralController<Salary, Integer> {

    @Autowired
    SalaryService salaryService;

    @Override
    public ServiceInterface<Salary, Integer> getService() {
        return salaryService;
    }

}
