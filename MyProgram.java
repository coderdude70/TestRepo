import java.util.Scanner;

package TestRepo;
public class MyProgram {

    public static void main (String args[]) {
        System.out.print("input your name: ");
        Scanner input = new Scanner(System.in);

        System.out.printf("Hello, %s/n", input.nextLine());


    }

}