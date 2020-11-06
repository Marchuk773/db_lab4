package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.Exercise;
import ua.lviv.iot.service.ExerciseService;

public class ExerciseController extends GeneralController<Exercise, Integer, ExerciseService> {

    public ExerciseController() {
        super(ExerciseService.class);
    }

}
