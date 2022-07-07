package makeTicketSeller;

public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller){
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience){
        ticketSeller.sellTo(audience);
    }
}
//객체지향 세계에서는 모든것이 능동적이고 자율적인 존재로 바뀐다 능동적이고 자율적인 존재로 소프트웨어 객체를 설계하는 원칙을 의인화 라고 부른다.