package pl.akademiakodu;

import pl.akademiakodu.model.Company;
import pl.akademiakodu.model.HardWorker;
import pl.akademiakodu.model.LazyWorker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Company company = new Company("Some company", new HardWorker());
        company.startWork();
    }
}
