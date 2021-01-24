package microservice.ccs.forexservice.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ExchangeValue {
  
  @Id
  private Long id;
  
  @Column(name="currency_from")
  private String from;
  
  @Column(name="currency_to")
  private String to;
  
  private BigDecimal conversionMultiple;
  private int port;
  
  public ExchangeValue() {
    
  }
  

  public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
    super();
    this.id = id;
    this.from = from;
    this.to = to;
    this.conversionMultiple = conversionMultiple;
  }


  public BigDecimal getConversionMultiple() {
    return conversionMultiple;
  }
  

}
