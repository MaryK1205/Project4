public class Main {
    public static void main(String[] args) {
        CredCalculator service = new CredCalculator();
        System.out.println(service.calculate(1000000, 9.99, 1));
        System.out.println(service.calculate(1000000, 9.99, 2));
        System.out.println(service.calculate(1000000, 9.99, 3));
    }
}