package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        result.add(new Cat("Kot1"));
        result.add(new Cat("Kot2"));
        result.add(new Cat("Kot3"));
        result.add(new Cat("Kot4"));
        return result;
    }

    public static Set<Dog> createDogs()
    {
        Set<Dog> result = new HashSet<Dog>();
        result.add(new Dog("Dog1"));
        result.add(new Dog("Dog2"));
        result.add(new Dog("Dog3"));
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        Set<Object> pets = new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets)
    {
        for (Object val: pets)
            System.out.println(val.toString());
    }

    public static class Cat
    {
        public String nameCat;
        public Cat(String name)
        {
            nameCat = name;
        }
        public String toString()
        {
            return nameCat;
        }
    }
    public static class Dog
    {
        public String nameDog;
        public Dog(String name)
        {
            nameDog = name;
        }
        public String toString()
        {
            return nameDog;
        }
    }
}
