public class MathContainer {
    private int val, secVal;

    public MathContainer(int initialValue) {
        val = initialValue;
    }

    public void declare() {
        System.out.println("my value is:" + val);
        System.out.println("my sec value is:" + secVal);
    }
    public void setSecondaryVal(int value) {
        secVal = value;
    }
}
