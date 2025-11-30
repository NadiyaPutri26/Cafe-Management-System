package cafe.management.system;

import cafe.management.system.Penjualan;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-30T04:20:25", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Waiters.class)
public class Waiters_ { 

    public static volatile SingularAttribute<Waiters, Integer> gajiWaiters;
    public static volatile CollectionAttribute<Waiters, Penjualan> penjualanCollection;
    public static volatile SingularAttribute<Waiters, String> namaWaiters;
    public static volatile SingularAttribute<Waiters, Date> shiftWaiters;
    public static volatile SingularAttribute<Waiters, String> idWaiters;

}