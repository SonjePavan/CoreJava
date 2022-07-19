import java.util.Scanner;

public class SwitchDemo {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter Number");

        int choice = sc.nextInt();

        switch (choice) {


            case 1 :
                System.out.println("hello");
                break;
            default :
                System.out.println("'default");

        }


    }
}
