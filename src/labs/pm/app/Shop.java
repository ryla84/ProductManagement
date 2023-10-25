/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labs.pm.app;

import java.math.BigDecimal;
import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.Rating;
import java.time.LocalDate;
import java.util.Locale;
import labs.pm.data.ProductManager;

/**
 *
 * @author milad
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductManager pm = new ProductManager(Locale.UK);

        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.printProductReport(p1);
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "NICE HOT CUP OF TEA");
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "GOOD TEA");
        pm.printProductReport(p1);

        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.printProductReport(p2);
        p2 = pm.reviewProduct(p2, Rating.FOUR_STAR, "NICE HOT CUP OF TEA");
        p2 = pm.reviewProduct(p2, Rating.FOUR_STAR, "GOOD TEA");
        pm.printProductReport(p2);

        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.NOT_RATED, LocalDate.now().plusDays(2));
        pm.printProductReport(p3);
        p3 = pm.reviewProduct(p3, Rating.FOUR_STAR, "NICE HOT CUP OF TEA");
        p3 = pm.reviewProduct(p3, Rating.FOUR_STAR, "GOOD TEA");
        pm.printProductReport(p3);

        Product p4 = pm.createProduct(104, "Cookie", BigDecimal.valueOf(2.99), Rating.NOT_RATED, LocalDate.now());
        pm.printProductReport(p4);
        p4 = pm.reviewProduct(p4, Rating.FOUR_STAR, "NICE HOT CUP OF TEA");
        p4 = pm.reviewProduct(p4, Rating.FOUR_STAR, "GOOD TEA");
        pm.printProductReport(p4);

        Product p5 = pm.createProduct(105, "Hot Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED);
        pm.printProductReport(p5);
        p5 = pm.reviewProduct(p5, Rating.FOUR_STAR, "NICE HOT CUP OF TEA");
        p5 = pm.reviewProduct(p5, Rating.FOUR_STAR, "GOOD TEA");
        pm.printProductReport(p5);
        
        Product p6 = pm.createProduct(106, "Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED, LocalDate.now().plusDays(2));
        pm.printProductReport(p6);
        p6 = pm.reviewProduct(p6, Rating.FOUR_STAR, "NICE HOT CUP OF TEA");
        p6 = pm.reviewProduct(p6, Rating.FOUR_STAR, "GOOD TEA");
        pm.printProductReport(p6);

//        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
//        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now());
//        Product p5 = p3.applyRating(Rating.THREE_STAR);
//        Product p6 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(3.99), Rating.FIVE_STAR);
//        Product p7 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p8 = p4.applyRating(Rating.FIVE_STAR);
//        Product p9 = p1.applyRating(Rating.TWO_STAR);
//        System.out.println(p6.equals(p7));
//        System.out.println(p1.getBestBefore());
//        System.out.println(p3.getBestBefore());
        //        System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " + p1.getDiscount() + " " + p1.getRating().getStars());
        //        System.out.println(p2.getId() + " " + p2.getName() + " " + p2.getPrice() + " " + p2.getDiscount() + " " + p2.getRating().getStars());
        //        System.out.println(p3.getId() + " " + p3.getName() + " " + p3.getPrice() + " " + p3.getDiscount() + " " + p3.getRating().getStars());
        //        System.out.println(p4.getId() + " " + p4.getName() + " " + p4.getPrice() + " " + p4.getDiscount() + " " + p4.getRating().getStars());
        //        System.out.println(p5.getId() + " " + p5.getName() + " " + p5.getPrice() + " " + p5.getDiscount() + " " + p5.getRating().getStars());
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//        System.out.println(p6);
//        System.out.println(p7);
//        System.out.println(p8);
//        System.out.println(p9);
    }

}
