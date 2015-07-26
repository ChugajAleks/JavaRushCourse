package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stalloneq", new Date("January 1 1980"));
        map.put("Stallonew", new Date("February 1 1980"));
        map.put("Stallonee", new Date("March 1 1980"));
        map.put("Stalloner", new Date("April 1 1980"));
        map.put("Stallonet", new Date("May 1 1980"));
        map.put("Stalloney", new Date("June 1 1980"));
        map.put("Stalloneu", new Date("July 1 1980"));
        map.put("Stallonei", new Date("August 1 1980"));
        map.put("Stalloneo", new Date("September 1 1980"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext())
        {
            Date dat = it.next().getValue();
            int mon = dat.getMonth();
            if(mon > 4 && mon < 8)
                it.remove();
        }

    }
}
