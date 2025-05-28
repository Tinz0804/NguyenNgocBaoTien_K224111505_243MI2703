package Models;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String productCode;
    private String productName;
    private double unitPrice;
    private String imageLink;

    public Product(int id, String productCode, String productName, double unitPrice, String imageLink) {
        this.id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.imageLink = imageLink;
    }

    public int getId() { return id; }
    public String getProductCode() { return productCode; }
    public String getProductName() { return productName; }
    public double getUnitPrice() { return unitPrice; }
    public String getImageLink() { return imageLink; }

    public void setId(int id) { this.id = id; }
    public void setProductCode(String productCode) { this.productCode = productCode; }
    public void setProductName(String productName) { this.productName = productName; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }
    public void setImageLink(String imageLink) { this.imageLink = imageLink; }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", imageLink='" + imageLink + '\'' +
                '}';
    }
}
