package ua.lviv.iot.service;

import ua.lviv.iot.dataaccess.ExerciseProgramRepository;
import ua.lviv.iot.domain.ExerciseProgram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ExerciseProgramService extends GeneralService<ExerciseProgram, Integer> {

    @Autowired
    ExerciseProgramRepository exerciseProgramRepository;

    @Override
    public JpaRepository<ExerciseProgram, Integer> getRepository() {
        return exerciseProgramRepository;
    }

}
