package DatabaseModelingMovie;

import makeMovieReservation.DiscountCondition;
import makeMovieReservation.Money;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;

    private Duration runningTime;

    private Money fee;

    private List<DiscountCondition> discountConditions;

    private MovieType movieType;

    private Money discountAmount;

    private double discoountPercent;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(Duration runningTime) {
        this.runningTime = runningTime;
    }

    public Money getFee() {
        return fee;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public List<DiscountCondition> getDiscountConditions() {
        return discountConditions;
    }

    public void setDiscountConditions(List<DiscountCondition> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public Money getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getDiscoountPercent() {
        return discoountPercent;
    }

    public void setDiscoountPercent(double discoountPercent) {
        this.discoountPercent = discoountPercent;
    }
}
