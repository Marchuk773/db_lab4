package ua.lviv.iot.dataaccess;

import ua.lviv.iot.domain.ExerciseProgram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseProgramRepository extends JpaRepository<ExerciseProgram, Integer> {

}
