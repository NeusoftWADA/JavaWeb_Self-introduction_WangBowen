package com.wangbowen.entity;

public class Users {
    private String ID;
    private String Name;
    private String Sex;
    private String Birthdate;
    private String State;
    public Users(String ID, String Name, String Sex, String Birthdate, String State){
        this.ID = ID;
        this.Name = Name;
        this.Sex = Sex;
        this.Birthdate = Birthdate;
        this.State = State;
    }
    public String getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
    public String getSex() {
        return Sex;
    }
    public String getBirthdate() {
        return Birthdate;
    }
    public String getState() {
        return State;
    }
}
