package ua.lviv.iot.service;

import ua.lviv.iot.DAO.ExerciseProgramDAOImp;
import ua.lviv.iot.model.entity.ExerciseProgram;

public class ExerciseProgramService
        extends GeneralService<ExerciseProgram, Integer, ExerciseProgramDAOImp> {

    public ExerciseProgramService() {
        super(ExerciseProgramDAOImp.class);
    }

}
