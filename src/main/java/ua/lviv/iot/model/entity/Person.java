package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Person")
@Table(name = "Person", schema = "gym", catalog = "")
public class Person {

    @Id
    @Column
    private Integer id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String gender;

    @Column
    private Integer age;

    public Person() {
    }

    public Person(String name, String surname, String gender, Integer age) {
        this(-1, name, surname, gender, age);
    }

    public Person(Integer id, String name, String surname, String gender, Integer age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", gender=" + gender
                + ", age=" + age + "]";
    }

}
