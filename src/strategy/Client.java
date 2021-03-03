package strategy;

import java.math.BigDecimal;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext(new SVIP());
        BigDecimal quota = cashContext.quota(new BigDecimal(100));
        System.out.println(quota);
    }
}
