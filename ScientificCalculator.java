import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Sine");
            System.out.println("7. Cosine");
            System.out.println("8. Tangent");
            System.out.println("0. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }
            
            double result = 0.0;
            
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double addNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double addNum2 = scanner.nextDouble();
                    result = addNum1 + addNum2;
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    double subNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double subNum2 = scanner.nextDouble();
                    result = subNum1 - subNum2;
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    double mulNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double mulNum2 = scanner.nextDouble();
                    result = mulNum1 * mulNum2;
                    break;
                case 4:
                    System.out.print("Enter numerator: ");
                    double divNum1 = scanner.nextDouble();
                    System.out.print("Enter denominator: ");
                    double divNum2 = scanner.nextDouble();
                    if (divNum2 != 0) {
                        result = divNum1 / divNum2;
                    } else {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    double sqrtNum = scanner.nextDouble();
                    if (sqrtNum >= 0) {
                        result = Math.sqrt(sqrtNum);
                    } else {
                        System.out.println("Error: Invalid input for square root");
                        continue;
                    }
                    break;
                case 6:
                    System.out.print("Enter an angle in degrees: ");
                    double angle = scanner.nextDouble();
                    result = Math.sin(Math.toRadians(angle));
                    break;
                case 7:
                    System.out.print("Enter an angle in degrees: ");
                    angle = scanner.nextDouble();
                    result = Math.cos(Math.toRadians(angle));
                    break;
                case 8:
                    System.out.print("Enter an angle in degrees: ");
                    angle = scanner.nextDouble();
                    result = Math.tan(Math.toRadians(angle));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
            
            System.out.println("Result: " + result);
        }
        
        scanner.close();
    }
}
