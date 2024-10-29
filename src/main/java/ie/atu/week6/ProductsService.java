package ie.atu.week6;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {
    private List<Product> myList = new ArrayList<>();
    public List<Product> addProduct(Product product)
    {
        //imagine we have a connection to a database
        myList.add(product);
        return myList;
    }
    public List<Product> getProduct()
    {
        return myList;
    }

    public List<Product> putProduct(@PathVariable int id, @RequestBody Product product)
    {
        for (int count =0;count <myList.size();count++)
        {
            if(myList.get(count).getId()==id)
            {
                myList.set(count,product);
            }
        }
        return myList;
    }

    public List<Product> deleteProduct(@PathVariable int id)
    {
        for (int count =0;count <myList.size();count++)
        {
            if(myList.get(count).getId()==id)
            {
                myList.remove(count);
            }
        }
        return myList;
    }
}