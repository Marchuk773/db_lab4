package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Exercise_program")
@Table(name = "Exercise_program", schema = "gym", catalog = "")
public class ExerciseProgram {

    @Id
    @Column
    private Integer id;

    @Column
    private String name;

    public ExerciseProgram() {
    }

    public ExerciseProgram(String name) {
        this(-1, name);
    }

    public ExerciseProgram(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExerciseProgram [id=" + id + ", name=" + name + "]";
    }

}
