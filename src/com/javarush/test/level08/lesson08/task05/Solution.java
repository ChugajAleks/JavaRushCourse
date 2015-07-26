package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<String, String> qwer = it.next();
            System.out.println("fam - " + qwer.getKey() + " name - " + qwer.getValue());
        }
        /*for(Map.Entry<String, String> it: map.entrySet())
        {
            String name = it.getValue();
            String fam = it.getKey();
            System.out.println("name - " + name + " fam - " + fam);
            //System.out.println(map.toString());
        }*/
    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("qwer", "qwer");
        map.put("qwerq", "qwer");
        map.put("qwerw", "qwer");
        map.put("qwere", "qwert");
        map.put("qwerr", "qwerty");
        map.put("qwertl", "qwertyu");
        map.put("qwerqq", "qwer");
        map.put("qwerww", "asdf");
        map.put("qweree", "asdf");
        map.put("qwertt", "asdfg");
    return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        for (int i = 0; i < map.size(); i++)
        {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            if (it.hasNext())
            {
                String name = it.next().getValue();
                removeItemFromMapByValue(map, name);
            }
        }


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
