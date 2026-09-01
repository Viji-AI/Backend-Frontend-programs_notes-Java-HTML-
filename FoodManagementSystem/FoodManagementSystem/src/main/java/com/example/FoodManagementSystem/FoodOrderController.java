package com.example.FoodManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/orders")
public class FoodOrderController {
    @Autowired
    private FoodOrderService foodOrderService;
    @GetMapping
    public List<FoodOrder> getAllOrders(){
        return foodOrderService.getOrders();
    }
    @GetMapping("/{id}")
    public FoodOrder getOrderById(@PathVariable int id){
        return foodOrderService.getOrderById(id);
    }
    @PostMapping
    public String addOrder(@RequestBody FoodOrder order){
        foodOrderService.addOrder(order);
        return "Order added successfully";
    }
    @PutMapping
    public String updateOrder(@RequestBody FoodOrder order) {
        return foodOrderService.updateOrder(order);
    }
    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable int id) {
        return foodOrderService.deleteOrder(id);
    }
}
