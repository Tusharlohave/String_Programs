package String_Programs;
import java.util.Scanner;
public class Remove_White_Spaces {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string with white spaces");
        String s1 = sc.nextLine();
        String s2 = s1.replace(" ", "");

        System.out.println(s2);
    }
}
