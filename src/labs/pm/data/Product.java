/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labs.pm.data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import static java.math.RoundingMode.HALF_UP;
import static labs.pm.data.Rating.*;

/**
 *
 * @author milad
 */
public class Product {

    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;

    public Product() {
        this(0, "no name", BigDecimal.ZERO);
    }

    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(int id, String name, BigDecimal price) {
        this(id, name, price, NOT_RATED);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
    }

    public Rating getRating() {
        return rating;
    }

    public Product applyRating(Rating newRating) {
        return new Product(id, name, price, newRating);
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + price + ", " + getDiscount() + ", " + rating.getStars();
    }

}
