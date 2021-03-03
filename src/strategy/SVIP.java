package strategy;

import java.math.BigDecimal;

/**
 * svip实现类
 */
public class SVIP implements Buyer{
    @Override
    public BigDecimal calPrice(BigDecimal orderPrice) {
        return orderPrice.multiply(new BigDecimal(0.8));
    }
}
