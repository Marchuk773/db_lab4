package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.Trainer;
import ua.lviv.iot.service.TrainerService;

public class TrainerController extends GeneralController<Trainer, Integer, TrainerService> {

    public TrainerController() {
        super(TrainerService.class);
    }

}
