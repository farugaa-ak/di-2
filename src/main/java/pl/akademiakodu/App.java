package pl.akademiakodu;

import pl.akademiakodu.model.Company;
import pl.akademiakodu.model.HardWorker;
import pl.akademiakodu.model.LazyWorker;
import pl.akademiakodu.model.SmartWorker;
import pl.akademiakodu.model.Worker;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args )
    {
        //dependency injection
        SmartWorker smartWorker = new SmartWorker();
        Worker worker = new HardWorker();

        Company company = new Company("Some company", worker);
        company.startWork();
    }
}
