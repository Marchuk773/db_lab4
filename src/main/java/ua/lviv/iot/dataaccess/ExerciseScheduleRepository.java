package ua.lviv.iot.dataaccess;

import ua.lviv.iot.domain.ExerciseSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseScheduleRepository extends JpaRepository<ExerciseSchedule, Integer> {

}
