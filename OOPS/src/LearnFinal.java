public class LearnFinal {
    public static void main(String[] args) {
        final player virat = new player("virat");

        // can change the contect of reference variables
        virat.name = "sehwag";

        // but cannot reassign final obj to diff obj
//        virat = new player("anuksha")


    }
}

class player {
    final int age = 33;
    String name;

    public player(String name) {
        this.name = name;
    }
}