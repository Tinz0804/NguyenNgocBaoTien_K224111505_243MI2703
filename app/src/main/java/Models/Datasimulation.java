package Models;

import java.util.ArrayList;
import java.util.List;

public class Datasimulation {
    public static List<Account> simulateAccounts() {
        List<Account> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(new Account(i, "user" + i, "pass" + i));
        }
        return list;
    }

    public static List<Product> simulateProducts() {
        List<Product> list = new ArrayList<>();

        list.add(new Product(1, "P001", "iPhone 14 Pro Max", 1199.99,
                "https://picsum.photos/200/300"));
        list.add(new Product(2, "P002", "Samsung Galaxy S23 Ultra", 999.99,
                "https://images.samsung.com/is/image/samsung/p6pim/vn/2302/gallery/vn-galaxy-s23-ultra-thumb-534828795.png"));
        list.add(new Product(3, "P003", "Sony WH-1000XM5", 399.99,
                "https://m.media-amazon.com/images/I/51mmB+XW2eL._AC_SL1500_.jpg"));
        list.add(new Product(4, "P004", "Dell XPS 13", 1099.00,
                "https://m.media-amazon.com/images/I/71wzN5s2noL._AC_SL1500_.jpg"));
        list.add(new Product(5, "P005", "Logitech MX Master 3S", 99.99,
                "https://m.media-amazon.com/images/I/61ni3t1ryQL._AC_SL1500_.jpg"));
        list.add(new Product(6, "P006", "Apple MacBook Air M2", 1249.00,
                "https://m.media-amazon.com/images/I/71vFKBpKakL._AC_SL1500_.jpg"));
        list.add(new Product(7, "P007", "Asus ROG Zephyrus", 1499.00,
                "https://m.media-amazon.com/images/I/81Nl1w1LQwL._AC_SL1500_.jpg"));
        list.add(new Product(8, "P008", "Canon EOS R50", 749.00,
                "https://m.media-amazon.com/images/I/81PYyX4kWwL._AC_SL1500_.jpg"));
        list.add(new Product(9, "P009", "Samsung Smart TV 55", 699.99,
                "https://m.media-amazon.com/images/I/81eA7NzVJwL._AC_SL1500_.jpg"));
        list.add(new Product(10, "P010", "Xiaomi Redmi Note 12", 229.00,
                "https://m.media-amazon.com/images/I/61pT2DkLfnL._AC_SL1500_.jpg"));

        list.add(new Product(11, "P011", "GoPro HERO11", 399.00,
                "https://m.media-amazon.com/images/I/81cM6ssA5eL._AC_SL1500_.jpg"));
        list.add(new Product(12, "P012", "Nintendo Switch OLED", 349.99,
                "https://m.media-amazon.com/images/I/61-PblYntsL._AC_SL1500_.jpg"));
        list.add(new Product(13, "P013", "LG Ultragear Gaming Monitor", 279.00,
                "https://m.media-amazon.com/images/I/71xTSeZyNHL._AC_SL1500_.jpg"));
        list.add(new Product(14, "P014", "Apple Watch Series 9", 399.00,
                "https://m.media-amazon.com/images/I/71U3hzYWWJL._AC_SL1500_.jpg"));
        list.add(new Product(15, "P015", "Kindle Paperwhite", 139.99,
                "https://m.media-amazon.com/images/I/61SP4aZTPVL._AC_SL1000_.jpg"));
        list.add(new Product(16, "P016", "Samsung Galaxy Buds2 Pro", 229.00,
                "https://m.media-amazon.com/images/I/61xcNEupL._AC_SL1500_.jpg"));
        list.add(new Product(17, "P017", "HP Pavilion Desktop", 649.00,
                "https://m.media-amazon.com/images/I/81PDcGz5ZzL._AC_SL1500_.jpg"));
        list.add(new Product(18, "P018", "Philips Hue Smart Bulb", 49.99,
                "https://m.media-amazon.com/images/I/61yV9jGzSxL._AC_SL1500_.jpg"));
        list.add(new Product(19, "P019", "DJI Mini 3 Drone", 469.00,
                "https://m.media-amazon.com/images/I/61CChnhFVwL._AC_SL1500_.jpg"));
        list.add(new Product(20, "P020", "Anker PowerCore 20000mAh", 59.99,
                "https://m.media-amazon.com/images/I/61oiMqC7VGL._AC_SL1500_.jpg"));

        return list;
    }
}
