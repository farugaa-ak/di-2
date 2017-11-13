package pl.akademiakodu.model;

import pl.akademiakodu.model.workers.SmartWorker;
import pl.akademiakodu.model.workers.Worker;

public class Company {

    private String name;

    private Worker worker;

    public Company(String name, Worker worker) {
        this.name = name;
        this.worker = worker;
    }

    public void startWork(){
        worker.work();
    }
}
