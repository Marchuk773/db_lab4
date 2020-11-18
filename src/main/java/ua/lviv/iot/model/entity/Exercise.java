package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Exercise")
@Table(name = "Exercise", schema = "gym", catalog = "")
public class Exercise {

    @Id
    @Column
    private Integer id;

    @Column
    private String name;

    @Column
    private Double durationInMinutes;

    @Column
    private String muscleGroup;

    @Column
    private Integer repeatsQuantity;

    @Column
    private Integer burnedCalories;

    public Exercise() {
    }

    public Exercise(String name, Double durationInMinutes, String muscleGroup,
            Integer repeatsQuantity, Integer burnedCalories) {
        this(-1, name, durationInMinutes, muscleGroup, repeatsQuantity, burnedCalories);
    }

    public Exercise(Integer id, String name, Double durationInMinutes, String muscleGroup,
            Integer repeatsQuantity, Integer burnedCalories) {
        this.id = id;
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.muscleGroup = muscleGroup;
        this.repeatsQuantity = repeatsQuantity;
        this.burnedCalories = burnedCalories;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getDurationInMinutes() {
        return durationInMinutes;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public Integer getRepeatsQuantity() {
        return repeatsQuantity;
    }

    public Integer getBurnedCalories() {
        return burnedCalories;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDurationInMinutes(Double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public void setRepeatsQuantity(Integer repeatsQuantity) {
        this.repeatsQuantity = repeatsQuantity;
    }

    public void setBurnedCalories(Integer burnedCalories) {
        this.burnedCalories = burnedCalories;
    }

    @Override
    public String toString() {
        return "Exercise [id=" + id + ", name=" + name + ", durationInMinutes=" + durationInMinutes
                + ", muscleGroup=" + muscleGroup + ", repeatsQuantity=" + repeatsQuantity
                + ", burnedCalories=" + burnedCalories + "]";
    }

}
