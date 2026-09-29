
package Arrays;

import java.util.*;

public class ArraysCC {
    public static void main(String[] args) {
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();

        sc.close();

        System.out.println("Marks are: ");
        System.out
                .println(marks[0] + " " + marks[1] + " " + marks[2] + " " + marks[3] + " " + marks[4]);

        int percentage = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5;

        System.out.println("Percentage is: " + percentage);

    }
}
