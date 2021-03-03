package strategy;

import java.math.BigDecimal;

/**
 * 上下文类 - （收银台系统）
 */
public class CashContext {
    private Buyer buyer;
    public CashContext(Buyer buyer){
        this.buyer = buyer;
    }
    //计算
    public BigDecimal quota(BigDecimal price){
        return this.buyer.calPrice(price);
    }
}
