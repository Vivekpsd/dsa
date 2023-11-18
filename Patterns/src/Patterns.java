public class Patterns {
    public static void main(String[] args) {

        // stars
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern9();
        pattern10();
        pattern11();
        pattern12();

        // nums -> when nums try not to use 0th index
        pattern30();
        pattern31();
    }
    static void pattern1() {
        System.out.println("\n-> (Pattern 1) <-");
        for (int row = 0; row <= 4; row++) {
            for (int col = 0; col <= 4; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        System.out.println("\n-> (Pattern 2) <-");
        for (int row = 0; row <= 4; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3() {
        System.out.println("\n-> (Pattern 3) <-");
        for (int row = 4; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4() {
        System.out.println("\n-> (Pattern 4) <-");
        for (int row = 0; row <= 4; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(col+1 + " ");
            }
            System.out.println();
        }
    }

    static void pattern5() {
        System.out.println("\n-> (Pattern 5) <-");
        int n = 5;
        for (int row = 1; row <= 2*n - 1; row++) {
            if (row <= n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("*" + " ");
                }
            } else {
                for (int col = 1; col <= (2*n - 1) - row + 1; col++) {
                    System.out.print("*" + " ");
                }
            }

            System.out.println();
        }
    }

    static void pattern6() {
        System.out.println("\n-> (Pattern 6) <-");
        int n = 5;
        for (int row = 1; row <= n; row++) {
            int gap = n - row;
            for (int col = 1; col <= gap; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7() {
        System.out.println("\n-> (Pattern 7) <-");
        int n = 5;
        for (int row = n; row >= 1; row--) {
            int gap = n - row;
            for (int col = 1; col <= gap; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8() {
        System.out.println("\n-> (Pattern 8) <-");
        int cols = 9;
        int toPrint = 1;
        int gap = cols/2;
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= gap; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= toPrint; col++) {
                System.out.print("*");
            }
            toPrint += 2;
            gap--;
            System.out.println();
        }
    }

    static void pattern9() {
        System.out.println("\n-> (Pattern 9) <-");
        int cols = 9;
        int gap = 0;
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= gap; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= cols - gap*2; col++) {
                System.out.print("*");
            }
            gap++;
            System.out.println();
        }
    }

    static void pattern10() {
        System.out.println("\n-> (Pattern 10) <-");
        int cols = 9;
        int gap = cols/2;
        int toPrint = 1;
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= gap; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= toPrint; col++) {
                System.out.print("* ");
            }
            gap--;
            toPrint++;
            System.out.println();
        }
    }

    static void pattern11() {
        System.out.println("\n-> (Pattern 11) <-");
        int cols = 9;
        int gap = 0;
        int toPrint = 5;
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= gap; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= toPrint; col++) {
                System.out.print("* ");
            }
            gap++;
            toPrint--;
            System.out.println();
        }
    }

    static void pattern12() {
        System.out.println("\n-> (Pattern 12) <-");
        int cols = 9;
        int rows = 10;
        int gap = 0;
        int toPrint = 5;
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= gap; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= toPrint; col++) {
                System.out.print("* ");
            }
            if (row < rows/2) {
                gap++;
                toPrint--;
            } else if (row > rows/2 + 1) {
                gap--;
                toPrint++;
            } else {
                gap = cols/2;
            }
            System.out.println();
        }
    }

    // nums
    static void pattern30() {
        System.out.println("\n-> (Pattern 30) <-");
        int rows = 5;
        int cols = rows*2 - 1;
        int gaps = cols/2;
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= gaps; col++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            gaps--;
            System.out.println();
        }
    }

    static void pattern31() {
        System.out.println("\n-> (Pattern 31) <-");
        int n = 4;
        int size = n*2 - 1;
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                int left = col - 1;
                int top = row - 1;
                int right = size - col;
                int bottom = size - row;
                int atEveryIndex = n - (Math.min(Math.min(left, top), Math.min(right, bottom)));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
