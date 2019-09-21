package sk.itsovy.school.subjects;

import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SlovakLanguage extends Subject {
    public String formatText(String notFormatted){
        // prve pismeno velke, ostatne male, ak neni na konci interpunkcne tak pridat bodku
        if (notFormatted==null){
            return null;
        }
        notFormatted = notFormatted.toLowerCase();
        notFormatted = notFormatted.substring(0, 1).toUpperCase() + notFormatted.substring(1);
        if(!notFormatted.endsWith(".") && !notFormatted.endsWith("?") && !notFormatted.endsWith("!")){

            notFormatted += ".";
        }
        return notFormatted;
    }

    public String encode(String toEncode){
        char[] list = toEncode.toCharArray();
        return CharBuffer
                .wrap(toEncode.toCharArray())
                .chars()
                .mapToObj(i -> new String(encodeChar((char)i) + ""))
                .collect(Collectors.joining());
    }
    private char encodeChar(char c){
        return (char)(byte) (((byte) 240&c) >> 4 | ((byte) 15&c) << 4);
    }

}
