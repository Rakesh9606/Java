package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileEG {
    //we can create and del using file handling mechinsm using api
    //2 types of files text
    // and binary eg image
    //java.io.package
    // 3 ways to create file - File.creteNewFile() method its easeist way to create file , Fileoutputstrream() constructor , Files.write() method u can write byte or string
    //read write ceate del 4 method in file
    public static void main(String[] args) {
        /* 1st way to create
        String fileName = "example1.txt";
        File file = new File(fileName);
        try{
           if(file.createNewFile()) {
            System.out.println("succeful");
        }else{
               System.out.println("falied");
           }
    }catch (Exception e){
            System.out.println(e);
        }

         */
        // 2nd way its like openening a pipe to pour data into a file , we can wrie binary using this apporach, it is very useful to control over ur data
        /*
        String name = "example10.txt";

        try(FileOutputStream file1 = new FileOutputStream(name)){
            System.out.println(" created ");

        }catch (Exception e ){
            System.out.println(e);
        }

         */
        // 3rd way it is ussful for small data iif large data use previous
/*
        String name = "example3.txt";
        try{
            Files.write(Paths.get(name),"file 3 was created ".getBytes());
            System.out.println("done and wrritten ");

        }catch (Exception e){
            System.out.println(e);
        }

 */
        //how to write a file
        // mul ways to write 1, FileWriter.write() method ,can  string and char eg save user feedback into atext file ,
/* 1st way
        String fileName = "example4.txt";
File file = new File(fileName);
try{
    if(file.createNewFile()) {
        System.out.println("file created ");
    }else{
        System.out.println("file alread exit oro failed to created");
    }
    FileWriter writer = new FileWriter(file);
    writer.write("welcome to tata");
     writer.write("welcome to tata\n");
      writer.write("welcome to admin \n");
     writer.write("welcome to cabin \n");
    System.out.println("content written succesfully");
    writer.close();
}catch (IOException e){
    System.out.println(e);
}

 */

        // 2nd way it defines writting a binary data to file , can write byte data ,useful for writing binary fileks audio or images eg saving an image file
      /*
       String name = "example1.txt";
       String content = "welcom to java";
       try(FileOutputStream file = new FileOutputStream(name)){
           byte[] bytes = content.getBytes();
           file.write(bytes);
           System.out.println("contenet was written successful");
       }catch (IOException e ){
           System.out.println(e);
       }

       */

// 3rd can write byte or string , provide flexibilty to write botht text and binary files eg saving encrypted user cerditional
String nmae = "example10.txt";
String content = " welcome";
try{
    Files.write(Paths.get(nmae),content.getBytes());
    System.out.println("written ");
}catch(IOException e ){
    System.out.println(e);
}

}
}
