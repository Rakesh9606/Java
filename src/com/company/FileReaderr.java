package com.company;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderr {
    public static void main(String... args) {
        String name = "example3.txt";
        try (FileReader reader = new FileReader(name)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
// 1st way by method ,it is sutitale for to read  small file by character