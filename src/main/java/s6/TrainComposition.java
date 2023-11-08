package s6;

public class TrainComposition {
    private final TrainCarriage[] trainCarriage;

    public TrainComposition(TrainCarriage[] trainCarriage) {
        this.trainCarriage = trainCarriage;
    }

    void getWeight() {
        int result = 0;
        int resultMaxLoad = 0;
        for (TrainCarriage t : this.trainCarriage) {
            result += t.getWeight();
            resultMaxLoad += t.getMaxLoad();
        }
        resultMaxLoad /= trainCarriage.length;
        System.out.println("Масса всего состава = " + result);
        System.out.println("Средняя грузовместимость на вагон состава = " + resultMaxLoad);
    }
}
