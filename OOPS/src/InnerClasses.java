public class InnerClasses {
     static class Nested {
        String name;
        Nested(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Nested vivek = new Nested("Vivek");
        Nested ankit = new Nested("Ankit");
        System.out.println(vivek.name);
        System.out.println(ankit.name);
    }
}

class Outer {
    String name;
    Outer(String name) {
        this.name = name;
    }
}
