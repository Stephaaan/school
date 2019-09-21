package sk.itsovy.school.subjects;

import java.util.HashMap;

public class English extends Subject {
    private HashMap<String, String> dictionary = new HashMap<String, String>();
    public English(){
        this.initDictionary();
    }
    private void initDictionary(){
        this.dictionary.put("pes", "dog");
        this.dictionary.put("macka", "cat");
        this.dictionary.put("kon", "horse");
        this.dictionary.put("prasa", "pig");
        this.dictionary.put("krava", "cow");
        this.dictionary.put("sliepka", "chicken");
        this.dictionary.put("ovca", "sheep");
        this.dictionary.put("netopier", "bat");
    }
    public String translate(String animal){
        if(animal == null){
            return null;
        }
        if(!this.dictionary.containsKey(animal.toLowerCase())){
            return null;
        }
        return this.dictionary.get(animal.toLowerCase());
    }
}
