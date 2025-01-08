package com.company;
/*single inheritance
class A{
    void dis(){
        System.out.println("method of A");
    }
}
class B extends A{
    public void hello(){
        System.out.println("method of B");
    }
}

 */
/*
class dog{
    void details(String name , String colr, String breed){
        System.out.println(name + " " + colr + " " + breed);
    }
}
class bayDog extends dog{
    void details2(String name , String colr, String breed,String gender){
        System.out.println(name + " " + colr + " " + breed);
    }
}

 */
/*
class car{
    void details1(String colr , int wheels){
        System.out.println(colr + " " + wheels);
    }

    void details2(String price , String fuelType){
        System.out.println(price + " " + fuelType );
    }
}
class BMW extends car{
   void details3(String price , String  col){

        System.out.println(price + " " + col);
    }
    void details4(String model , String colr){
        System.out.println(model + " " + colr );
    }
}



public class inheritannce {
    public static void main(String[] args) {
        car obj = new car();
        BMW obj2 = new BMW();
        obj.details1("black",4);
        obj.details2("45Lakh","petrol");
        obj2.details3("60L","Red");
        obj2.details4("Bmw","Red");
    }
}

 */
/*
class A{
    void dis1(){
        System.out.println("method of A");
    }
}
class B extends A{
    void dis2(){
        System.out.println("method of B");
    }
}
class C extends B{
    void dis3(){
        System.out.println("method of C");
    }
}
public class inheritannce {
    public static void main(String[] args) {
    C obj = new C();
    obj.dis1();
    obj.dis2();
    obj.dis3();
    }
}

 */
/*multi level
class Animal{
    void dis1(String color,String food){
        System.out.println(color+" "+food);
    }
}
class dog extends Animal{
    void dis2(String name , String breed){
        System.out.println(name+" "+breed);
    }
}
class babyDog extends dog{
    void dis3(String name , String breed,String col,String gender){
        System.out.println(name+" "+breed+" "+col+" "+gender);
    }
}
public class inheritannce {
    public static void main(String[] args) {
        babyDog obj = new babyDog();
        obj.dis1("balck ","pedigree");
        obj.dis2("Max","German");
        obj.dis3("rado","husky","white","male");
    }
}

 */
/*
hierarical inherticance
class A{
    void dis(){
        System.out.println("method of A");
    }
}
class B extends A{
    void dis1(){
        System.out.println("method of B");
    }
}
class C extends A{
    void dis2(){
        System.out.println("method of C");
    }
}
public class inheritannce {
    public static void main(String[] args) {
    B obj = new B();
    C obj1 = new C();
    obj.dis();
    obj.dis1();
    obj1.dis();
    obj1.dis2();

    }
}

 */
/*
class food{
    void dis(String type, String name , int rating){
        System.out.println(type+" "+name+" "+rating);
    }
}
class veg extends food{
    void dis1(String name , int price, int quantity){
        System.out.println(name+" "+price+" "+quantity);
    }
}
class non_veg extends food{
    void dis2(String name , int price, int quantity){
        System.out.println(name+" "+price+" "+quantity);
    }
}
public class inheritannce {
    public static void main(String[] args) {
        veg obj = new veg();
        non_veg obj1 = new non_veg();
        obj.dis("spicesy","noodles",4);
        obj.dis1("Ghee Rice",100,1);
        obj1.dis("non veg","Briyani",5);
        obj1.dis2("chicken cury",150,2);

    }
}

 */
//mutiple and hybrid is not supported
//sub class cannot acces the private members of super class

public class inheritannce {
    public static void main(String[] args) {

    }
}


























