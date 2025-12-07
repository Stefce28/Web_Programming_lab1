package mk.ukim.finki.lab1.repository;

import mk.ukim.finki.lab1.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {

    Dish findByDishId(String dishId);
    List<Dish> findAllByChef_Id(Long chefId);
}
