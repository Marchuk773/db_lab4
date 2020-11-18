package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.ExerciseProgram;
import ua.lviv.iot.service.ExerciseProgramService;

public class ExerciseProgramController
        extends GeneralController<ExerciseProgram, Integer, ExerciseProgramService> {

    public ExerciseProgramController() {
        super(ExerciseProgramService.class);
    }

}
