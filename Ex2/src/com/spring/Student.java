package com.spring;

public class Student {  
private String name; 
private String Address;
private String Course;
private int Age;
  
public String getCourse() {
 return Course;
}

public void setCourse(String course) {
 Course = course;
}

public int getAge() {
 return Age;
}

public void setAge(int age) {
 Age = age;
}

public String getAddress() {
 return Address;
}

public void setAddress(String address) {
 Address = address;
}

public String getName() {  
    return name;  
}  
  
public void setName(String name) {  
    this.name = name;  
}  
  
public void displayInfo(){  
    System.out.println("Hello: "+name);
    System.out.println("UR Adress :"+Address);
    System.out.println("UR Course :"+Course);
    System.out.println("UR Age :"+Age);
}  
}  



