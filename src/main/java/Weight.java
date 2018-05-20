public class Weight {

    public double idealMan(double height) {
        double idealWeightMan = (height - 100) * 1.15;
        return idealWeightMan;
    }

    public double idealWoman(double height) {
        double idealWeightWoman = (height - 110) * 1.15;
        return idealWeightWoman;
    }

}
