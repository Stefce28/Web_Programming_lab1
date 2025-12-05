package mk.ukim.finki.lab1.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.lab1.model.Chef;
import mk.ukim.finki.lab1.model.Dish;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Dish> dishes = null;
    public static List<Chef> chefs = null;

    @PostConstruct
    public void init(){
        dishes = new ArrayList<>();
        chefs = new ArrayList<>();
        dishes.add(new Dish("1","Cesar Salad","Salad", 4));
        dishes.add(new Dish("2","Benedict","Egg Toast", 5));
        dishes.add(new Dish("3","Lasagna","Italian", 9));
        dishes.add(new Dish("4","ChickenParm","Meat", 12));
        dishes.add(new Dish("5","Wok","Asian", 69));

        chefs.add(new Chef(1L,"Stefan","Sotirovski","2 years experience",new ArrayList<>(dishes)));
        chefs.add(new Chef(2L,"Filip","Stoilkov","1 years experience",new ArrayList<>(dishes)));
        chefs.add(new Chef(3L,"Damjan","Manojlovski","13 years experience",new ArrayList<>(dishes)));
        chefs.add(new Chef(4L,"Maja","Sotirovska","5 years experience",new ArrayList<>(dishes)));
        chefs.add(new Chef(5L,"Andrea","Manasievska","3 years experience",new ArrayList<>(dishes)));

    }

}
