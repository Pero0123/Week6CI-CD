package ie.atu.week6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import java.util.ArrayList;

@RestController
public class ProductController {
   private ProductService myProduct;

   private ProductController(ProductService myProduct)
   {
       this.myProduct = myProduct;
   }

   @PostMapping("/newProduct")
    public List<Product> newProduct(@RequestBody Product product)
   {
       return myProduct.addProduct(product);
   }

   @GetMapping("/products")
    public List<Product> getAllProducts(){

   }
}
