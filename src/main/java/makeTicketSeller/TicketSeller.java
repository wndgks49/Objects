package makeTicketSeller;

public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice =ticketOffice;
    }

//    public TicketOffice getTicketOffice(){
//        return ticketOffice;
//    } 티켓 판매자가 더이상 티켓 오피스로부터 자율성을 얻게되었다.  티켓 오피스로부터 접근을 막았고 이것을 캡슐화 라고 한다.


    public void sellTo(Audience audience){ // 객체 접근을 막고 메소드로 서로 알기만 해주기.
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
