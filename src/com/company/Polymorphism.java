/*constructor overlading
        A(){

        }
        A(int a){
        System.out.println(a);
        }
        A(int a , int b){
        System.out.println(a+b);
        }
        public class Polymorphism {
    public static void main(String[] args) {
        System.out.println();
        A obj = new A(1);
        A obj1 = new A(1,2);
        A obj3 = new A();
        }
        }

 */

/* method overloading
package com.company;
class A{
    void add(int a , int b){
        System.out.println(a+b);
    }
    void add(int a , int b, int c){
        System.out.println(a+b+c);
    }

}
public class Polymorphism {
    public static void main(String[] args) {
        System.out.println();
        A obj = new A();

        obj.add(2,3);
        obj.add(2,3,4);
    }
}

 */
/* method overriding
package com.company;
class parent{
    public void moblie(){
        System.out.println("samsung");
    }
}
class child extends parent{

    public void moblie(){
        System.out.println("I phone");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        child obj = new child();
        obj.moblie();
    }
}

 */

