public final class CounterSingleton {
    private static CounterSingleton instance;
    public int count;

    private CounterSingleton() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.count = 0;
    }

    public static CounterSingleton getInstance() {
        if (instance == null) {
            instance = new CounterSingleton();
        }
        return instance;
    }

    public void increment() {
        this.count++;
    }
}
