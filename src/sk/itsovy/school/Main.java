package sk.itsovy.school;

import sk.itsovy.school.subjects.Other;
import sk.itsovy.school.subjects.SlovakLanguage;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        String encoded = new SlovakLanguage().encode("aads");
        System.out.println(new SlovakLanguage().encode(encoded));
    }
}
