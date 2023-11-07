package pwo.seq;

import java.math.BigDecimal;

public class FibonacciGenerator extends Generator {

    private final BigDecimal ZERO = BigDecimal.ZERO;
    private final BigDecimal ONE = BigDecimal.ONE;

    public FibonacciGenerator() {
        current = ZERO;
        f_1 = ONE;
        f_2 = ZERO;
    }

    @Override
    public void reset() {
        super.reset();
        current = ZERO;
        f_1 = ONE;
        f_2 = ZERO;
    }

    @Override
    public BigDecimal nextTerm() {
        switch (lastIndex) {
            case 0:
                current = ZERO;
                break;
            case 1:
                current = ONE;
                break;
            default:
                current = f_1.add(f_2);
                f_2 = f_1;
                f_1 = current;
        }
        lastIndex++;
        return current;
    }
}
