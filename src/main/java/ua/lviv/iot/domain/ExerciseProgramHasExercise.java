package ua.lviv.iot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "ExerciseProgramHasExercise")
@Table(name = "Exercise_program_has_exercise", schema = "gym", catalog = "")
public class ExerciseProgramHasExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "exercise_program_id", referencedColumnName = "id")
    private ExerciseProgram exerciseProgram;

    @ManyToOne
    @JoinColumn(name = "exercise_id", referencedColumnName = "id")
    private Exercise exercise;

    public ExerciseProgramHasExercise() {
    }

    public ExerciseProgramHasExercise(ExerciseProgram exerciseProgram, Exercise exercise) {
        this.exerciseProgram = exerciseProgram;
        this.exercise = exercise;
    }

    public ExerciseProgramHasExercise(Integer id, ExerciseProgram exerciseProgram,
            Exercise exercise) {
        this.id = id;
        this.exerciseProgram = exerciseProgram;
        this.exercise = exercise;
    }

    public Integer getId() {
        return id;
    }

    public ExerciseProgram getExerciseProgram() {
        return exerciseProgram;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setExerciseProgram(ExerciseProgram exerciseProgram) {
        this.exerciseProgram = exerciseProgram;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((exercise == null) ? 0 : exercise.hashCode());
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
        ExerciseProgramHasExercise other = (ExerciseProgramHasExercise) obj;
        if (exercise == null) {
            if (other.exercise != null)
                return false;
        } else if (!exercise.equals(other.exercise))
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
        return "ExerciseProgramHasExercise [id=" + id + ", exerciseProgram=" + exerciseProgram
                + ", exercise=" + exercise + "]\n";
    }

}
