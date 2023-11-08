package s7;

public interface Converter<T, K> {
    T toConvert(K obj);
}
