package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

        Human grf1 = new Human();
        Human grf2 = new Human();
        Human grm1 = new Human();
        Human grm2 = new Human();
        Human mam = new Human();
        Human pap = new Human();
        Human cld1 = new Human();
        Human cld2 = new Human();
        Human cld3 = new Human();

        cld1.name ="cld1";
        cld1.sex = true;
        cld1.age = 10;

        cld2.name ="cld2";
        cld2.sex = true;
        cld2.age = 10;

        cld3.name ="cld3";
        cld3.sex = true;
        cld3.age = 10;

        mam.name = "mam";
        mam.sex = false;
        mam.age = 34;
        mam.children.add(cld1);
        mam.children.add(cld2);
        mam.children.add(cld3);

        pap.name = "pap";
        pap.sex = true;
        pap.age = 50;
        pap.children.add(cld1);
        pap.children.add(cld2);
        pap.children.add(cld3);

        grf1.name = "grf1";
        grf1.sex = true;
        grf1.age = 140;
        grf1.children.add(mam);

        grf2.name = "grf2";
        grf2.sex = true;
        grf2.age = 140;
        grf2.children.add(pap);

        grm1.name = "grm1";
        grm1.sex = false;
        grm1.age = 140;
        grm1.children.add(mam);

        grm2.name = "grm2";
        grm2.sex = false;
        grm2.age = 140;
        grm2.children.add(pap);

        System.out.println(grf1);
        System.out.println(grm1);
        System.out.println(grf2);
        System.out.println(grm2);
        System.out.println(pap);
        System.out.println(mam);
        System.out.println(cld1);
        System.out.println(cld2);
        System.out.println(cld3);
    }

    public static class Human
    {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<Human>();

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
