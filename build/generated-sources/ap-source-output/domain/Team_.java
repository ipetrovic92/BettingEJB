package domain;

import domain.Country;
import domain.Game;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-09-27T23:15:34")
@StaticMetamodel(Team.class)
public class Team_ { 

    public static volatile SingularAttribute<Team, String> name;
    public static volatile ListAttribute<Team, Game> gameList;
    public static volatile ListAttribute<Team, Game> gameList1;
    public static volatile SingularAttribute<Team, Integer> id;
    public static volatile SingularAttribute<Team, Country> countryId;

}