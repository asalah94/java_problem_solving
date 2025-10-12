package learning.FunctionProgramming;

public class AddNumbersExample {
    public static void main(String[] args) {
        // Lambda expression to add three numbers
        AddThreeNumbers addThreeNumbers = (a,b,c) -> a+b+c;

        // Call the method
        int result = addThreeNumbers.add(10, 20, 30);

        System.out.println("The sum is: " + result);
    }
}

