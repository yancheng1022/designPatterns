package strategy;

import java.math.BigDecimal;

/**
 * vip实现类
 */
public class VIP implements Buyer{
    @Override
    public BigDecimal calPrice(BigDecimal orderPrice) {
        return orderPrice.multiply(new BigDecimal(0.9));
    }
}
