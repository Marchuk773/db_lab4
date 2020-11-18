package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Trainer")
@Table(name = "Trainer", schema = "gym", catalog = "")
public class Trainer {

    @Id
    @Column
    private Integer personId;

    @Column
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
