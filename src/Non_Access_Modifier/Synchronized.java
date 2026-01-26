package Non_Access_Modifier;

public class Synchronized {
}
//Only one thread at a time can access it.
class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}
