/*
package com.company;
class person {
    private int age=17 ;
    private String name ;

    public int getA() {
        return age;
    }
    public void setA(int age1){
      age = age1;
    }
    public String getName(){
        return name;
    }
    public void setName(String name1){
        name = name1;
    }
}
public class encapsulatioon {
    public static void main(String[] args) {
        person obj = new person();
        System.out.println(obj.getA());
        obj.setA(21);
        obj.setName("Rakesh");
        System.out.println("Age=" + obj.getA());
        System.out.println("Name=" + obj.getName());
    }
}

 */
package com.company;
class student {
   private String sName = "Suman";
   private String sBranch = "EC";
   private int rollNo = 2;
   private String address = "cpt";
   private int age = 20;
    public String getsName(){
    return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getsBranch(){
    return sBranch;
    }
    public void setsBranch(String sBranch) {
        this.sBranch = sBranch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
public class encapsulatioon {
    public static void main(String[] args) {
    student obj = new student();
    obj.setsName("Rakesh");
    obj.setsBranch("cs");
    obj.setRollNo(21);
    obj.setAddress("Banglore");
    obj.setAge(23);
        System.out.println("Name=" + obj.getsName());
        System.out.println("Branch=" + obj.getsBranch());
        System.out.println("RollNo=" + obj.getRollNo());
        System.out.println("Address=" + obj.getAddress());
        System.out.println("Age=" + obj.getAge());

    }
}
