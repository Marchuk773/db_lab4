package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Table;
import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import java.sql.Date;

@Table(name = "exercise_schedule")
public class ExerciseSchedule {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "exercise_day_id")
    private Integer exerciseDayId;

    @Column(name = "appointment_date")
    private Date appointmentDate;

    @Column(name = "ending_date")
    private Date endingDate;

    public ExerciseSchedule() {
    }

    public ExerciseSchedule(Integer userId, Integer exerciseDayId, String appointmentDate,
            String endingDate) {
        this(-1, userId, exerciseDayId, appointmentDate, endingDate);
    }

    public ExerciseSchedule(Integer id, Integer userId, Integer exerciseDayId,
            String appointmentDate, String endingDate) {
        this.id = id;
        this.userId = userId;
        this.exerciseDayId = exerciseDayId;
        this.appointmentDate = Date.valueOf(appointmentDate);
        this.endingDate = Date.valueOf(endingDate);
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getExerciseDayId() {
        return exerciseDayId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setExerciseDayId(Integer exerciseDayId) {
        this.exerciseDayId = exerciseDayId;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

    @Override
    public String toString() {
        return "ExerciseSchedule [id=" + id + ", userId=" + userId + ", exerciseDayId="
                + exerciseDayId + ", appointmentDate=" + appointmentDate + ", endingDate="
                + endingDate + "]";
    }

}
