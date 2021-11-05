package softuni.exam24.service.impl;

import org.springframework.stereotype.Service;
import softuni.exam24.model.entity.Category;
import softuni.exam24.model.entity.enums.CategoryEnum;
import softuni.exam24.repository.CategoryRepository;
import softuni.exam24.service.CategoryService;

import java.util.Arrays;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void initCategories() {
        if(categoryRepository.count()!=0){
            return;
        }
        Arrays.stream(CategoryEnum.values())
                .forEach(categoryEnum -> {
                    Category category=new Category();
                    category.setName(categoryEnum);
                    categoryRepository.save(category);
                });
    }

    @Override
    public Category findByCategoryEnum(CategoryEnum category) {
        return categoryRepository.findByName(category).orElse(null);
    }
}
