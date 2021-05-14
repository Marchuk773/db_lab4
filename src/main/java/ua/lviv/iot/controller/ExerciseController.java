package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.Exercise;
import ua.lviv.iot.service.ExerciseService;
import ua.lviv.iot.service.ServiceInterface;

@RestController
@RequestMapping("/exercise")
public class ExerciseController extends GeneralController<Exercise, Integer> {

    @Autowired
    ExerciseService exerciseService;

    @Override
    public ServiceInterface<Exercise, Integer> getService() {
        return exerciseService;
    }

}
