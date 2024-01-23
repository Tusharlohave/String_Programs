// Write a java Program to Sort the given string in alphabetical order
package String_Programs;
import java.util.Scanner;
public class SortingString {
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valid String: ");
        String s1 = sc.nextLine();

        char [] arr = s1.toCharArray();

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }

    }
}
