package com.example.demo;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
    public class Menu {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private String name;
        private String description;
        private Double price;
        private String image;
        private int quantity;
        private Double totalcost;


    public Menu() {
        }

        public Menu(String name, String description, Double price, String image, int quantity, Double totalcost, Double total) {
            this.name = name;
            this.description = description;
            this.price = price;
            this.image = image;
            this.quantity = quantity;
            this.totalcost=totalcost;

        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        public Double getTotalcost() {

            return totalcost;
        }

        public void setTotalcost(double price, int quantity) {
            totalcost= price*quantity;
            this.totalcost = totalcost;
        }



    }

