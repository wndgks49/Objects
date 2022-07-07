package makeMovieReservation.pricing;

import makeMovieReservation.DiscountCondition;
import makeMovieReservation.Screening;

public class SequenceCondition implements DiscountCondition {


    private int sequence;

    public SequenceCondition(int sequence){
        this.sequence =sequence;
    }
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
