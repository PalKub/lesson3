package figure;

import java.math.BigDecimal;

class Whiskey implements Alcohol {

    private BigDecimal percentage = new BigDecimal("0.4");

    @Override
    public double getPercentage() {
        return percentage.doubleValue();
    }

    @Override
    public String getName() {
        return "Whiskey";
    }
}
