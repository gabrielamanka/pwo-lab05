package pwo.seq;

import java.math.BigDecimal;

public class TribonacciGenerator extends FibonacciGenerator {

    private static final BigDecimal ZERO = BigDecimal.ZERO;
    private static final BigDecimal ONE = BigDecimal.ONE;

    public TribonacciGenerator() {
        f_3 = ZERO;
    }

    @Override
    public void reset() {
        super.reset();
        f_3 = ZERO;
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            BigDecimal temp = current;
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = temp;
        } else if (lastIndex == 2) {
            current = ONE;
        } else {
            current = ZERO;
        }
        lastIndex++;
        return current;
    }
}
