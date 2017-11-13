package pl.akademiakodu.model.workers;

//@Component
public class LazyWorker implements Worker {

    public void work() {
        System.out.println("LazyWorker is working...");
    }
}
