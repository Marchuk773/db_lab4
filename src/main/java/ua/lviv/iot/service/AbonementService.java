package ua.lviv.iot.service;

import ua.lviv.iot.DAO.AbonementDAOImp;
import ua.lviv.iot.model.entity.Abonement;

public class AbonementService extends GeneralService<Abonement, Integer, AbonementDAOImp> {

    public AbonementService() {
        super(AbonementDAOImp.class);
    }

}
