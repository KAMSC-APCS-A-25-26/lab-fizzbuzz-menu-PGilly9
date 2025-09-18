import java.util.Scanner;
// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class FizzBuzzMenu {
    public static void main(String[] args) {
        // Your implementation here
        Scanner scan = new Scanner(System.in);
        boolean run = true;

        while (run) {

            System.out.println("\n");
            System.out.println("--- FizzBuzz Menu ----");
            System.out.println("1. Fizz: Multiples of 3");
            System.out.println("2. Buzz: Multiples of 5");
            System.out.println("3. FizzBuzz; Multiples of 15");
            System.out.println("4. Exit");
            System.out.print("Please enter a choice:  ");
            int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        for (int j = 1; j < 101; j++) {
                            if (j % 3 == 0) {
                                System.out.print(j + " ");
                            }
                        }
                        break;
                    case 2:
                        for (int j = 1; j < 101; j++) {
                            if (j % 5 == 0) {
                                System.out.print(j + " ");
                            }
                        }
                        break;

                    case 3:
                        for (int j = 1; j < 101; j++) {
                            if (j % 15 == 0) {
                                System.out.print(j + " ");
                            }
                        }
                        break;
                    case 4:
                        run = false;
                        System.out.println("Goodbye");
                        break;
            }
        }
    }
}

