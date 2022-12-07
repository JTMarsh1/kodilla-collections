package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Chrobry", 23, true));
        stamps.add(new Stamp("Lokietek I ", 21, false));
        stamps.add(new Stamp("Mikolaj Kopernik", 14, true));
        stamps.add(new Stamp("Chrobry", 25, true));
        stamps.add(new Stamp("Kazimierz Wielki", 22, false));
        stamps.add(new Stamp("Chrobry", 23, true));
        stamps.add(new Stamp("Kielbasa Lisiecka", 18, false));
        stamps.add(new Stamp("Kielbasa Lisiecka", 18, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
