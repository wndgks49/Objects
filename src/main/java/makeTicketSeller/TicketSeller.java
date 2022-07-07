package makeTicketSeller;

public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice =ticketOffice;
    }

//    public TicketOffice getTicketOffice(){
//        return ticketOffice;
//    } 티켓 판매자가 더이상 티켓 오피스로부터 자율성을 얻게되었다.  티켓 오피스로부터 접근을 막았고 이것을 캡슐화 라고 한다.


    public void sellTo(Audience audience){
     if(audience.getBag().hasInvitation()){
         Ticket ticket = ticketOffice.getTicket();
         audience.getBag().setTicket(ticket);
     }else{
         Ticket ticket = ticketOffice.getTicket(); //티켓이 존재하고
         audience.getBag().minusAmount(ticket.getFee()); // 관람객이 돈을 지불하고
         ticketOffice.plusAmount(ticket.getFee());// 사무실이 금액이 올라가고
         audience.getBag().minusAmount(ticket.getFee()); // 관람객은 돈이 빠져나가고
         audience.getBag().setTicket(ticket); // 관람객은 티켓을  받는다.

     }
    }
}
