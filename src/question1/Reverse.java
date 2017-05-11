package question1;

/**
 * Created by aoblah on 5/11/17.
 */
public class Reverse {
    public static void main(String[] args){
        System.out.println(reverseTheString("Hello World"));
    }

    public static String reverseTheString(String input){
        StringBuilder reverse = new StringBuilder();


        // Traversing the string in reverse and adding it to the string builder
        for(int i = input.length() - 1; i >= 0; i-- ){
            reverse.append(input.charAt(i));
        }

        return reverse.toString();

    }
}
