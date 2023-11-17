public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
            // creating new string object, copying old one
            // and appending new string object
            // O(n)^2      :(
            // use StringBuilder instead     :)
        }
        System.out.println(series);
    }
}
