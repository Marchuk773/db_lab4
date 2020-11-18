package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Exercise_day")
@Table(name = "Exercise_day", schema = "gym", catalog = "")
public class ExerciseDay {

    @Id
    @Column
    private Integer id;

    @Column
    private String dayName;

    @Column
    private Integer exerciseProgramId;

    public ExerciseDay() {
    }

    public ExerciseDay(String dayName, Integer exerciseProgramId) {
        this(-1, dayName, exerciseProgramId);
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
