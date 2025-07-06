import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int ch, val, top, x, i;

        top = -1;

        System.out.println("\n\n********STACK OPERATIONS******");

        while (true) {
            System.out.println("\n1. PUSH\n2. POP\n3. DISPLAY\n4. EXIT");
            System.out.print("\nEnter your Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    if (top == 9) {
                        System.out.println("\nSTACK OVERFLOW");
                    } else {
                        System.out.print("\nEnter the value to be inserted: ");
                        val = sc.nextInt();
                        top++;
                        a[top] = val;
                        System.out.println("\nElement Inserted…!");
                    }
                    break;

                case 2:
                    if (top == -1) {
                        System.out.println("\nSTACK UNDERFLOW…SORRY !");
                    } else {
                        x = a[top];
                        top--;
                        System.out.println("\nPopped value = " + x);
                    }
                    break;

                case 3:
                    if (top == -1) {
                        System.out.println("\nStack Underflow…!");
                    } else {
                        System.out.println("\nElements of the Stack:");
                        for (i = top; i >= 0; i--) {
                            System.out.println(a[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nPlease enter a valid option");
                    break;
            }
        }
    }
}