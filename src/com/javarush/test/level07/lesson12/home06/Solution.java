package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни
их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human ded1 = new Human("ded1", true, 99, null, null);
        Human baba1 = new Human("baba1", false, 99, null, null);
        Human ded2 = new Human("ded2", true, 99, null, null);
        Human baba2 = new Human("baba2", false, 99, null, null);
        Human mam = new Human("mam", false, 34, ded1, baba1);
        Human pap = new Human("pap", true, 36, ded2, baba2);
        Human ch1 = new Human("ch1", true, 12, pap, mam);
        Human ch2 = new Human("ch2", false, 10, pap, mam);
        Human ch3 = new Human("ch3", true, 8, pap, mam);
        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(baba1.toString());
        System.out.println(baba2.toString());
        System.out.println(mam.toString());
        System.out.println(pap.toString());
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        Human ded;
        Human baba;

        Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
            this.ded = ded;
            this.baba = baba;
        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;



            return text;
        }
    }

}
