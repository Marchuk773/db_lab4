package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Salary")
@Table(name = "Salary", schema = "gym", catalog = "")
public class Salary {

    @Id
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bonus == null) ? 0 : bonus.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((salary == null) ? 0 : salary.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Salary other = (Salary) obj;
        if (bonus == null) {
            if (other.bonus != null)
                return false;
        } else if (!bonus.equals(other.bonus))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (salary == null) {
            if (other.salary != null)
                return false;
        } else if (!salary.equals(other.salary))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Salary [id=" + id + ", salary=" + salary + ", bonus=" + bonus + "]";
    }

}
