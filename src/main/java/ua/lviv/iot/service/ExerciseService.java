package ua.lviv.iot.service;

import ua.lviv.iot.dataaccess.ExerciseRepository;
import ua.lviv.iot.domain.Exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService extends GeneralService<Exercise, Integer> {

    @Autowired
    ExerciseRepository exerciseRepository;

    @Override
    public JpaRepository<Exercise, Integer> getRepository() {
        return exerciseRepository;
    }

}
