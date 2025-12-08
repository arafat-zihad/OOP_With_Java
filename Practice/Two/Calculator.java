public class Calculator
{

    int calculateSum(int number1, int number2){
        return number1 + number2;
    }

    int calculateDifference(int number1, int number2){
        return number1 - number2;
    }

    public static void main(String[] args){
        Calculator obj = new Calculator();

        int sum = obj.calculateSum(4, 2);
        int diff = obj.calculateDifference(4, 2);

        System.out.println(sum);
        System.out.println(diff);
    }
}