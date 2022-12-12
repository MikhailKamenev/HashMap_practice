package User;

import java.util.HashMap;

public class SomeList {
    private HashMap<String, Integer> somelist = new HashMap<>();

    public void addValue(String string, Integer integer) {
//
//        if (somelist.containsKey(string)) {
//            somelist.replace(string, somelist.get(string), integer);
        if (somelist.containsKey(string) && somelist.get(string).equals(integer)) {
            throw new RuntimeException("Такая пара ключ-значение уже существует");
        } else if (somelist.containsKey(string)) {
            somelist.replace(string, somelist.get(string), integer);
        } else {
            somelist.put(string, integer);
        }
    }

    @Override
    public String toString() {
        return somelist.toString();
    }
}
