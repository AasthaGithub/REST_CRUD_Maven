package com.lti.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.lti.dao.ProductDao;
import com.lti.entities.Product;

@Path("products")
public class ProductService {
    private ProductDao dao = new ProductDao();
    
    //   // http://localhost:8080/ProductCatalog_Maven_REST/rest/products  
 // http://localhost:8080/ProductCatalog_Maven_REST/api/products
    @GET 
    @Produces({"application/json","application/json"}) //@GET @Produces({"application/json","application/xml"})
    public Product[] findAll() {
        return dao.getAll();
    }
    
    //  http://localhost:8080/ProductCatalog_Maven_REST/api/products/by?id=101
    
    @GET  
    @Path("by") 
    @Produces({"application/json","application/xml"})
    public Product find(@QueryParam("id") int id) {
        return dao.findById(id);
    }
}
