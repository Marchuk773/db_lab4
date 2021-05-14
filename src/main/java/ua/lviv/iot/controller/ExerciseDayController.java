package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.ExerciseDay;
import ua.lviv.iot.service.ExerciseDayService;
import ua.lviv.iot.service.ServiceInterface;

@RestController
@RequestMapping("/exercise_day")
public class ExerciseDayController extends GeneralController<ExerciseDay, Integer> {

    @Autowired
    ExerciseDayService exerciseDayService;

    @Override
    public ServiceInterface<ExerciseDay, Integer> getService() {
        return exerciseDayService;
    }

}
