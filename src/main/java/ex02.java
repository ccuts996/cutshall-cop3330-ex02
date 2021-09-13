import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("What is input string?");

        name=input.next();

        int count=0;

        for (int i= 0; i<name.length(); i++)
        {
            if (name.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println(name+ " has "+ count + " characters.");
    }
}
