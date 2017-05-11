package question2;

/**
 * Created by aoblah on 5/11/17.
 */
public class Palindrome {
    public static void main(String[] args){
        String inputString = "MadaM";

        if(palindromeCheck(inputString)){
            System.out.println("Input string is a palindrome");
        }
        else{
            System.out.println("Input string is NOT a palindrome");
        }
    }

    //Returns True if
    public static boolean palindromeCheck(String inputString){
        if(inputString.equals(reverseTheString(inputString))){
            return true;
        }
        else{
            return false;
        }
    }


    //Method to reverse the string
    public static String reverseTheString(String input){
        StringBuilder reverse = new StringBuilder();


        // Traversing the string in reverse and adding it to the string builder
        for(int i = input.length() - 1; i >= 0; i-- ){
            reverse.append(input.charAt(i));
        }

        return reverse.toString();

    }


}
