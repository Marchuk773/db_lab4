package ua.lviv.iot.domain;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "ExerciseSchedule")
@Table(name = "Exercise_schedule", schema = "gym", catalog = "")
public class ExerciseSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "person_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "exercise_day_id")
    private ExerciseDay exerciseDay;

    @Column(name = "appointment_date")
    private Date appointmentDate;

    @Column(name = "ending_date")
    private Date endingDate;

    public ExerciseSchedule() {
    }

    public ExerciseSchedule(User user, ExerciseDay exerciseDay, String appointmentDate,
            String endingDate) {
        this.user = user;
        this.exerciseDay = exerciseDay;
        this.appointmentDate = Date.valueOf(appointmentDate);
        this.endingDate = Date.valueOf(endingDate);
    }

    public ExerciseSchedule(Integer id, User user, ExerciseDay exerciseDay, String appointmentDate,
            String endingDate) {
        this.id = id;
        this.user = user;
        this.exerciseDay = exerciseDay;
        this.appointmentDate = Date.valueOf(appointmentDate);
        this.endingDate = Date.valueOf(endingDate);
    }

    public Integer getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public ExerciseDay getExerciseDay() {
        return exerciseDay;
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

    public void setUser(User user) {
        this.user = user;
    }

    public void setExerciseDay(ExerciseDay exerciseDay) {
        this.exerciseDay = exerciseDay;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((appointmentDate == null) ? 0 : appointmentDate.hashCode());
        result = prime * result + ((endingDate == null) ? 0 : endingDate.hashCode());
        result = prime * result + ((exerciseDay == null) ? 0 : exerciseDay.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((user == null) ? 0 : user.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ExerciseSchedule other = (ExerciseSchedule) obj;
        if (appointmentDate == null) {
            if (other.appointmentDate != null)
                return false;
        } else if (!appointmentDate.equals(other.appointmentDate))
            return false;
        if (endingDate == null) {
            if (other.endingDate != null)
                return false;
        } else if (!endingDate.equals(other.endingDate))
            return false;
        if (exerciseDay == null) {
            if (other.exerciseDay != null)
                return false;
        } else if (!exerciseDay.equals(other.exerciseDay))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (user == null) {
            if (other.user != null)
                return false;
        } else if (!user.equals(other.user))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ExerciseSchedule [id=" + id + ", user=" + user + ", exerciseDay=" + exerciseDay
                + ", appointmentDate=" + appointmentDate + ", endingDate=" + endingDate + "]\n";
    }

}