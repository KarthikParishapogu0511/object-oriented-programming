package com.java.oop.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    // HashSet is an unordered, non-duplicate collection of elements
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add("Krish");
        set.add("jack");
        set.add(1);
        set.add("Krish");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(1));
        set.remove(1);
        System.out.println(set);

        set.add("abcd");
        set.add(12345);
        System.out.println(set);

        int[] ids = {1,2,3,4};
        for(int id:ids){
            System.out.println(id);
        }
        // We directly don't have get methods to access these, nor it's not index-based (unordered) so java uses Iterators.
        //Iterators iterate through the set using pointer


       // Iterator iterator =  set.iterator();

        //this has 2 methods
        //hasNext() -> it checks if there is any next element
        //next() -> it gives the next element

//        while(iterator.hasNext()){
//            String name = (String) (iterator.next());
//            System.out.println(name.toUpperCase());
//        }
        //Above would be the problem if we try it on Mixed objects

        // TO solve this java brings a concept called Generic Collection

        // it brings type safety as there is type safety it becomes to manipulate

        Set<String> names = new HashSet<>();
        names.add("ram");
        names.add("ravi");
        names.add("Sri");
        //names.add(1);
        System.out.println(names);

        //difference btn generic collections and normal collections is generic allows only specific types.

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name.toUpperCase());
        }

        // tree Set Demo
        //it does on the natural ordering
        Set<String> emails = new TreeSet<>();
        emails.add("amitaa42@gmail.com");
        emails.add("sarita35@gmail.com");
        emails.add("namita64@gmail.com");
        emails.add("kushi67@gmail.com");
        System.out.println(emails);
    }
}
