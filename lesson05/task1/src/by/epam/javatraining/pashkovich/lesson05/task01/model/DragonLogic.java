package by.epam.javatraining.pashkovich.lesson05.task01.model;

public class DragonLogic {
    final private static int HEAD_IN_CHILD = 3;
    final private static int HEAD_IN_YOUNG = 2;
    final private static int HEAD_IN_OLD = 1;

    final private static int AGE_IN_YOUNG = 200;
    final private static int AGE_IN_OLD = 300;

    final private static int EYES_ON_HEAD = 2;

    public static int countHead(double age) {
        age = Math.floor(age);

        int heads = -1;

        if (age >= 0) {
            heads = HEAD_IN_CHILD;
            if (age <= AGE_IN_YOUNG) {
                heads += age * HEAD_IN_CHILD;
            } else if (age < AGE_IN_OLD) {
                heads += AGE_IN_YOUNG * HEAD_IN_CHILD - AGE_IN_YOUNG * HEAD_IN_YOUNG + HEAD_IN_YOUNG * age;
            } else {
                heads += AGE_IN_YOUNG * HEAD_IN_CHILD + (AGE_IN_OLD - AGE_IN_YOUNG) 
                            * HEAD_IN_YOUNG - AGE_IN_OLD * HEAD_IN_OLD + HEAD_IN_OLD * age;
            }
        }
        return heads;
    }

    public static int countEye(double age) {
        return age > 0 ? countHead(age) * EYES_ON_HEAD : -1;
    }
}
