package domain;

import domain.Ticket;
import domain.TicketMatch;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-09-27T23:15:34")
@StaticMetamodel(Status.class)
public class Status_ { 

    public static volatile ListAttribute<Status, Ticket> ticketList;
    public static volatile SingularAttribute<Status, Integer> id;
    public static volatile SingularAttribute<Status, String> status;
    public static volatile ListAttribute<Status, TicketMatch> ticketMatchList;

}