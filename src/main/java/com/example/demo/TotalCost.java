package com.example.demo;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class TotalCost extends Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double sum;

    @OneToOne(mappedBy = "totalCost")
    private Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public TotalCost() {
    }

    public TotalCost(Double sum) {
        this.sum = sum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum() {
        ArrayList<Double> totalCostSum= new ArrayList<>();
        totalCostSum.add(menu.getTotalcost());

        for(Double totalSum : totalCostSum) {

            sum += totalSum;
        }
        this.sum = sum;
    }
}
