package pl.akademiakodu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.akademiakodu.model.Company;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(App.class, args);

        Company company = (Company) configurableApplicationContext.getBean("company");
        System.out.println("===============");
        company.startWork();
        System.out.println("===============");
    }
}
