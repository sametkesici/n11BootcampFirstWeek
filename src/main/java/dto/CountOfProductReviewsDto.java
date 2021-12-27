package dto;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class CountOfProductReviewsDto {

  private Long productId;

  private String productName;

  private BigDecimal price;

  private Long countOfReview;


}
