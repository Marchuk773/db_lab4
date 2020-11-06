package ua.lviv.iot.service;

import ua.lviv.iot.DAO.ExerciseDayDAOImp;
import ua.lviv.iot.model.entity.ExerciseDay;

public class ExerciseDayService extends GeneralService<ExerciseDay, Integer, ExerciseDayDAOImp> {

    public ExerciseDayService() {
        super(ExerciseDayDAOImp.class);
    }

}
