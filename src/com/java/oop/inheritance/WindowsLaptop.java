package com.java.oop.inheritance;

public class WindowsLaptop extends Laptop{

    public WindowsLaptop() {
        super();
        System.out.println("Windows Constructor called");
    }

    public WindowsLaptop(int id, String name, int maxRetailPrice, float discountPercentage, float rating, boolean isAvailable, int hardDiskSize, int ram, String operatingSystem) {
        super(id, name, maxRetailPrice, discountPercentage, rating, isAvailable, hardDiskSize, ram, operatingSystem);
    }
}
