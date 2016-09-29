package domain;

import domain.Game;
import domain.Status;
import domain.Ticket;
import domain.TicketMatchPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-09-27T23:15:34")
@StaticMetamodel(TicketMatch.class)
public class TicketMatch_ { 

    public static volatile SingularAttribute<TicketMatch, Game> game;
    public static volatile SingularAttribute<TicketMatch, Ticket> ticket;
    public static volatile SingularAttribute<TicketMatch, Integer> resultPrediction;
    public static volatile SingularAttribute<TicketMatch, TicketMatchPK> ticketMatchPK;
    public static volatile SingularAttribute<TicketMatch, Double> odd;
    public static volatile SingularAttribute<TicketMatch, Status> status;

}