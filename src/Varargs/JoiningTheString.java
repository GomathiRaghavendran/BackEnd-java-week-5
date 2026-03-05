package src.Varargs;

public class JoiningTheString {


    public static void main(String[] args) {

JoiningTheString.join("Varargs is excellent feature in java");
        JoiningTheString.join("Hello java");


    }
    public static String join(String... strings){// Varargs
        StringBuilder sb = new StringBuilder(); // StringBuilder class provides a mutable sequence of characters.
        for(String arg: strings){
            System.out.println(sb.append(arg));

        }
        return sb.toString();

    }
}

