package dao;

import base.BaseDao;
import dto.CountOfProductReviewsDto;
import dto.ProductReviewDto;
import dto.UrunDetayDto;
import dto.UserReviewsDto;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.query.Query;

public class ReviewDao extends BaseDao {

  public List<ProductReviewDto> findReviewOfProduct(long productId) {

    String sql = " select "
        + "new dto.ProductReviewDto( urun.adi , kategori.adi , urun.fiyat , user.name , user.lastName, user.mail , user.phoneNumber , customerreview.review , customerreview.reviewDate ) "
        + "from User user  , CustomerReview customerreview  , Kategori kategori  , Urun urun  "
        + "where customerreview.product.id = urun.id and urun.id = :urunId and  customerreview.user.id = user.id and kategori.id = urun.kategori.id";

    Query query = getCurrentSession().createQuery(sql);
    query.setParameter("urunId", productId);

    return query.list();
  }

  public List<CountOfProductReviewsDto> countOfReviews(){

    String sql = "select new dto.CountOfProductReviewsDto(urun.id, urun.adi, urun.fiyat, count(customerreview.id)) from Urun urun left outer join CustomerReview customerreview  on customerreview.product.id = urun.id group by urun.id";

    Query query = getCurrentSession().createQuery(sql);

    return query.list();

  }

  public List<UserReviewsDto> userReviews(long userId){

    String sql1 = " select "
        + "new dto.UserReviewsDto( user.id , user.name, urun.adi , customerreview.review , customerreview.reviewDate  ) "
        + "from User user  , CustomerReview customerreview  , Kategori kategori  , Urun urun  "
        + "where customerreview.product.id = urun.id and  customerreview.user.id = user.id and kategori.id = urun.kategori.id and user.id = :userId";

    Query query = getCurrentSession().createQuery(sql1);
    query.setParameter("userId", userId);

    return query.list();

  }



}
