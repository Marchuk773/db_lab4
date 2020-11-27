package ua.lviv.iot.dataaccess;

import ua.lviv.iot.domain.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer> {

}
