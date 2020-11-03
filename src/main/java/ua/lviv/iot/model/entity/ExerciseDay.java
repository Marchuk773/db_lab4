package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Table;
import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;

@Table(name = "exercise_day")
public class ExerciseDay {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "day_name", length = 20)
    private String dayName;

    @Column(name = "exercise_program_id")
    private Integer exerciseProgramId;

    public ExerciseDay() {
    }

    public ExerciseDay(Integer id, String dayName, Integer exerciseProgramId) {
        this.id = id;
        this.dayName = dayName;
        this.exerciseProgramId = exerciseProgramId;
    }

    public Integer getId() {
        return id;
    }

    public String getDayName() {
        return dayName;
    }

    public Integer getExerciseProgramId() {
        return exerciseProgramId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public void setExerciseProgramId(Integer exerciseProgramId) {
        this.exerciseProgramId = exerciseProgramId;
    }

    @Override
    public String toString() {
        return "ExerciseDay [id=" + id + ", dayName=" + dayName + ", exerciseProgramId="
                + exerciseProgramId + "]";
    }

}
