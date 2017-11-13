package pl.akademiakodu;

import pl.akademiakodu.model.Company;
import pl.akademiakodu.model.workers.HardWorker;
import pl.akademiakodu.model.workers.SmartWorker;
import pl.akademiakodu.model.workers.Worker;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args )
    {
        //dependency injection
        //container
        Worker smartWorker = new SmartWorker();
        Worker worker = new HardWorker();

        Company company = new Company("Some company", worker);
        company.startWork();



    }
}
