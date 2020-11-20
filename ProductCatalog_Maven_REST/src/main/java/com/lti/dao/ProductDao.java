package com.lti.dao;



import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


import com.lti.entities.Product;

public class ProductDao {
    
    private static Map<Integer,Product> products = new HashMap<>();
    
    public ProductDao() {
        products.put(101,new Product("Mobile", "Samsung",2300));
        products.put(102,new Product("Charger", "Nokia",200));
        products.put(103,new Product("Battery", "Dell",4000));    
    }
    
    public Product findById(int id) {
        return products.get(id);
    }
    
    public Product[] getAll(){
        Collection<Product> values = products.values();
        return values.toArray(new Product[values.size()]);
    }
    public void consumeJSONRequest(Product p)
    {
        products.put(104, p);
        System.out.println(products);
       
    }
    
}