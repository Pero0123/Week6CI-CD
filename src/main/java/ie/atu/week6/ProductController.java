package ie.atu.week6;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private ProductsService myProduct;
    private Product product;

    public ProductController(ProductsService myProduct) {
        this.myProduct = myProduct;
    }

    @PostMapping("/newProduct")
    public List<Product> newProduct(@Valid @RequestBody Product product)
    {
        this.product = product;
        //business logic to add this to a database
        //return list of all products from the database
        return myProduct.addProduct(product);
    }

    @GetMapping("/getProduct")
    public List<Product> getProduct()
    {
        return myProduct.getProduct();
    }

    @PutMapping("/{id}")
    public List<Product> putProduct(@PathVariable int id, @RequestBody Product product){
        return myProduct.putProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public List<Product> DeleteProduct(@PathVariable int id)
    {
        return myProduct.deleteProduct(id);
    }
}