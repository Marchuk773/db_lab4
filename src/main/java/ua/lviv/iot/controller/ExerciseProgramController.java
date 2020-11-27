package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.ExerciseProgram;
import ua.lviv.iot.service.ExerciseProgramService;
import ua.lviv.iot.service.ServiceInterface;

@RestController
@RequestMapping("/exercise_program")
public class ExerciseProgramController extends GeneralController<ExerciseProgram, Integer> {

    @Autowired
    ExerciseProgramService exerciseProgramService;

    @Override
    public ServiceInterface<ExerciseProgram, Integer> getService() {
        return exerciseProgramService;
    }

}
