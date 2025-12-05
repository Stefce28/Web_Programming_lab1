package mk.ukim.finki.lab1.service;

import mk.ukim.finki.lab1.model.Dish;
import mk.ukim.finki.lab1.repository.InMemoryDishRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DishServiceImpl implements DishService {

    private final InMemoryDishRepository dishRepository;
    public DishServiceImpl(InMemoryDishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @Override
    public List<Dish> listDishes() {
        return dishRepository.findAll();
    }

    @Override
    public Dish findByDishId(String dishId) {
        if(dishId == null) return null;
        return dishRepository.findByDishId(dishId);
    }

    @Override
    public Dish findById(Long id) {
        if(id == null) return null;
        return dishRepository.findById(id).orElse(null);
    }

    @Override
    public Dish create(String dishId, String name, String cuisine, int preparationTime) {
        Dish dish = new Dish(dishId, name, cuisine, preparationTime);
        return dishRepository.save(dish);

    }

    @Override
    public Dish update(Long id, String dishId, String name, String cuisine, int preparationTime) {
        Dish d = findById(id);
        d.setName(name);
        d.setCuisine(cuisine);
        d.setPreparationTime(preparationTime);
        d.setDishId(dishId);
        return dishRepository.save(d);
    }

    @Override
    public void delete(Long id) {
        dishRepository.deleteById(id);
    }
}
