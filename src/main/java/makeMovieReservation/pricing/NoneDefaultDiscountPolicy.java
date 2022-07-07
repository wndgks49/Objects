package makeMovieReservation.pricing;

import makeMovieReservation.DefaultDiscountPolicy;
import makeMovieReservation.Money;
import makeMovieReservation.Screening;

public class NoneDefaultDiscountPolicy extends DefaultDiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
