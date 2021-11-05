package softuni.exam24.model.binding;

import org.springframework.format.annotation.DateTimeFormat;
import softuni.exam24.model.entity.Category;
import softuni.exam24.model.entity.enums.CategoryEnum;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class ShipAddBindingModel {
    @Size(min = 2,max = 10,message = "The name must be between 2 and 10 characters.")
    private String name;
    @Positive(message = "The power must be positive.")
    @NotNull
    private Long power;
    @Positive(message = "The health must be positive.")
    @NotNull
    private Long health;
    @PastOrPresent(message = "Created date cannot e in the future.")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate created;
    @NotNull(message = "You must select the category.")
    private CategoryEnum category;

    public ShipAddBindingModel() {
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

    public Long getHealth() {
        return health;
    }

    public void setHealth(Long health) {
        this.health = health;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }
}
