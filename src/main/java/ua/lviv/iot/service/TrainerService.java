package ua.lviv.iot.service;

import ua.lviv.iot.DAO.TrainerDAOImp;
import ua.lviv.iot.model.entity.Trainer;

public class TrainerService extends GeneralService<Trainer, Integer, TrainerDAOImp> {

    public TrainerService() {
        super(TrainerDAOImp.class);
    }

}
