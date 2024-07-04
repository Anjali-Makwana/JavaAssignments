package module_2_string;

import java.util.Scanner;

public class P03_SeriesProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n + n * n + n * n * n);
    }
}