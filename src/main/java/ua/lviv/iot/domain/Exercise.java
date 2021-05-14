package ua.lviv.iot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Exercise")
@Table(name = "Exercise", schema = "gym", catalog = "")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "duration_in_minutes")
    private Double durationInMinutes;

    @Column(name = "muscle_group")
    private String muscleGroup;

    @Column(name = "repeats_quantity")
    private Integer repeatsQuantity;

    @Column(name = "burned_calories")
    private Integer burnedCalories;

    public Exercise() {
    }

    public Exercise(String name, Double durationInMinutes, String muscleGroup,
            Integer repeatsQuantity, Integer burnedCalories) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.muscleGroup = muscleGroup;
        this.repeatsQuantity = repeatsQuantity;
        this.burnedCalories = burnedCalories;
    }

    public Exercise(Integer id, String name, Double durationInMinutes, String muscleGroup,
            Integer repeatsQuantity, Integer burnedCalories) {
        this.id = id;
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.muscleGroup = muscleGroup;
        this.repeatsQuantity = repeatsQuantity;
        this.burnedCalories = burnedCalories;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getDurationInMinutes() {
        return durationInMinutes;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public Integer getRepeatsQuantity() {
        return repeatsQuantity;
    }

    public Integer getBurnedCalories() {
        return burnedCalories;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDurationInMinutes(Double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public void setRepeatsQuantity(Integer repeatsQuantity) {
        this.repeatsQuantity = repeatsQuantity;
    }

    public void setBurnedCalories(Integer burnedCalories) {
        this.burnedCalories = burnedCalories;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((burnedCalories == null) ? 0 : burnedCalories.hashCode());
        result = prime * result + ((durationInMinutes == null) ? 0 : durationInMinutes.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((muscleGroup == null) ? 0 : muscleGroup.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((repeatsQuantity == null) ? 0 : repeatsQuantity.hashCode());
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
        Exercise other = (Exercise) obj;
        if (burnedCalories == null) {
            if (other.burnedCalories != null)
                return false;
        } else if (!burnedCalories.equals(other.burnedCalories))
            return false;
        if (durationInMinutes == null) {
            if (other.durationInMinutes != null)
                return false;
        } else if (!durationInMinutes.equals(other.durationInMinutes))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (muscleGroup == null) {
            if (other.muscleGroup != null)
                return false;
        } else if (!muscleGroup.equals(other.muscleGroup))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (repeatsQuantity == null) {
            if (other.repeatsQuantity != null)
                return false;
        } else if (!repeatsQuantity.equals(other.repeatsQuantity))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Exercise [id=" + id + ", name=" + name + ", durationInMinutes=" + durationInMinutes
                + ", muscleGroup=" + muscleGroup + ", repeatsQuantity=" + repeatsQuantity
                + ", burnedCalories=" + burnedCalories + "]\n";
    }

}
