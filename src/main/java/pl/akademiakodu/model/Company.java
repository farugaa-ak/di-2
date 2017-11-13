package pl.akademiakodu.model;

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
