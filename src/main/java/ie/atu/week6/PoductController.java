package ie.atu.week6;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PoductController {
    private List<Product> myList = new ArrayList<>():
    @PostMapping("/newProduct")
    public List<Product> newProduct(@RequestBody Product product){
        return myList;
    }
}
