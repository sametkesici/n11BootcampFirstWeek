package uygulamalar;

import dto.ProductReviewDto;
import entityservice.ReviewService;
import java.util.List;

public class ReviewOfProductApp {

  public static void main(String[] args) {

    ReviewService reviewService = new ReviewService();

    // 1. Ödev (Bir ürüne ait yorumları listeleyen metod )


    // find reviews by product id
    List<ProductReviewDto>  listOfReviews = reviewService.findReviewOfProduct(1L);

    // Yorumları olan ürün Idleri  = 2L , 3L , 5L , 6L , 7L

    if(listOfReviews.isEmpty()) {
      System.out.println("ürüne ait bir yorum bulunmamaktadır.");
    }else {
      for(ProductReviewDto productReviewDto : listOfReviews){
        System.out.println("Ürüne ait yorumlar : ");
        System.out.println(productReviewDto.toString());
      }
    }
  }
}
