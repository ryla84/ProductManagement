/*
 * Copyright (C) 2023 milad
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author milad
 */
public class ProductManager {

    private Locale locale;
    private ResourceBundle resources;
    private DateTimeFormatter dateFormat;
    private NumberFormat moneyFormat;

    private Product product;
    private Review review;

    public ProductManager(Locale locale) {
        this.locale = locale;
        resources = ResourceBundle.getBundle("labs.pm.data.resources", locale);
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
        moneyFormat = NumberFormat.getCurrencyInstance(locale);
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {

        product = new Food(id, name, price, rating, bestBefore);
        return product;
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating) {
        product = new Drink(id, name, price, rating);
        return product;
    }

    public Product reviewProduct(Product product, Rating rating, String comments) {
        review = new Review(rating, comments);
        this.product = product.applyRating(rating);
        return this.product;
    }
}
