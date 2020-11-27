package ua.lviv.iot.service;

import ua.lviv.iot.dataaccess.ExerciseScheduleRepository;
import ua.lviv.iot.domain.ExerciseSchedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ExerciseScheduleService extends GeneralService<ExerciseSchedule, Integer> {

    @Autowired
    ExerciseScheduleRepository exerciseScheduleRepository;

    @Override
    public JpaRepository<ExerciseSchedule, Integer> getRepository() {
        return exerciseScheduleRepository;
    }

}
