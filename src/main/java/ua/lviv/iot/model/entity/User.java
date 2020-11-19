package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "User")
@Table(name = "User", schema = "gym", catalog = "")
public class User {

    @Id
    @Column(name = "person_id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "abonement_id", nullable = false)
    private Abonement abonement;

    @ManyToOne
    @JoinColumn(name = "trainer_id", referencedColumnName = "person_id", nullable = false)
    private Trainer trainer;

    public User() {
    }

    public User(Person person, Abonement abonement, Trainer trainer) {
        this.id = person.getId();
        this.person = person;
        this.abonement = abonement;
        this.trainer = trainer;
    }

    public Person getPerson() {
        return person;
    }

    public Abonement getAbonement() {
        return abonement;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setAbonement(Abonement abonement) {
        this.abonement = abonement;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((abonement == null) ? 0 : abonement.hashCode());
        result = prime * result + ((person == null) ? 0 : person.hashCode());
        result = prime * result + ((trainer == null) ? 0 : trainer.hashCode());
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
        User other = (User) obj;
        if (abonement == null) {
            if (other.abonement != null)
                return false;
        } else if (!abonement.equals(other.abonement))
            return false;
        if (person == null) {
            if (other.person != null)
                return false;
        } else if (!person.equals(other.person))
            return false;
        if (trainer == null) {
            if (other.trainer != null)
                return false;
        } else if (!trainer.equals(other.trainer))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User [person=" + person + ", abonement=" + abonement + ", trainer=" + trainer
                + "]\n";
    }

}
