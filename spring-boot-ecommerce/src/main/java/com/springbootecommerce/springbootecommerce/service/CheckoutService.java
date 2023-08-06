package com.springbootecommerce.springbootecommerce.service;

import com.springbootecommerce.springbootecommerce.dto.Purchase;
import com.springbootecommerce.springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
