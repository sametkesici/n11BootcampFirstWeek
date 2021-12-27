package dto;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductReviewDto {


  private String productName;

  private String categoryName;

  private BigDecimal price;

  private String userName;

  private String userLastName;

  private String mail;

  private String phoneNumber;

  private String review;

  private Date reviewDate;

  @Override
  public String toString() {
    return "ProductReviewDto{" + "productName='" + productName + '\'' + ", categoryName='" + categoryName + '\''
        + ", price=" + price + ", userName='" + userName + '\'' + ", userLastName='" + userLastName + '\'' + ", mail='"
        + mail + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", review='" + review + '\'' + ", reviewDate="
        + reviewDate + '}';
  }


}
