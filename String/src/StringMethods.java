import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Vivek Prasad  ";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.equals("notaname"));
        System.out.println(name.replace('P', 'S'));
        System.out.println(name.concat(" you rock!"));
        System.out.println(name.contains("sad"));
        System.out.println(name.endsWith("sad"));
        System.out.println(name.length());
        System.out.println(name.indexOf("sad"));

        String[] words = name.split(" ");

        // Display the split words
        for (String word : words) {
            System.out.println(word);
        }

        String trimmed = name.trim();
        System.out.println(trimmed.length());

        System.out.println("    Vivek    ".strip());


    }
}
