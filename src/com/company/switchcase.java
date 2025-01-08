
        //while lopp - dont know how many cond we are checking
        //for = specific number
/*
        Scanner sc = new Scanner(System.in);
        int i= sc.nextInt();
        int n= sc.nextInt();
        int sum=0;
      while(i<=n){
          sum += i;
          i++;

      }
        System.out.println(sum);

        */

        /*
        int sum =0;

      for( int i=1 ; i<=10;i++){
          sum += i;

        }
        System.out.println(sum);

         */
/*
    for(int i=0 ;i<=10;i++){
        if(i==5)
        {
            continue;
        }
        System.out.println(i);
    }

 */
    //once the program hit  the break satement it wil exit from the entire loop
        // continue skip the remaing part and goes to the for loop and continue
  /*
                Scanner sc = new Scanner(System.in);
                int row = sc.nextInt();
                int col = sc.nextInt();

                for (int i = 0; i < row; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j <= row - i - 1; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                 * * *
                  * *
                   *

                */



















        package com.company;
class company{

    public void empDetails(int eid, String name,String esalary, String erole){
        System.out.println("eid = " + eid);
        System.out.println("name = " + name);
        System.out.println("esalary = " + esalary);
        System.out.println("erole = " + erole);
        System.out.println();
    }
    public void depDetails(int did, String dname,int noOfEmp, String number){
        System.out.println("did = " + did);
        System.out.println("dname = " + dname);
        System.out.println("No of emmp = " + noOfEmp);
        System.out.println("Dep number = " + number);
    }
}

        public class switchcase {
            public static void main(String[] args) {
                company obj = new company();
                obj.empDetails(1,"rakesh","50K","junior");
                obj.depDetails(2,"tata",23,"999999999");



            }
        }





























/*
            deatils obj = new deatils();
               System.out.println(obj.s1(21, "rak","cs"));
                       System.out.println(obj.s2());
        class deatils{

            public void s1(int age,String name , String branch){
                System.out.println(name);
                System.out.println(age);
                System.out.println(branch);
            }
            public void s2(){
                int age= 21;
                String name="rrr";
                int rollNo =11;
                String
                System.out.println(name);
                System.out.println(age);
                System.out.println(branch);
                System.out.println(rollNo);

            }

        }

 */































/*
            Scanner sc = new Scanner(System.in);
            int row= sc.nextInt();


                for(int i =row ; i>=1;i--){

                        for(int j=row; j>=i;j--){
                        System.out.print(" ");
                        }
                        for(int j=1;j<=i;j++){
                        System.out.print("*");
                        }
                        System.out.println();
                        }
                        ***
                        **
                        *


 */







/*
            String a = "Rakesh";
            int b = 7;
            int c = 3;
                System.out.println(a.length());
                        System.out.println(Math.max(b,c));

 */



/*
        class dog{
            int age = 5;
            String name = "Max";
            String col = "Black";

        }
        class car{
            String name = "Honda Amaze";
            String col = "Sliver";
            String price= "1000000";
            String fuleType = "Petrol";
        }
        class bike{
            String name = "NS";
            String col = "White";
            String price= "150000";
            String fuleType = "Petrol";
        }
        class mobile{
            String name = "Samsung";
            String col = "Blue";
            String price= "15000";
            String ram = "64GB";
            String rom = "128GB";
        }
            dog max = new dog();
                System.out.println(max.age);
                        System.out.println(max.name);
                        System.out.println(max.col);

                        car amaze = new car();
                        System.out.println(amaze.name);
                        System.out.println(amaze.col);
                        System.out.println(amaze.price);
                        System.out.println(amaze.fuleType);

                        bike ns = new bike();
                        System.out.println(ns.name);
                        System.out.println(ns.col);
                        System.out.println(ns.price);
                        System.out.println(ns.fuleType);

                        mobile samsung = new mobile();
                        System.out.println(samsung.name);
                        System.out.println(samsung.col);
                        System.out.println(samsung.price);
                        System.out.println(samsung.ram);
                        System.out.println(samsung.rom);

 */
















































/*
      int  s = 121;
      int rev=0;
      rev= s%10;
      int nn = s/10;


      if(s==rev){
          System.out.println("true");
      }else{
          System.out.println(" fallse ");
      }

 */




