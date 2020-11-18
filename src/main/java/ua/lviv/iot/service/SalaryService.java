package ua.lviv.iot.service;

import ua.lviv.iot.DAO.SalaryDAOImp;
import ua.lviv.iot.model.entity.Salary;

public class SalaryService extends GeneralService<Salary, Integer, SalaryDAOImp> {

    public SalaryService() {
        super(SalaryDAOImp.class);
    }

}
