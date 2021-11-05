package softuni.exam24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import softuni.exam24.model.entity.Ship;
import softuni.exam24.model.view.ShipViewModel;

import java.util.Collection;
import java.util.List;

@Repository
public interface ShipRepository extends JpaRepository<Ship,Long> {

    List<Ship> findAllByOrderById();

    @Query("select s from Ship s where not(s.user.id=:id)")
    List<Ship> findAllWhereNotMine(Long id);

    @Query("select s from Ship s where (s.user.id=:id)")
    Collection<Object> findAllWhereMine(Long id);
}
