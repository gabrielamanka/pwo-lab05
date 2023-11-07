package pwo.seq;

import java.math.BigDecimal;

public class LucasGenerator extends FibonacciGenerator {

    private static final BigDecimal TWO = BigDecimal.valueOf(2);

    public LucasGenerator() {
        current = TWO;
        f_2 = TWO;
    }

    @Override
    public void reset() {
        super.reset();
        current = TWO;
        f_2 = TWO;
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return TWO;
        }
        return super.nextTerm();
    }
}
