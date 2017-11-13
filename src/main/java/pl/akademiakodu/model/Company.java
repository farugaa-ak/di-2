package pl.akademiakodu.model;

public class Company {

    private String name;

    private LazyWorker lazyWorker = new LazyWorker();

    public Company(String name) {
        this.name = name;
    }

    public void startWork(){
        lazyWorker.work();
    }
}
