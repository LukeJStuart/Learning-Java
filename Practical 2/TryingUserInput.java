import java.util.Scanner;

class TryingUserInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String userName = myScanner.nextLine();
        System.out.println("Username is: " + userName);
        System.out.println("Enter age:");
        int age = myScanner.nextInt();
        System.out.println("Age is " + age);
    }
}