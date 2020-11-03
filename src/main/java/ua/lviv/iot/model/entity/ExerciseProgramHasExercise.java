package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Table;
import ua.lviv.iot.model.annotation.CompositePrimaryKey;

@Table(name = "exercise_program_has_exercise")
public class ExerciseProgramHasExercise {

    @CompositePrimaryKey
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
