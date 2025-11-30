package cafe.management.system;

import cafe.management.system.Customers;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-30T04:20:25", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Membership.class)
public class Membership_ { 

    public static volatile SingularAttribute<Membership, String> namaMember;
    public static volatile SingularAttribute<Membership, Integer> poinMember;
    public static volatile SingularAttribute<Membership, Date> tanggalDaftar;
    public static volatile SingularAttribute<Membership, Customers> idCustomers;
    public static volatile SingularAttribute<Membership, String> idMember;
    public static volatile CollectionAttribute<Membership, Customers> customersCollection;

}