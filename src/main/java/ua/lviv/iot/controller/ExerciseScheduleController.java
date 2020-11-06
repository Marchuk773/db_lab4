package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.ExerciseSchedule;
import ua.lviv.iot.service.ExerciseScheduleService;

public class ExerciseScheduleController
        extends GeneralController<ExerciseSchedule, Integer, ExerciseScheduleService> {

    public ExerciseScheduleController() {
        super(ExerciseScheduleService.class);
    }

}
