import java.util.Scanner;
public class Hello {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        String name;
        int age;
        String home;

        System.out.print("Hello. What is your name? ");
        name = scnr.next();
        System.out.print("It's nice to meet you, " + name + ". How old are you? ");
        age = scnr.nextInt();
        System.out.println("I see that you are still quite young at only " + age + ".");
        System.out.print("Where do you live? ");
        home = scnr.next();
        System.out.println("Wow! I've always wanted to go to " + home + ". Thanks for chatting with me. Bye!");
        scnr.close();
    }
}
