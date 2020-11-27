package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.Trainer;
import ua.lviv.iot.service.ServiceInterface;
import ua.lviv.iot.service.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainerController extends GeneralController<Trainer, Integer> {

    @Autowired
    TrainerService trainerService;

    @Override
    public ServiceInterface<Trainer, Integer> getService() {
        return trainerService;
    }

}
