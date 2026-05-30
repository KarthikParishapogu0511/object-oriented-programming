package com.java.oop.arrays;

public class CustomersArray {
    public static void main(String[] args) {
        Customer[] customers = new Customer[5];

        customers[0] = new  Customer(1,"Karthik1",22,'M',87976535321L,"karthik765@gmail.com","CB Hostel",true);
        customers[1] = new  Customer(3,"Karthik3",23,'F',8796079521L,"karthik715@gmail.com","JB Hostel",false);
        customers[2] = new  Customer(5,"Karthik5",25,'M',6347653321L,"karthik735@gmail.com","AB Hostel",true);
        customers[3] = new  Customer(2,"Karthik2",27,'F',8826535321L,"karthik865@gmail.com","OB Hostel",false);
        customers[4] = new  Customer(4,"Karthik4",29,'M',7797535321L,"karthik764@gmail.com","KB Hostel",true);

        for(Customer customer : customers){
            customer.printCustomerDetails();
        }

        // sort all the customers by name
        //find the customer with highest age
//        Customer highestAgeCustomer = customers[0];
//
//        for(Customer customer : customers){
//            if(customer.age > highestAgeCustomer.age){
//                highestAgeCustomer = customer;
//            }
//        }
//        highestAgeCustomer.printCustomerDetails();


        //no of male customers

//        int maleCount = 0;
//        for(Customer customer : customers){
//            if(customer.gender == 'M'){
//                maleCount++;
//            }
//        }
//        System.out.println("Male Count : "+ maleCount);
        System.out.println("Male Customers Count : " + getMaleCustomerCount(customers));
    }
    public static int getMaleCustomerCount(Customer[] customers){
        int maleCount = 0;
        for(Customer customer : customers){
            if(customer.gender == 'M'){
                maleCount++;
            }
        }
        return maleCount;
    }

    public static int getFemaleCustomerCount(Customer[] customers){
        int femaleCount = 0;
        for(Customer customer : customers){
            if(customer.gender == 'F'){
                femaleCount++;
            }
        }
        return femaleCount;
    }

    public static Customer getCustomerById(Customer[] customers,int id){
        for(Customer customer : customers){
            if(customer.id == id){
                customer.printCustomerDetails();
                return customer;
            }
        }
        return null;
    }

    public static Customer getCustomerByName(Customer[] customers,String name){
        for(Customer customer : customers){
            if(customer.name.equals(name)){
                customer.printCustomerDetails();
                return customer;
            }
        }
        return null;
    }

    public static Customer getHighestAgedCustomer(Customer[] customers){
        Customer highestAgeCustomer = customers[0];

        for(Customer customer : customers){
            if(customer.age > highestAgeCustomer.age){
                highestAgeCustomer = customer;
            }
        }
//        highestAgeCustomer.printCustomerDetails();
        return highestAgeCustomer;
    }

    public static Customer[] sortCustomersByName(Customer[] customers){
        return null;
    }

    public static int customersWithAgeGreaterThan(Customer[] customers,int age){
        return 0;
    }

    public  static int customersWithAgeBetween(Customer[] customers,int minAge,int maxAge){
        return 0;
    }




}
