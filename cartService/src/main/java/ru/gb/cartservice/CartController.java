package ru.gb.cartservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping
    public ResponseEntity<CartItem> addCartItem(@RequestBody CartItem cartItem) {
        return ResponseEntity.ok(cartService.addCartItem(cartItem));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<CartItem>> getCartItemsByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(cartService.getCartItemsByUserId(userId));
    }

    @DeleteMapping("/{cartItemId}")
    public ResponseEntity<Void> deleteCartItem(@PathVariable Long cartItemId) {
        cartService.deleteCartItem(cartItemId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{cartItemId}")
    public ResponseEntity<CartItem> updateCartItemQuantity(@PathVariable Long cartItemId, @RequestParam int quantity) {
        return ResponseEntity.ok(cartService.updateCartItemQuantity(cartItemId, quantity));
    }

 
    @DeleteMapping("/clear/{userId}")
    public ResponseEntity<Void> clearUserCart(@PathVariable Long userId) {
        cartService.clearUserCart(userId);
        return ResponseEntity.ok().build();
    }
}
