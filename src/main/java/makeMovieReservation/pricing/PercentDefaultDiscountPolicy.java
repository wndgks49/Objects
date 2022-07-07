package makeMovieReservation.pricing;

import makeMovieReservation.DefaultDiscountPolicy;
import makeMovieReservation.Money;
import makeMovieReservation.Screening;

public class PercentDefaultDiscountPolicy extends DefaultDiscountPolicy {

    private double percent;

    public PercentDefaultDiscountPolicy(double percent){
        this.percent = percent;
    }
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
