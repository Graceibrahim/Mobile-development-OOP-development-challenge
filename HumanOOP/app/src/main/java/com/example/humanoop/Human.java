package com.example.humanoop;
import android.util.Log;

public class Human {
    private String name;
    private int age;
    private int weight;

    public Human(String name, int age, int weight){
        this.name =name;
        this.age = age;
        this.weight =weight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void eat(){
        Log.d("Human", "I am eatig food");
    }
    public void sleep(){
        Log.d("Human", "zzzzzzzzzz");
    }
    public int sleep(int hours){
        return Log.d("Human","I am sleeping for"+hours+"hours");
    }
    public  String speak(String speech){
    return speech;
    }
    public  void  birthday(){
        age=age+1;
    }
    public int eat(int weight){
        weight=weight+2;
        return Log.d("Human", "I am eating food"+weight+ "kgs");
    }
    public int birthday(int age){
        age=age+4;
        return age;

    }
}
