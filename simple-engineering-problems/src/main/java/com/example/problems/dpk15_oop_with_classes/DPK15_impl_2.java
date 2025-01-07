package com.example.problems.dpk15_oop_with_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DPK15_impl_2 {

}

class Person2 {
    private String name;
    private int age;
    private List<Friend2> friends;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
    }

    public List<String> getFriends() {
        return friends.stream().map(Friend2::getName).collect(Collectors.toList());
    }

    public void addFriend(String name) {
        boolean exists = false;
        for (Friend2 friend2 : friends) {
            if (friend2.getName().equals(name)) {
                exists = true;
            }
        }
        if (!exists) {
            friends.add(new Friend2(name));
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

class Friend2 {
    private String name;
    private int age;

    public Friend2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Friend2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}