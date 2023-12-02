package s10;

public interface ListJborn<T>{

    public T get(int i);

    public void put(T e);

    public void put(int i, T e);

    public void remove(int i);

    public void remove(T e);

    public int length();
}
