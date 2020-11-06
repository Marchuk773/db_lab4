package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.Salary;
import ua.lviv.iot.service.SalaryService;

public class SalaryController extends GeneralController<Salary, Integer, SalaryService> {

    public SalaryController() {
        super(SalaryService.class);
    }

}
