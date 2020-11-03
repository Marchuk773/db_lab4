package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Table;
import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;

@Table(name = "exercise")
public class Exercise {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "duration_in_minutes")
    private Double durationInMinutes;

    @Column(name = "muscle_group", length = 45)
    private String muscleGroup;

    @Column(name = "repeats_quantity")
    private Integer repeatsQuantity;

    @Column(name = "burned_calories")
    private Integer burnedCalories;

    public Exercise() {
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
