import java.util.Scanner;

public class Main {
    public static int count(String s , char ch){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.nextLine();
        System.out.println("Enter the character:");
        char ch = input.next().charAt(0);
        System.out.println("The number of occurrences of " + ch + " in " + str + "  is " + count(str,ch));
        }
    }
