public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 67; //кг
        double height = 170; //см
        int bodyMassIndex = service.calculate(weight, height);

        System.out.println("Индекс массы тела:" + bodyMassIndex + " " + "кг/м2");
    }
}
