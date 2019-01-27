package figure;

import java.math.BigDecimal;

class Beer implements Alcohol {

    private BigDecimal percentage = new BigDecimal("0.05");

    @Override
    public double getPercentage() {
        return percentage.doubleValue();
    }

    @Override
    public String getName() {
        return "Beer";
    }
}
