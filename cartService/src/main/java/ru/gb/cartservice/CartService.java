package ru.gb.cartservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartItemRepository cartItemRepository;

    public CartItem addCartItem(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    public List<CartItem> getCartItemsByUserId(Long userId) {
        return cartItemRepository.findByUserId(userId);
    }

    public void deleteCartItem(Long cartItemId) {
        cartItemRepository.deleteById(cartItemId);
    }


    public CartItem updateCartItemQuantity(Long cartItemId, int quantity) {
        CartItem cartItem = cartItemRepository.findById(cartItemId)
                .orElseThrow(() -> new ResourceNotFoundException("CartItem not found for this id :: " + cartItemId));

        cartItem.setQuantity(quantity);

        return cartItemRepository.save(cartItem);
    }


    public void clearUserCart(Long userId) {
        List<CartItem> userCartItems = cartItemRepository.findByUserId(userId);
        cartItemRepository.deleteAll(userCartItems);
    }
}

