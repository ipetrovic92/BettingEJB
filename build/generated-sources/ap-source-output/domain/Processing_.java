package domain;

import domain.Game;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-09-27T23:15:34")
@StaticMetamodel(Processing.class)
public class Processing_ { 

    public static volatile SingularAttribute<Processing, String> processingOutcome;
    public static volatile ListAttribute<Processing, Game> gameList;
    public static volatile SingularAttribute<Processing, Integer> id;

}