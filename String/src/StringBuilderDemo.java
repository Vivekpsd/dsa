public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sb.append(ch);
            // not creating any new object, changing original object itself
        }
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.replace(0, 5, "vivek"));
    }

}
