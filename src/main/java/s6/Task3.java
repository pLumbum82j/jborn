package s6;

/**
 * Агрегирование.  Написать класс Железнодорожного состава (группа сцепленных между собой вагонов),
 * переиспользуя класс Вагона. Вагон характеризуется грузовместимостью (масса, тонна).
 * Класс Железнодорожного состава должен предоставлять информацию об общей грузовместимости и средней грузовместимости на вагон.
 */
public class Task3 {
    public static void main(String[] args) {
        TrainCarriage trainCarriage1 = new TrainCarriage(100, 700);
        TrainCarriage trainCarriage2 = new TrainCarriage(200, 1000);
        TrainCarriage trainCarriage3 = new TrainCarriage(300, 355);
        TrainCarriage trainCarriage4 = new TrainCarriage(400, 1000);

        TrainCarriage[] trainCarriages = new TrainCarriage[4];
        trainCarriages[0] = trainCarriage1;
        trainCarriages[1] = trainCarriage2;
        trainCarriages[2] = trainCarriage3;
        trainCarriages[3] = trainCarriage4;

        TrainComposition  trainCompositions = new TrainComposition(trainCarriages);
        trainCompositions.getWeight();

    }
}
