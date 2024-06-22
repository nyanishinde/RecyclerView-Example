package com.example.recycler;

public class DataModelChats {

    int image;
    String name,message,time;

    public DataModelChats(int image, String name, String message, String time) {
        this.image = image;
        this.name = name;
        this.message = message;
        this.time = time;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}

/*
    DatamodelChats obj1 = new DataModelChats(R.drawable.xyz,"Gyani","hello","10:00 Am");
    DatamodelChats obj1 = new DataModelChats();
    String mess = obj1.message
    String timee =obj1.time
    String userName = obj1.getName();
    String userName = obj1.name;

    obj1.message="hello"
    obj1.setName("GYani");
    obj1.name="Gyani"

 */