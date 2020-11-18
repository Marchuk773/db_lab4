package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Exercise_program_has_exercise")
@Table(name = "Exercise_program_has_exercise", schema = "gym", catalog = "")
public class ExerciseProgramHasExercise {

    @Id
    @Column
    private PK_ExerciseProgramHasExercise pk;

    public ExerciseProgramHasExercise() {
    }

    public ExerciseProgramHasExercise(PK_ExerciseProgramHasExercise pk) {
        this.pk = pk;
    }

    public PK_ExerciseProgramHasExercise getPk() {
        return pk;
    }

    public void setPk(PK_ExerciseProgramHasExercise pk) {
        this.pk = pk;
    }

    @Override
    public String toString() {
        return "ExerciseProgramHasExercise [pk=" + pk + "]";
    }

}
