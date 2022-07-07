package makeMovieReservation;

import java.time.LocalDateTime;

public class Screening {

    private Movie movie;

    private int sequence;

    private LocalDateTime whenScreend;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreend){
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreend = whenScreend;
    }

    public LocalDateTime getStartTime(){
        return whenScreend;
    }

    public boolean isSequence(int sequence){
        return this.sequence == sequence;
    }

    public Money getMovieFee(){
        return movie.getFee();
    }

    public Reservation reserve(Customer customer, int audienceCount){
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount){
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
