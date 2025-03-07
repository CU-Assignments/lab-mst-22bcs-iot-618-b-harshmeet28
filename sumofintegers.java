import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfIntegers{

    public static Integer parseStringToInteger(String str){
        return Integer.parseInt(str);
    }
    public static int calculateSum(List<Integer> numbers){
        int sum = 0;
        for (Integer number:numbers){
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter integers (type 'done' to finish):");
        while (true){
            String input=scanner.nextLine();
            if (input.equalsIgnoreCase("done")){
                break;
            }
            try{
                Integer number=parseStringToInteger(input);
                numbers.add(number);
            } catch (NumberFormatException e){
                System.out.println("Please enter a valid integer.");
            }
        }
        int sum=calculateSum(numbers);
        System.out.println("The sum of the entered integers is: " + sum);
        scanner.close();
    }
}