package ua.lviv.iot.dataaccess;

import ua.lviv.iot.domain.ExerciseProgramHasExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseProgramHasExerciseRepository
        extends JpaRepository<ExerciseProgramHasExercise, Integer> {

}
