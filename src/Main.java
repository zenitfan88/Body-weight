public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        double index = service.calculate(78, 1.7);
        System.out.printf("%.2f", index);
    }
}
