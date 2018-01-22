public class Test {
    public static class Point {
        public int x;
        public int y;
    }

    public static void test(final Point point) {
        point.x = 100;
        point.y = 100;
    }

    private static int i = 0;

    public static int finallyTest() {
        try {
            System.out.println("finallyTest");
            return i = 1;
        } finally {
            System.out.println("i = " + i);
            System.out.println("finally");
            return 2;
        }
    }

    public static void test2() {
        int i = 10;
        char x = 'x';
        System.out.println(false ? i : x);
        System.out.println(false ? 10 : x);
    }

    public static void test3() {
        int num = 32;
        System.out.println(num >> 32);
    }

    public static void main(String[] args) {
        test3();
    }
}
