package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.ExerciseDay;
import ua.lviv.iot.service.ExerciseDayService;

public class ExerciseDayController
        extends GeneralController<ExerciseDay, Integer, ExerciseDayService> {

    public ExerciseDayController() {
        super(ExerciseDayService.class);
    }

}
