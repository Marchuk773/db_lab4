package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.Abonement;
import ua.lviv.iot.service.AbonementService;
import ua.lviv.iot.service.ServiceInterface;

@RestController
@RequestMapping("/abonement")
public class AbonementController extends GeneralController<Abonement, Integer> {

    @Autowired
    AbonementService abonementService;

    @Override
    public ServiceInterface<Abonement, Integer> getService() {
        return abonementService;
    }

}
