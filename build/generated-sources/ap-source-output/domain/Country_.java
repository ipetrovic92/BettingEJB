package domain;

import domain.Team;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-09-27T23:15:34")
@StaticMetamodel(Country.class)
public class Country_ { 

    public static volatile SingularAttribute<Country, String> name;
    public static volatile SingularAttribute<Country, Integer> id;
    public static volatile ListAttribute<Country, Team> teamList;

}