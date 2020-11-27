package ua.lviv.iot.service;

import ua.lviv.iot.dataaccess.ExerciseProgramHasExerciseRepository;
import ua.lviv.iot.domain.ExerciseProgramHasExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ExerciseProgramHasExerciseService
        extends GeneralService<ExerciseProgramHasExercise, Integer> {

    @Autowired
    ExerciseProgramHasExerciseRepository exerciseProgramHasExerciseRepository;

    @Override
    public JpaRepository<ExerciseProgramHasExercise, Integer> getRepository() {
        return exerciseProgramHasExerciseRepository;
    }

}
