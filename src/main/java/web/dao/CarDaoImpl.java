package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Repository
public class CarDaoImpl implements CarDao {
    public static List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("Mercedes-Benz", "S-500", "Белый"));
        carList.add(new Car("Mercedes-Benz", "E300", "Черный"));
        carList.add(new Car("BMW", "X5", "Синий Металлик"));
        carList.add(new Car("BMW", "520i", "Белый Перламутр"));
        carList.add(new Car("Tesla", "Model 3", "Белый"));
    }



    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }


}

