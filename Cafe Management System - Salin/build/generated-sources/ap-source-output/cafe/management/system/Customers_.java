package cafe.management.system;

import cafe.management.system.Membership;
import cafe.management.system.Penjualan;
import cafe.management.system.Vale;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-30T04:20:25", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Customers.class)
public class Customers_ { 

    public static volatile CollectionAttribute<Customers, Membership> membershipCollection;
    public static volatile SingularAttribute<Customers, String> idCustomers;
    public static volatile CollectionAttribute<Customers, Penjualan> penjualanCollection;
    public static volatile CollectionAttribute<Customers, Vale> valeCollection;
    public static volatile SingularAttribute<Customers, Membership> idMember;
    public static volatile SingularAttribute<Customers, String> namaCustomers;

}