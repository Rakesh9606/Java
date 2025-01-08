package com.company;

import java.time.*;

public class DATE {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        LocalDate d1= LocalDate.of(1998,11,18);
        LocalDate d2= LocalDate.of(1998, Month.DECEMBER,18);
        LocalTime t = LocalTime.now();
        LocalTime t1 = LocalTime.of(2,30);
        LocalDateTime dt = LocalDateTime.now();
        LocalTime japan = LocalTime.now(ZoneId.of("Japan"));
       for(String s: ZoneId.getAvailableZoneIds() ){
           System.out.println(s);
       }

    }
}
