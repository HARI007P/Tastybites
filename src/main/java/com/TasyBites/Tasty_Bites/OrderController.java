package com.TasyBites.Tasty_Bites;


import com.TasyBites.Tasty_Bites.Order;
import com.TasyBites.Tasty_Bites.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class OrderController {

    @Autowired
    private OrderRepository orderRepo;

    @GetMapping("/order")
    public String showOrderForm(Model model) {
        model.addAttribute("order", new Order());
        return "order";
    }

    @PostMapping("/order")
    public String placeOrder(@ModelAttribute Order order, Model model) {
        order.setStatus("Pending");

        // Example price logic
        double pricePerUnit = switch (order.getItemName().toLowerCase()) {
            case "pizza" -> 150;
            case "burger" -> 80;
            case "samosa" -> 20;
            case "coke" -> 30;
            default -> 50;
        };
        order.setTotalPrice(pricePerUnit * order.getQuantity1());

        orderRepo.save(order);
        model.addAttribute("order", order);
        return "order-success";
    }

    @GetMapping("/orders")
    public String viewAllOrders(Model model) {
        model.addAttribute("orders", orderRepo.findAll());
        return "orders";
    }
}
