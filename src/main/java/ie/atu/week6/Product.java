package ie.atu.week6;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Min(value=0,message="id must be an integer above 0")
    private int id;
    @NotBlank(message="product name cannot be blank")
    private String name;
    @Positive(message = "price must be positive")
    private double price;
}