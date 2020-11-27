package ua.lviv.iot.service;

import ua.lviv.iot.dataaccess.ExerciseDayRepository;
import ua.lviv.iot.domain.ExerciseDay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ExerciseDayService extends GeneralService<ExerciseDay, Integer> {

    @Autowired
    ExerciseDayRepository exerciseDayRepository;

    @Override
    public JpaRepository<ExerciseDay, Integer> getRepository() {
        return exerciseDayRepository;
    }

}
