package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Table;
import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;

@Table(name = "trainer")
public class Trainer {

    @PrimaryKey
    @Column(name = "person_id")
    private Integer personId;

    @Column(name = "salary_id")
    private Integer salaryId;

    public Trainer() {
    }

    public Trainer(Integer salaryId) {
        this(-1, salaryId);
    }

    public Trainer(Integer personId, Integer salaryId) {
        this.personId = personId;
        this.salaryId = salaryId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public Integer getSalaryId() {
        return salaryId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }

    @Override
    public String toString() {
        return "Trainer [personId=" + personId + ", salaryId=" + salaryId + "]";
    }

}
