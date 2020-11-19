package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.ExerciseProgramHasExercise;
import ua.lviv.iot.service.ExerciseProgramHasExerciseService;

public class ExerciseProgramHasExerciseController extends
        GeneralController<ExerciseProgramHasExercise, Integer, ExerciseProgramHasExerciseService> {

    public ExerciseProgramHasExerciseController() {
        super(ExerciseProgramHasExerciseService.class);
    }

}
