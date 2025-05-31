package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {
    public static void main(String[] args) throws Exception {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));

        Comparator<Product> comp = (prod1, prod2) -> {
            return prod1.getName().toUpperCase().compareTo(prod2.getName().toUpperCase());
        };

        list.sort(comp);

        for (Product prod : list) {
            System.out.println(prod);
        }
    }
}
