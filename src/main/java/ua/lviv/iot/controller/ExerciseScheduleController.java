package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.ExerciseSchedule;
import ua.lviv.iot.service.ExerciseScheduleService;
import ua.lviv.iot.service.ServiceInterface;

@RestController
@RequestMapping("/exercise_schedule")
public class ExerciseScheduleController extends GeneralController<ExerciseSchedule, Integer> {

    @Autowired
    ExerciseScheduleService exerciseScheduleService;

    @Override
    public ServiceInterface<ExerciseSchedule, Integer> getService() {
        return exerciseScheduleService;
    }

}
