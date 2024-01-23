
import java.util.Scanner;
public class Reverse_String {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid String: ");
       String s1 = sc.nextLine();
       char [] arr = s1.toCharArray();
        for(int i=arr.length-1; i>=0;i--){
            System.out.print(arr[i]);
        }

    }
}
