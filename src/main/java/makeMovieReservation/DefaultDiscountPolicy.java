package makeMovieReservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {

    private List<DiscountCondition> conditions= new ArrayList<>();

    public DefaultDiscountPolicy(DiscountCondition ...conditions){
        this.conditions = Arrays.asList(conditions);// 자식 생성자 에서 this(condition) 해서 코드 재사용.
    }

    public Money calculateDiscountAmount(Screening screening){
        for(DiscountCondition each : conditions){
            if(each.isSatisfiedBy(screening)){
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
