package softuni.exam24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.exam24.model.entity.Category;
import softuni.exam24.model.entity.enums.CategoryEnum;

import java.util.Optional;

@Repository
public interface CategoryRepository  extends JpaRepository<Category,Long> {
    Optional<Category> findByName(CategoryEnum category);
}
