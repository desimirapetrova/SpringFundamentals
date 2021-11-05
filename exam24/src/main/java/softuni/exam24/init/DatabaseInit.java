package softuni.exam24.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import softuni.exam24.service.CategoryService;

@Component
public class DatabaseInit implements CommandLineRunner {
    private final CategoryService categoryService;

    public DatabaseInit(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @Override
    public void run(String... args) throws Exception {
        categoryService.initCategories();
    }
}
