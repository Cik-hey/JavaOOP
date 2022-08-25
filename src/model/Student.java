package model;


public class Student {
    private String name;
    private int age;
    private String gender;
    private String id_no;
    
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getId_no() {
        return id_no;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setId_no(String id_no) {
        this.id_no = id_no;
    }
}
