package makeTicketSeller;

public class Bag {

    private Long amount;

    private Invitation invitation;

    private Ticket ticket;
    //public 이였던 아래 메소드들이 아래에서 사용하는것이 아니라 객체 내부에서 자신이 책임지고 사용하여 다른데서 사용못하게 한다.
    public Long Hold(Ticket ticket){
        if(hasInvitation()){
            setTicket(ticket);
            return 0L;
        }else{
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    public Bag(Long amount){
        this(null, amount);
    }

    public Bag(Invitation invitation, Long amount){
        this.invitation = invitation;
        this.amount =amount;
    }


    public boolean hasInvitation(){
        return invitation  != null;
    }

    public boolean hasTicket(){
        return this.ticket != null;
    }

    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public void minusAmount (Long amount){
         this.amount -= amount;
    }

    public void plusAmount (Long amount){
         this.amount += amount;
    }



}
