package uygulamalar;

import dto.UserReviewsDto;
import entityservice.ReviewService;
import java.util.List;

public class UserReviewsApp {

  public static void main(String[] args) {


    // 3. Ödev - Bir kullanıcının yapmış olduğu yorumlar

    ReviewService reviewService = new ReviewService();
    //find by user id
    List<UserReviewsDto> userReviewsList= reviewService.userReviews(4L);

    // Yorumları olan kullancılar : 1L, 2L, 3L, 4L ,7L

    if(userReviewsList.isEmpty()){
      System.out.println("Bu kullanıcının yorumu bulunmamaktadır.");
    }else {
      System.out.println("Bu kullanıcının yorumları : ");
      for (UserReviewsDto userReview : userReviewsList){
        System.out.println(userReview);
      }
    }

  }
}
