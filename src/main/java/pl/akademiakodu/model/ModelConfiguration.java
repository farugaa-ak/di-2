package pl.akademiakodu.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import pl.akademiakodu.model.workers.HardWorker;
import pl.akademiakodu.model.workers.LazyWorker;
import pl.akademiakodu.model.workers.SmartWorker;

@Configuration
public class ModelConfiguration {

    @Bean
    SmartWorker smartWorker(){
        return new SmartWorker();
    }

    //@Primary
    @Bean
    LazyWorker lazyWorker(){
        return new LazyWorker();
    }

    @Bean
    HardWorker hardWorker(){
        return new HardWorker();
    }

    @Bean
    //@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Company company(HardWorker hardWorker){
        return new Company(hardWorker);
    }
}
