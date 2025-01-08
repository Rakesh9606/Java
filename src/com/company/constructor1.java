package com.company;
/*count no of boj created
public class JavaProgram {
    private static int count;

    JavaProgram(){
        count++;
    }

    public static void main(String[] args) {
        System.out.println("hi");
        JavaProgram obj = new JavaProgram();
        JavaProgram obj1 = new JavaProgram();
        System.out.println(JavaProgram.count);
    }
}
 */
/*def construtor assign def val int 0 String null
package com.company;
class a{
    int a ;
    String name ;
    void dis(){
        System.out.println(a + " "+ name);
    }
}
public class JavaProgram {
    public static void main(String[] args) {
        System.out.println("hi");
        a obj = new a();
        obj.dis();
    }
}
 */


/*
class person{

person(int a ){
    System.out.println(a);
}
    person(){
        String name= "ramesh";
        int age = 30;
        System.out.println(name);
        System.out.println(age);
    }
    void detils(String name,int age,String branch){
        System.out.println(name+" "+age+" "+branch);
    }

}

 */
/*
class lorry{
    lorry(String colr,int price, String tyreSize){
        System.out.println(colr+ " " + price + " "+ tyreSize);
    }
    lorry(String name , String clr, String price,int whell){
        System.out.println(name+" "+clr+ " "+ price);
    }
    void car(String name , String clr, String price){
        System.out.println("car details = " + name+" "+clr+ " "+ price);
    }
    public String bike(String name1,String clrr){
        return name1+ "  \n" + clrr;

    }

}

 */


class emp{
    emp(String name,String role, String salary,String gender){
        System.out.println(name+ " " + role + " "+ salary+ " "+ gender);
    }
    emp(String name , int age ,String location){
        System.out.println(name+" "+age+ " "+ location);
    }
    public void h1(String name,int id , String company){
        System.out.println(name + " "+ id + " " + company);
    }
    public String h2(String depid,String depname , String location){
               return depid +"\n"+ depname +"\n"  +  location;

    }


}

public class constructor1 {
    public static void main(String[] args) {
        emp obj = new emp("rakesh","junior","50K","male");
         new emp("rakesh",22,"banglore");
        obj.h1("ram", 23,"IBM");
       String res =  obj.h2("1","admin","mumbai");
        System.out.println(res);

    }
}






















