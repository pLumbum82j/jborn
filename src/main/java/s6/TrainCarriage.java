package s6;

public class TrainCarriage {
    private final int weight;
    private final int maxLoad;

    public TrainCarriage(int weight, int maxLoad) {
        this.weight = weight;
        this.maxLoad = maxLoad;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxLoad() {
        return maxLoad;
    }
}
