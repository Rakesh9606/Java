package com.company;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputt {
    public static void main(String[] args) {
        String name = "example3.txt";
        try (FileInputStream stream = new FileInputStream(name)) {
            int byteValue;
            while ((byteValue = stream.read()) != -1) {
                System.out.print((char) byteValue);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
/*
2nd way of read file by constuctor FileInputStream
read a file byte by byte
sutaible and more efficent for read a binary file likes images

 */