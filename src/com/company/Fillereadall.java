package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Fillereadall {
    public static void main(String[] args) {
        String name = "example4.txt";
        try{
            List<String> lines = Files.readAllLines(Paths.get(name));
            for(String line : lines){
                System.out.println(line);
            }

        }catch (IOException e){
            System.out.println(e);
        }
    }
}

/*3rd way
Files.readAllLines() method
it is for larger data
read all line from a file as list of string

 */

