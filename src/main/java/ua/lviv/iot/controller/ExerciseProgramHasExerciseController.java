package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.ExerciseProgramHasExercise;
import ua.lviv.iot.service.ExerciseProgramHasExerciseService;
import ua.lviv.iot.service.ServiceInterface;

@RestController
@RequestMapping("/exercise_program_has_exercise")
public class ExerciseProgramHasExerciseController
        extends GeneralController<ExerciseProgramHasExercise, Integer> {

    @Autowired
    ExerciseProgramHasExerciseService exerciseProgramHasExerciseService;

    @Override
    public ServiceInterface<ExerciseProgramHasExercise, Integer> getService() {
        return exerciseProgramHasExerciseService;
    }

}
