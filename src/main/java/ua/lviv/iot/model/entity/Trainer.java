package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Trainer")
@Table(name = "Trainer", schema = "gym", catalog = "")
public class Trainer {

    @Id
    @Column(name = "person_id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "salary_id", nullable = false)
    private Salary salary;

    public Trainer() {
    }

    public Trainer(Person person, Salary salary) {
        this.id = person.getId();
        this.person = person;
        this.salary = salary;
    }

    public Person getPerson() {
        return person;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((person == null) ? 0 : person.hashCode());
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
        Trainer other = (Trainer) obj;
        if (person == null) {
            if (other.person != null)
                return false;
        } else if (!person.equals(other.person))
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
        return "Trainer [person=" + person + ", salary=" + salary + "]\n";
    }

}
