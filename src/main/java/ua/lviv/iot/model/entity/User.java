package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Table;
import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;

@Table(name = "user")
public class User {

    @PrimaryKey
    @Column(name = "person_id")
    private Integer personId;

    @Column(name = "abonement_id")
    private Integer abonementId;

    @Column(name = "trainer_id")
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
