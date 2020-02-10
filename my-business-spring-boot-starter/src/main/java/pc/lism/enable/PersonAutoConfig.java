package pc.lism.enable;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pc.lism.entity.Person;
import pc.lism.properties.PersonProperties;

/**
 * @author Nick
 * @version 1.0
 * @since 2020/2/9 23:04
 */
@Configuration
@EnableConfigurationProperties({PersonProperties.class})
public class PersonAutoConfig {

    @Bean
    public Person person(PersonProperties personProperties){
        Person p = new Person();
        p.setAddress(personProperties.getAddress());
        p.setAge(personProperties.getAge());
        p.setName(personProperties.getName());
        return p;
    }

}
