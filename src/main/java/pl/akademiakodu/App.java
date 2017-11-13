package pl.akademiakodu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.akademiakodu.model.Company;
import pl.akademiakodu.model.workers.HardWorker;
import pl.akademiakodu.model.workers.SmartWorker;
import pl.akademiakodu.model.workers.Worker;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        appMain();
    }

    public static void appMain() {
        System.out.println("===============");
        //dependency injection
        //container
        Worker smartWorker = new SmartWorker();
        Worker worker = new HardWorker();

        Company company = new Company("Some company", worker);
        company.startWork();

        System.out.println("===============");


    }
}
