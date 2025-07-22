package com.TasyBites.Tasty_Bites;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.TasyBites.Tasty_Bites.PaymentRepository;

@Controller
public class PaymentController {
    @Autowired private PaymentRepository payRepo;

    @GetMapping("/payment")
    public String payForm() {
        return "payment";
    }

    @PostMapping("/payment")
    public String submitPayment(@RequestParam String name,
                                @RequestParam String address,
                                @RequestParam String utr) {
        Payment p = new Payment();
        p.setName(name); p.setAddress(address); p.setUtr(utr);
        payRepo.save(p);
        return "success";
    }
}
