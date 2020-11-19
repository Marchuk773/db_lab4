package ua.lviv.iot.service;

import ua.lviv.iot.DAO.ExerciseProgramHasExerciseDAOImp;
import ua.lviv.iot.model.entity.ExerciseProgramHasExercise;

public class ExerciseProgramHasExerciseService extends
        GeneralService<ExerciseProgramHasExercise, Integer, ExerciseProgramHasExerciseDAOImp> {

    public ExerciseProgramHasExerciseService() {
        super(ExerciseProgramHasExerciseDAOImp.class);
    }

}
