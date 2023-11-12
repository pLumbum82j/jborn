package s7;

import java.math.BigDecimal;

public class Compare<T extends Number, K extends Number> {
    int compare(T first, K second) {

        if (first.doubleValue() > second.doubleValue()) {
            return 1;
        } else if (first.doubleValue() < second.doubleValue()) {
            return -1;
        } else {
            return 0;
        }
    }
}
