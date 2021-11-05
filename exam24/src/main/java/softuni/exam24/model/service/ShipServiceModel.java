package softuni.exam24.model.service;

import softuni.exam24.model.entity.Category;
import softuni.exam24.model.entity.User;
import softuni.exam24.model.entity.enums.CategoryEnum;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class ShipServiceModel {
    private Long id;
    private LocalDate created;
    private Long health;
    private String name;
    private Long power;
    private CategoryEnum category;
    private User user;

    public ShipServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public Long getHealth() {
        return health;
    }

    public void setHealth(Long health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
