package strategy;

import java.math.BigDecimal;

/**
 * 策略类
 */
public interface Buyer {
    //计算金额
    BigDecimal calPrice(BigDecimal orderPrice);
}
