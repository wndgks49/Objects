package makeMovieReservation.pricing;

import makeMovieReservation.DiscountCondition;
import makeMovieReservation.DefaultDiscountPolicy;
import makeMovieReservation.Money;
import makeMovieReservation.Screening;

public class AmountDefaultDiscountPolicy extends DefaultDiscountPolicy {

    private Money discountAmount;

    public AmountDefaultDiscountPolicy(Money discountAmount, DiscountCondition... conditions){
        super(conditions); // 부모생성자 가져와서 사용~
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
