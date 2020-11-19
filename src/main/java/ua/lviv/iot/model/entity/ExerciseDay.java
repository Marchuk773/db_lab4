package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "ExerciseDay")
@Table(name = "Exercise_day", schema = "gym", catalog = "")
public class ExerciseDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "day_name")
    private String dayName;

    @ManyToOne
    @JoinColumn(name = "exercise_program_id")
    private ExerciseProgram exerciseProgram;

    public ExerciseDay() {
    }

    public ExerciseDay(String dayName, ExerciseProgram exerciseProgram) {
        this.dayName = dayName;
        this.exerciseProgram = exerciseProgram;
    }

    public ExerciseDay(Integer id, String dayName, ExerciseProgram exerciseProgram) {
        this.id = id;
        this.dayName = dayName;
        this.exerciseProgram = exerciseProgram;
    }

    public Integer getId() {
        return id;
    }

    public String getDayName() {
        return dayName;
    }

    public ExerciseProgram getExerciseProgram() {
        return exerciseProgram;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public void setExerciseProgram(ExerciseProgram exerciseProgram) {
        this.exerciseProgram = exerciseProgram;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dayName == null) ? 0 : dayName.hashCode());
        result = prime * result + ((exerciseProgram == null) ? 0 : exerciseProgram.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        ExerciseDay other = (ExerciseDay) obj;
        if (dayName == null) {
            if (other.dayName != null)
                return false;
        } else if (!dayName.equals(other.dayName))
            return false;
        if (exerciseProgram == null) {
            if (other.exerciseProgram != null)
                return false;
        } else if (!exerciseProgram.equals(other.exerciseProgram))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ExerciseDay [id=" + id + ", dayName=" + dayName + ", exerciseProgram="
                + exerciseProgram + "]\n";
    }

}
