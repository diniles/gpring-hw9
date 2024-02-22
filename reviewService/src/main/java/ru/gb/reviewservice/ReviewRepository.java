package ru.gb.reviewservice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findByProductId(Long productId);


    List<Review> findByUserId(Long userId);


    List<Review> findByRating(int rating);


    List<Review> findByProductIdAndRating(Long productId, int rating);


    void deleteByProductId(Long productId);


    void deleteByUserId(Long userId);
}
