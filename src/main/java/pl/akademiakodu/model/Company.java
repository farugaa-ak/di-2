package pl.akademiakodu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import pl.akademiakodu.model.workers.Worker;

public class Company {

    private String name;

    //@Qualifier("smartWorker")
    private Worker worker;

    @Autowired
    public Company(Worker worker) {
        this.worker = worker;
    }

    public void startWork() {
        worker.work();
    }
}
