public class SeriesCalculator{
    void calculateSum(int n){
        int a = 1, d = 2;
        int Sum = (n * (2 * a + (n - 1) * d)) / 2;
        System.out.println(Sum);
    }

    public static void main(String[] args) {
        SeriesCalculator obj = new SeriesCalculator();
        obj.calculateSum(5);
    }
}