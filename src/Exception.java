public class Exception {
    public void test() {
        int a = 5, b=6, c;

        try {
           c = a / b;
        } catch(java.lang.Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public int another() throws java.lang.ArrayIndexOutOfBoundsException {
        System.out.println("ha ha ha");
        return 32;
    }
}
