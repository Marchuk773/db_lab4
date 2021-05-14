package ua.lviv.iot.service;

import ua.lviv.iot.dataaccess.AbonementRepository;
import ua.lviv.iot.domain.Abonement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AbonementService extends GeneralService<Abonement, Integer> {

    @Autowired
    private AbonementRepository abonementRepository;

    @Override
    public JpaRepository<Abonement, Integer> getRepository() {
        return abonementRepository;
    }

}
