package entityservice;

import dao.ReviewDao;
import dto.CountOfProductReviewsDto;
import dto.ProductReviewDto;
import dto.UserReviewsDto;
import java.util.List;
import uygulamalar.CountOfReviewsApp;

public class ReviewService {

  private final ReviewDao reviewDao;

  public ReviewService (){
    reviewDao = new ReviewDao();
  }

  public List<ProductReviewDto> findReviewOfProduct(long productId){
    return reviewDao.findReviewOfProduct(productId);
  }

  public List<CountOfProductReviewsDto> countOfReviews(){

    List<CountOfProductReviewsDto> countReviews = reviewDao.countOfReviews();

    for(CountOfProductReviewsDto counts : countReviews )
    {
      if(  counts.getCountOfReview() < 1 )
      {
        counts.setCountOfReview(null);
      }
    }

    return countReviews;

  }

  public List<UserReviewsDto> userReviews (long userId){
    return reviewDao.userReviews(userId);
  }



}
