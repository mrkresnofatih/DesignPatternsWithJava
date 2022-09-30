public class Main {
    public static void main(String[] args) {
        var globalCounter = CounterSingleton.getInstance();
        System.out.println("global counter: " + globalCounter.count); // 0
        addFiveToGlobalCounter();
        System.out.println("global counter: " + globalCounter.count); // 5
        addFourToGlobalCounter();
        System.out.println("global counter: " + globalCounter.count); // 9
    }

    public static void addFiveToGlobalCounter() {
        var globalCounter = CounterSingleton.getInstance();
        globalCounter.increment();
        globalCounter.increment();
        globalCounter.increment();
        globalCounter.increment();
        globalCounter.increment();
    }

    public static void addFourToGlobalCounter() {
        var globalCounter = CounterSingleton.getInstance();
        globalCounter.increment();
        globalCounter.increment();
        globalCounter.increment();
        globalCounter.increment();
    }
}
