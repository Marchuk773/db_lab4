package ua.lviv.iot.service;

import ua.lviv.iot.DAO.ExerciseDAOImp;
import ua.lviv.iot.model.entity.Exercise;

public class ExerciseService extends GeneralService<Exercise, Integer, ExerciseDAOImp> {

    public ExerciseService() {
        super(ExerciseDAOImp.class);
    }

}
