package com.Sathish.Ecommerce.service;

import com.Sathish.Ecommerce.entity.Cart;

import java.math.BigDecimal;
import java.util.List;

public interface CartService {
    public List<Cart> findAll();
    public void addToCart(int productId, int quantity);
//    public void addToCart(Cart cart);
    public BigDecimal calculateTotalPrice();
    public void remove(int id);
}
