package pc.lism.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Nick
 * @version 1.0
 * @since 2020/2/9 23:08
 */
@ConfigurationProperties("person.message")
public class PersonProperties {

    private String name;

    private String address;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
