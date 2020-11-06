package ua.lviv.iot.service;

import ua.lviv.iot.DAO.ExerciseScheduleDAOImp;
import ua.lviv.iot.model.entity.ExerciseSchedule;

public class ExerciseScheduleService
        extends GeneralService<ExerciseSchedule, Integer, ExerciseScheduleDAOImp> {

    public ExerciseScheduleService() {
        super(ExerciseScheduleDAOImp.class);
    }

}
