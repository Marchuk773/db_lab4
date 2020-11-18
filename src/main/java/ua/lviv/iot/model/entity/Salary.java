package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Table;
import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;

@Table(name = "salary")
public class Salary {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "bonus")
    private Double bonus;

    public Salary() {
    }

    public Salary(Double salary, Double bonus) {
        this(-1, salary, bonus);
    }

    public Salary(Integer id, Double salary, Double bonus) {
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public Integer getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Salary [id=" + id + ", salary=" + salary + ", bonus=" + bonus + "]";
    }

}
