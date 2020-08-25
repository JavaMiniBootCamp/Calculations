import java.util.*;


public class Main {

    public static void main(String[] args) {

        int a, b ;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        a = scan.nextInt();
        System.out.println("Enter another number:");
        b = scan.nextInt();
        System.out.println("Sum :" + (a+b));
        System.out.println("Product :" + (a*b));

        System.out.println("Enter a number:");
        double square = scan.nextDouble();
        System.out.println("Square :" + Math.pow(square,2));
        scan.nextLine();

        System.out.println("Enter something:");
        String line1 = scan.nextLine();
        System.out.println("Enter something again:");
        String line2 = scan.nextLine();
        System.out.println(line1 + " " + line2);
    }
}
