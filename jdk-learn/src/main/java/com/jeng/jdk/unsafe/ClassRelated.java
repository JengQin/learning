package com.jeng.jdk.unsafe;

/**
 * The ClassRelated
 *
 * @author JiaZheng
 * @create 2020-02-26 21:09
 */
public class ClassRelated {
    public static void main(String[] args) {
        Class<Person> clazz = Person.class;
    }
}

class Person{
    private byte age;
    private String name;

    public Person(byte age, String name) {
        this.age = age;
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
