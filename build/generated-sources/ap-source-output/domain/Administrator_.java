package domain;

import domain.Game;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-09-27T23:15:34")
@StaticMetamodel(Administrator.class)
public class Administrator_ { 

    public static volatile SingularAttribute<Administrator, String> firstName;
    public static volatile SingularAttribute<Administrator, String> lastName;
    public static volatile SingularAttribute<Administrator, String> password;
    public static volatile ListAttribute<Administrator, Game> gameList;
    public static volatile SingularAttribute<Administrator, String> email;

}