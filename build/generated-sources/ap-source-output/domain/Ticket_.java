package domain;

import domain.BettingUser;
import domain.Status;
import domain.TicketMatch;
import domain.TicketPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-09-27T23:15:34")
@StaticMetamodel(Ticket.class)
public class Ticket_ { 

    public static volatile SingularAttribute<Ticket, Double> stake;
    public static volatile SingularAttribute<Ticket, Double> potentialWinnings;
    public static volatile SingularAttribute<Ticket, Date> paymentTime;
    public static volatile SingularAttribute<Ticket, Double> totalOdds;
    public static volatile SingularAttribute<Ticket, BettingUser> bettingUser;
    public static volatile SingularAttribute<Ticket, TicketPK> ticketPK;
    public static volatile ListAttribute<Ticket, TicketMatch> ticketMatchList;
    public static volatile SingularAttribute<Ticket, Status> status;

}