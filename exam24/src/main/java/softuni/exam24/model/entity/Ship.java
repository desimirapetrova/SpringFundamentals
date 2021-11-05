package softuni.exam24.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@Table(name = "ships")
public class Ship extends BaseEntity{
    @Column(nullable = false)
    private LocalDate created;
    @Column(nullable = false)
    private Long health;
    @Column(nullable = false,unique = true)
    private String name;
    @Column(nullable = false)
    private Long power;
    @ManyToOne
    private Category category;
    @ManyToOne
    private User user;

    public Ship() {
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
