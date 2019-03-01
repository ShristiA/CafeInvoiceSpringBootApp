package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Iterator;

@Controller
public class HomeController {

    @Autowired
    MenuRepository menuRepository;



    double sum = 0.0;

    @GetMapping("/")
    public String homepage(Model model){
        model.addAttribute("menu", new Menu());
        return "menuForm";

    }
    @PostMapping("/process")
    public String storingMenuItems(@ModelAttribute Menu menu, Model model, Model model1){
        menu.setTotalcost(menu.getPrice(), menu.getQuantity());
        menuRepository.save(menu);
        model.addAttribute("menus", menuRepository.findAll());
        ArrayList<Double>totalCostSum= new ArrayList<>();
        totalCostSum.add(menu.getTotalcost());

        for(Double totalSum : totalCostSum) {

            sum += totalSum;
            model1.addAttribute("sum" , sum);
        }

        System.out.println(sum);
        return "orderList";
    }




}
