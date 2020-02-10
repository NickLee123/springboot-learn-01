package pc.lism.entity;

/**
 * @author Nick
 * @version 1.0
 * @since 2020/2/9 22:35
 */
public class Person {
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

    @Override
    public String toString() {
        return "name=" + this.name + ",address=" + this.address + ",age=" + this.age;
    }
}
