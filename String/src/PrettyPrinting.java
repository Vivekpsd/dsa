public class PrettyPrinting {
    public static void main(String[] args) {
        float num = 453.1264f;

        //printf -> formatted printing, will print till .2 and will also round off.
        System.out.printf("Formatted number is: %.2f\n", num);

        System.out.printf("Pie is: %.3f\n", Math.PI);

        System.out.printf("Hello I'm %s and I work at %s", "vivek", "nokia");
    }
}
