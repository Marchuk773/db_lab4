package ua.lviv.iot.dataaccess;

import ua.lviv.iot.domain.Abonement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonementRepository extends JpaRepository<Abonement, Integer> {

}
