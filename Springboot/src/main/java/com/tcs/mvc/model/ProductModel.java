package com.tcs.mvc.model;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel
{
	@NotBlank(message="product name cannot be blank")
	private String name;
	@NotBlank(message="product name cannot be blank")
	private String brand;
	@NotBlank(message="product name cannot be blank")
	private String madeIn;
	@NotBlank(message="price must be greater than zero")
	private double price;
	@Min(value=1,message="quantity must be atleast 1")
	private int quantity;
	@DecimalMax(value="100.0",message="discount rate cannot exceed 100")
	private double discountrate;
	
}
