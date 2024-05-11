public class LearnStatic {
    public static void main(String[] args) {
        Human vivek = new Human("Vivek", 24, 10000, true);
        Human ankit = new Human("Ankit", 22, 15000, false);

        System.out.println(vivek.name);
        System.out.println(Human.population);
        System.out.println(ankit.name);
        System.out.println(Human.population);
    }

    static class Human {
        String name;
        int age;
        long salary;
        boolean married;
        static long population;

        public Human(String name, int age, long salary, boolean married) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.married = married;
            Human.population += 1;
        }
    }
}
