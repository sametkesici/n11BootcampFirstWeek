package dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class UserReviewsDto {

  private Long userId;

  private String userName;

  private String productName;

  private String review;

  private Date reviewDate;


}
