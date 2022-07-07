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
        if(bag.hasInvitation()){
            bag.setTicket(ticket);
            return 0L;
        }else{
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }


}
