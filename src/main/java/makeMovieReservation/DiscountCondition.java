package makeMovieReservation;

import makeMovieReservation.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
