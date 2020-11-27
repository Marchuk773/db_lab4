package ua.lviv.iot.service;

import ua.lviv.iot.dataaccess.SalaryRepository;
import ua.lviv.iot.domain.Salary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class SalaryService extends GeneralService<Salary, Integer> {

    @Autowired
    SalaryRepository salaryRepository;

    @Override
    public JpaRepository<Salary, Integer> getRepository() {
        return salaryRepository;
    }

}
