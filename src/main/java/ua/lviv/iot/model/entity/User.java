package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "User")
@Table(name = "User", schema = "gym", catalog = "")
public class User {

    @Id
    @Column
    private Integer personId;

    @Column
    private Integer abonementId;

    @Column
    private Integer trainerId;

    public User() {
    }

    public User(Integer abonementId, Integer trainerId) {
        this(-1, abonementId, trainerId);
    }

    public User(Integer personId, Integer abonementId, Integer trainerId) {
        this.personId = personId;
        this.abonementId = abonementId;
        this.trainerId = trainerId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public Integer getAbonementId() {
        return abonementId;
    }

    public Integer getTrainerId() {
        return trainerId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public void setAbonementId(Integer abonementId) {
        this.abonementId = abonementId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    @Override
    public String toString() {
        return "User [personId=" + personId + ", abonementId=" + abonementId + ", trainerId="
                + trainerId + "]";
    }

}
