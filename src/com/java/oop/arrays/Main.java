package com.java.oop.arrays;

public class Main {
    public static void main(String[] args) {
        int[] ids; // array declaration
        ids = new int[5]; // array instantiation
        System.out.println(ids[0]);
        // array initialization
        ids[0] =101;
        ids[1] = 102;
        ids[2] = 103;
        ids[3] = 104;
        ids[4] = 105;
        System.out.println(ids.length);

        for(int index =0;index < ids.length;index++){
            System.out.println(ids[index]);
        }
        System.out.println("------------------");
        // enhanced for-loop (for-each loop)
        for(int id : ids){   // for each id in ids
            System.out.println(id);
        }
        System.out.println("---------------");

        int id1 = ids[0];
        id1 += 10000;
        System.out.println(id1);
        System.out.println("----------------");

        // add 10000 to all elements
        for (int id : ids){
            id += 10000;
        }
        // we have to use enhanced for - each loop for only reading and printing elements but not other purposes
        // To manipulate data we have to use for - loop
        for (int index = 0; index < ids.length; index++) {
            ids[index] += 10000;
            System.out.println(ids[index]);
        }
        System.out.println("-----------");
        for(int id : ids){   // for each id in ids
            System.out.println(id);
        }
        System.out.println("---------------------");
       /* float[] prices = new float[5];

        prices[0] = 100.10F;
        prices[1] = 200.20F;
        prices[2] = 300.30F;
        prices[3] = 400.40F;
        prices[4] = 500.50F;
         */
        float[] prices = {100.10F,200.20F,300.30F,400.40F,500.50F};
        for(float price : prices){
            System.out.println(price);
        }
        System.out.println("------------------");

        char[] genders = {'M','F','M','F','M'};
        for(char gender : genders){
            System.out.println(gender);
        }
    }
}
