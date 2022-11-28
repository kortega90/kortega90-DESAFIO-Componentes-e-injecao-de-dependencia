package com.kortega.services;


import com.kortega.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingServices {

    public Double shippnent (Order order){

        if (order.getBasic() < 100.00){
            return 20.0;
        }
        else if (order.getBasic() < 200) {
            return 12.0;
        }
        else {
        return 0.0;
        }
    }
}
