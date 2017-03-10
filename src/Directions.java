public class Directions {
    static int stepNum;
    static String direction;

    public Directions(int stepNum,String direction) {
        this.stepNum=stepNum;
        this.direction=direction;
    }

    public static int getStepNum() {
        return stepNum;
    }

    public static void setStepNum(int stepNum) {
        Directions.stepNum = stepNum;
    }

    public static String getDirection() {
        return direction;
    }

    public static void setDirection(String direction) {
        Directions.direction = direction;
    }
}
