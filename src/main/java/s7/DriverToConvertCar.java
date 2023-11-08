package s7;

public class DriverToConvertCar implements Converter<Car, Driver> {
    public static final String MALE = "MALE";

    @Override
    public Car toConvert(Driver obj) {
        Car car = new Car();
        if (obj == null) return car;
        if (obj.getAge() > 18 && obj.getSex().equals(MALE)) {
            car.setColor("Black");
            car.setEngine("v12");
        } else if (obj.getAge() > 18) {
            car.setColor("Red");
            car.setEngine("v6");
        }
        return car;
    }
}
