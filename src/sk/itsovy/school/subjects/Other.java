package sk.itsovy.school.subjects;

import java.util.regex.Pattern;

public class Other {
    public boolean isEur(String vrajEur){
        Pattern p = Pattern.compile("[\\d{1,}]([\\.,](\\d){2})?( ?(eur|€))?", Pattern.CASE_INSENSITIVE);
        return p.matcher(vrajEur).matches();
    }
}
