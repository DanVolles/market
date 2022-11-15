package senaijavadev.market.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

// Variable declaration
        @Id
        @GeneratedValue (strategy = GenerationType.AUTO)
        private Integer id;
        private String productName;
        private String description;
        private Double value;


// Id
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

// productName
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

// Description
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

// Value
    public Double getValue() {
        return value;
    }
    public void setValue(Double value) {
        this.value = value;
    }

}
