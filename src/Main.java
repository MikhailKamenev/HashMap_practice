import User.User;
import User.UsersList;
import User.SomeList;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // практика по ассоциативным массивам и мапам

        // Задание 1.
        // создан класс пользователя (User) и класс список пользователей (UsersList)
        //  создаем объекты для первого задания
        User nikita = new User("Nikita", "+79951239034");
        User petya = new User("Petr", "+79951239033");
        User fedya = new User("Fedor", "+79951239032");
        User sasha = new User("Alexandr", "+79951239031");
        User kirill = new User("Kirill", "+79951239030");
        User vadim = new User("Vadim", "+79951239029");
        User ivan = new User("Ivan", "+79951239028");
        User vasya = new User("Vasiliy", "+79951239027");
        User ilya = new User("Ilia", "+79951239026");
        User anton = new User("Anton", "+79951239025");
        UsersList usersList = new UsersList();
        usersList.addUser(nikita);
        usersList.addUser(petya);
        usersList.addUser(fedya);
        usersList.addUser(sasha);
        usersList.addUser(kirill);
        usersList.addUser(vadim);
        usersList.addUser(ivan);
        usersList.addUser(vasya);
        usersList.addUser(ilya);
        usersList.addUser(anton);
        //объекты для третьего задания
        SomeList someList = new SomeList();
        someList.addValue("Mika",10);
        someList.addValue("Mika",15);
//        someList.addValue("Mika",15);  проверка на выкидывание исключения
        someList.addValue("1",5);
        someList.addValue("2",2);
        someList.addValue("3",3);
        someList.addValue("4",4);
        someList.addValue("5",5);
        // вывести в консоль согласно заданию
        System.out.println(usersList);
        System.out.println(someList);

        //задание про карту где ключ это произвольная String, а значение это список из 3 рандомных целых чисел
        List<Integer> list1 = new ArrayList<>();
        fillTheList(list1);
        List<Integer> list2 = new ArrayList<>();
        fillTheList(list2);
        List<Integer> list3 = new ArrayList<>();
        fillTheList(list3);
        List<Integer> list4 = new ArrayList<>();
        fillTheList(list4);
        List<Integer> list5 = new ArrayList<>();
        fillTheList(list5);
        HashMap<String, List<Integer>> map =new HashMap<>();
        map.put("SMTH1", list1);
        map.put("SMTH2", list2);
        map.put("SMTH3", list3);
        map.put("SMTH4", list4);
        map.put("SMTH5", list5);
        System.out.println(map);
        HashMap<String,Integer>map2 = new HashMap<>();//корректировка до map со значениями Integer
        map2 = changeMap(map);
        System.out.println(map2);

        // Задание про вывод коллекции в том же порядке что и заполнение
        // Просто используем вместо HashMap - LinkedHashMap
        Map<Integer,String>newMap = new LinkedHashMap<>();
        newMap.put(11, "1");
        newMap.put(22, "2");
        newMap.put(33, "3");
        newMap.put(44, "4");
        newMap.put(55, "5");
        newMap.put(66, "6");
        newMap.put(77, "7");
        newMap.put(88, "8");
        newMap.put(99, "9");
        newMap.put(10, "10");
        System.out.println(newMap);

    }

    public static void fillTheList(List list) {
        for (int i = 0; i < 3; i++) {
            list.add((int) (Math.random() * 1000));
        }
    }//Метод заполняющий список рандомными числами от 0 до 1000

    public static int countListValues(List list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = (int) (list.get(i))+sum;
        }
        return sum;
    }// метод который считает сумму в списке целых
    // чисел из map образца <String,List<Integer>>

    public static HashMap changeMap(HashMap hashMap) {
        HashMap<String,Integer>map = new HashMap<>();
        Iterator iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object value = countListValues((List) hashMap.get(key));
            map.put((String) key, (Integer) value);
        }
        return map;
    }//метод который преобразовывает
    // map со значениями List в map1 со значениями Integer. и использует метод countListValues
    // для получения суммы целых чисел списка в map




}