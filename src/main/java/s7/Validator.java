package s7;

public interface Validator<T> {
    boolean isValid(T obj);
}
