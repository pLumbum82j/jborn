package s7;

public class Compare<T extends Number, K extends Number> {
    int compare(T first, K second) {
        if (first.intValue() > second.intValue()){
            return 1;
        } else if (first.intValue() < second.intValue()) {
            return -1;
        } else{
            return 0;
        }
    }
}
