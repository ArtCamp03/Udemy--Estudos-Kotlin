public class TestJava {

    static int valor = 0;
    int value = 0;

    public TestJava(){
        valor++;
        value++;
    }

    public static void main(String[] args) {
        new TestJava();
        new TestJava();
        new TestJava();
        new TestJava();

        TestJava test = new TestJava();
        System.out.println(test.value);
        System.out.println(TestJava.valor);
    }
}
