package domain;

import domain.Ticket;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-09-27T23:15:34")
@StaticMetamodel(BettingUser.class)
public class BettingUser_ { 

    public static volatile SingularAttribute<BettingUser, String> firstName;
    public static volatile SingularAttribute<BettingUser, String> lastName;
    public static volatile SingularAttribute<BettingUser, String> password;
    public static volatile ListAttribute<BettingUser, Ticket> ticketList;
    public static volatile SingularAttribute<BettingUser, Double> balance;
    public static volatile SingularAttribute<BettingUser, Date> dateOfBirth;
    public static volatile SingularAttribute<BettingUser, String> email;

}