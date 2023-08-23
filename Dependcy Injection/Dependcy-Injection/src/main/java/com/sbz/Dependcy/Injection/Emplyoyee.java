package com.sbz.Dependcy.Injection;

public class Emplyoyee {
    
    private int id;
    private String name;

    public Emplyoyee(){}

    public Emplyoyee(int id){
        this.id = id;
    }

    public Emplyoyee(String name){
        this.name = name;
    }

    public Emplyoyee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void show(){
        System.out.println(id + " " + name);
    }


}
