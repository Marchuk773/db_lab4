package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.Abonement;
import ua.lviv.iot.service.AbonementService;

public class AbonementController extends GeneralController<Abonement, Integer, AbonementService> {

    public AbonementController() {
        super(AbonementService.class);
    }

}
