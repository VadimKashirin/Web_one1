package ru.kashirin.test;

public class ClassicalMusik implements Music{

    public void doMyInit(){
        System.out.println("Doing my initilization ");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }


}
