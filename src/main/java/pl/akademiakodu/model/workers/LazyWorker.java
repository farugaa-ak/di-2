package pl.akademiakodu.model.workers;

import org.springframework.stereotype.Component;

public class LazyWorker implements Worker {

    public void work() {
        System.out.println("LazyWorker is working...");
    }
}
