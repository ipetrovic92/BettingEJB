package domain;

import domain.Administrator;
import domain.Processing;
import domain.Team;
import domain.TicketMatch;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-09-27T23:15:34")
@StaticMetamodel(Game.class)
public class Game_ { 

    public static volatile SingularAttribute<Game, Double> homeOdds;
    public static volatile SingularAttribute<Game, String> score;
    public static volatile SingularAttribute<Game, Processing> processingStatus;
    public static volatile SingularAttribute<Game, Date> gameTime;
    public static volatile SingularAttribute<Game, Administrator> emailAdministrator;
    public static volatile SingularAttribute<Game, Team> awayTeam;
    public static volatile SingularAttribute<Game, Team> homeTeam;
    public static volatile SingularAttribute<Game, String> id;
    public static volatile SingularAttribute<Game, Double> drawOdds;
    public static volatile SingularAttribute<Game, Double> awayOdds;
    public static volatile ListAttribute<Game, TicketMatch> ticketMatchList;

}