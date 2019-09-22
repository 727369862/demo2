package cn.htu.demo.demo2.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("dog")
public class Dog {
    private String dog;
    private int age;
    private String name;

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
