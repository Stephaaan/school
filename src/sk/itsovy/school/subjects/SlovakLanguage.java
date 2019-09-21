package sk.itsovy.school.subjects;

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
        return null;
    }
    private char encodeChar(char c){
        String bytes  = Integer.toBinaryString(c);
        System.out.println(bytes);
        return 'a';
    }

}
