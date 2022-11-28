package com.kortega.services;


import com.kortega.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingServices shippingServices;

    public Double total (Order order){
        return order.getBasic() * (1- (order.getDiscount()/100)) + shippingServices.shippnent(order);
    }
}
