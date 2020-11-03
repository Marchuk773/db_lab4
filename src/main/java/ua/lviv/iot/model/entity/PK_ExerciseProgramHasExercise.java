package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Column;

public class PK_ExerciseProgramHasExercise {

    @Column(name = "exercise_program")
    private String exerciseProgram;

    @Column(name = "exercise")
    private String exercise;

    public PK_ExerciseProgramHasExercise() {
    }

    public PK_ExerciseProgramHasExercise(String exerciseProgram, String exercise) {
        this.exerciseProgram = exerciseProgram;
        this.exercise = exercise;
    }

    public String getExerciseProgram() {
        return exerciseProgram;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExerciseProgram(String exerciseProgram) {
        this.exerciseProgram = exerciseProgram;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    @Override
    public String toString() {
        return "PK_ExerciseProgramHasExercise [exerciseProgram=" + exerciseProgram + ", exercise="
                + exercise + "]";
    }

}
