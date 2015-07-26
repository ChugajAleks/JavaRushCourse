package com.javarush.test.level05.lesson12.home01;

/* Три класса
По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака).
Подумай, что должен возвращать метод toString в классах Cat и Dog?
В методе main создай по два объекта каждого класса и выведи их на экран.
Объекты класса Duck уже созданы и выводятся на экран.
*/

public class Solution
{


    public static void main(String[] args)
    {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        //Напишите тут ваш код
        Cat Cat1 = new Cat();
        Cat Cat2 = new Cat();
        System.out.println(Cat1);
        System.out.println(Cat2);
        Dog Dog1 = new Dog();
        Dog Dog2 = new Dog();
        System.out.println(Dog1);
        System.out.println(Dog2);
    }

    public static class Duck
    {
        public String toString() {
            return "Duck";
        }
    }

    //Напишите тут ваш код
    public static class Cat
    {
        public String toString() {
            return "Cat";
        }
    }
    public static class Dog
    {
        public String toString() {
            return "Dog";
        }
    }
}
