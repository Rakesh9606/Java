package com.company;

import java.io.File;

public class Filedel {
    public static void main(String[] args) {
        File file = new File("example1.txt");
        if(file.exists()){
            if(file.delete()){
                System.out.println("deleted succeful");
            }else{
                System.out.println("not deleted");
            }
        }else{
            System.out.println("file not exited");
        }
    }
}
//eg = dele a old log files in a server app to conserver disk space and maintain sysyten performance
//check how to del a contenet of file
//does we can give the empty file name to read -yes
//del method in File class
