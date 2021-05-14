package ua.lviv.iot.dataaccess;

import ua.lviv.iot.domain.ExerciseDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseDayRepository extends JpaRepository<ExerciseDay, Integer> {

}
