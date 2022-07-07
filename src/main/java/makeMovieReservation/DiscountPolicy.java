package makeMovieReservation;

public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);
}
