package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.annotation.Table;
import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;

@Table(name = "abonement")
public class Abonement {

    @PrimaryKey
    @Column(name = "id")
    private Integer id;

    @Column(name = "price")
    private Integer price;

    @Column(name = "name", length = 45)
    private String name;

    public Abonement() {
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
