package ua.lviv.iot.service;

import ua.lviv.iot.dataaccess.TrainerRepository;
import ua.lviv.iot.domain.Trainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TrainerService extends GeneralService<Trainer, Integer> {

    @Autowired
    TrainerRepository trainerRepository;

    @Override
    public JpaRepository<Trainer, Integer> getRepository() {
        return trainerRepository;
    }

}
