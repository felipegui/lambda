package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product prod1, Product prod2) {
        return prod1.getName().toUpperCase().compareTo(prod2.getName().toUpperCase());
    }

}
