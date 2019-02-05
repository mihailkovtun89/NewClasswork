package com.company;

public class Girl {
    String name;
    int age;
    int height;

    public Girl(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public void goToTheCinema() {
        System.out.println(" qo to the Cinema " + name);
    }

    public void goToRest(String rest) {
        if ("Mac".equals(rest)) {
            System.out.println("Absolutly NO");

        } else {
            System.out.println("Yes!");
        }
    }
}
