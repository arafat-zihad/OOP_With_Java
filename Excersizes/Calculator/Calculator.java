/* 2. Create a class Calculator with the following methods:
calculateSum(int number1, int number2) to calculate the sum of two numbers.
calculateDifference(int number1, int number2) to calculate the difference between two numbers. */

public class Calculator{
    void calculateSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println(sum);
    }
    void calculateDiff(int num1, int num2){
        int diff = num1 - num2;
        System.out.println(diff);
    }

    public static void main(String[] args) {
    Calculator obj = new Calculator();
    obj.calculateSum(2, 2);
    obj.calculateDiff(5, 3);
    }
    
}