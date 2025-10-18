package vscode;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: "); // Prompt the user for input
        String str = sc.nextLine();
        System.out.println("You entered: " + str);
        sc.close();
    }
}
