package pl.akademiakodu.model;

import org.springframework.beans.factory.annotation.Autowired;
import pl.akademiakodu.model.workers.Worker;

public class Company {

    private String name;

    @Autowired
    private Worker worker;

    public void startWork() {
        worker.work();
    }
}
