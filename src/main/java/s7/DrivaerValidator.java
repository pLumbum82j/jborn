package s7;

import static s7.DriverToConvertCar.MALE;

public class DrivaerValidator implements Validator<Driver> {
    @Override
    public boolean isValid(Driver obj) {
        if (obj == null) return false;
        if (obj.getAge() >= 18 && obj.getSex().equals(MALE)) {
            return true;
        }
        return false;
    }
}
