package softuni.exam24.service;

import softuni.exam24.model.entity.Category;
import softuni.exam24.model.entity.enums.CategoryEnum;

import java.util.List;

public interface CategoryService {
    void initCategories();

    Category findByCategoryEnum(CategoryEnum category);
}
