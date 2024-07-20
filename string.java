import java.util.Scanner;

public class string {
    public static void printChar(String name) {
        for(int i = 0; i<name.length(); i++){
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        //string declaration
        // String name = "satyabrata pradhan";
        // String name2 = new String("sonu");
        // System.out.println(name);
        // System.out.println(name2);

        //input &  output
        //(input single word)
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter your name");
        // String name = sc.next();
        // System.out.println(name);

        //(input total line)
        // Scanner sc1 = new Scanner(System.in);
        // System.out.println("enter your name2");
        // String name2 = sc1.nextLine();
        // System.out.println(name2);


        //string length

        // String name = "satyabrata pradhan";
        // System.out.println(name.length());

        //string concatenate

        // String  fistName = "satyabrata";
        // String lastName = "pradhan";
        // String fullName = fistName + " " + lastName;
        // System.out.println(fullName);

        //string charAt Method

        String name = "satyabrata pradhan";
        // System.out.println(name.charAt(0));
        printChar(name);

    }
}