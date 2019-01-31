public class Test {
    String str  = new String("hello");
    char[] ch = {'a','b'};
    public static void main(String[] args) {
        ((Test)null).testMethod();
    }
    public static void testMethod() {
        System.out.println("testMethod");
    }
}
