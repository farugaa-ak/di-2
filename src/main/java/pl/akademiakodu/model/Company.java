package pl.akademiakodu.model;

public class Company {

    private String name;

    private HardWorker hardWorker = new HardWorker();

    public Company(String name) {
        this.name = name;
    }

    public void startWork(){
        hardWorker.work();
    }
}
