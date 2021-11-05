package softuni.exam24.model.entity;

import softuni.exam24.model.entity.enums.CategoryEnum;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {
    private String description;
    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false,unique = true)
    private CategoryEnum name;

    public Category() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryEnum getName() {
        return name;
    }

    public void setName(CategoryEnum name) {
        this.name = name;
    }
}
