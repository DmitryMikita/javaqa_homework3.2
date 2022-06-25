public class BmiService {
    public int calculate(int weight, double height) {

        int bodyMassIndex;
        bodyMassIndex = (int) (((weight * 10000) / Math.pow(height,2)));
        return bodyMassIndex;
    }
}
