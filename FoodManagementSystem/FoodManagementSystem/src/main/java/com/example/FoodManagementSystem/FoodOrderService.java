package com.example.FoodManagementSystem;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FoodOrderService {
    private List<FoodOrder> orders = new ArrayList<>();
    public FoodOrderService(){
        orders.add(new FoodOrder(1, "Burger",2,200));
        orders.add(new FoodOrder(2, "Pizza",1,500));
    }
    public List<FoodOrder> getOrders(){
        return orders;
    }
    public FoodOrder getOrderById(int id){
        for(FoodOrder order: orders){
            if(order.getOrderId()==id) {
                return order;
            }
        }
        return null;
    }
    public void addOrder(FoodOrder order) {
        orders.add(order);
    }
    public String updateOrder(FoodOrder order) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderId() == order.getOrderId()) {
                orders.set(i, order);
                return "Order updated successfully";
            }
        }
        return "Order not found";
    }
    public String deleteOrder(int id) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderId() == id) {
                orders.remove(i);
                return "Order deleted successfully";
            }
        }
        return "Order not found";
    }
}
