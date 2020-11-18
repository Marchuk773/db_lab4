package ua.lviv.iot.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Abonement")
@Table(name = "Abonement", schema = "gym", catalog = "")
public class Abonement {

    @Id
    @Column
    private Integer id;

    @Column
    private Integer price;

    @Column
    private String name;

    public Abonement() {
    }

    public Abonement(Integer price, String name) {
        this(-1, price, name);
    }

    public Abonement(Integer id, Integer price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Abonement [id=" + id + ", price=" + price + ", name=" + name + "]";
    }
}
