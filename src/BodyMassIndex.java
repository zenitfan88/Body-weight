public class BodyMassIndex {
    public double calculate(int weight, double height) {
        double index = weight / (height * height);
        return index;
    }
}
