public class Singleton {
    private Singleton() { }
    private static Singleton ourInstance = new Singleton();

    public static Singleton getOurInstance() {
        return ourInstance;
    }
}
