package makeTicketSeller;

public class Audience {

    private Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

//    public Bag getBag(){
//        return bag;
//    } 가방은 관람객으로부터 접근을 차단했음. 결론적으로 bag의 내부적으로 캡슐화 성공함.


    public Long buy(Ticket ticket){
        return bag.Hold(ticket); // 관람객이 직접 가방을 뒤지는것이 아니라 가방이 티켓을 가지고 있다는것을 알고 해당 티켓은 가방에게 맡긴다 객체지향 세계에서는 가방도 살아있는 생물취급해야한다.
    }


}
