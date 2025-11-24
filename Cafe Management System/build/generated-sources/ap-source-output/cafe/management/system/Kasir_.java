package cafe.management.system;

import cafe.management.system.Pembayaran;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-21T19:11:52", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Kasir.class)
public class Kasir_ { 

    public static volatile SingularAttribute<Kasir, Date> shiftKasir;
    public static volatile SingularAttribute<Kasir, Integer> gajiKasir;
    public static volatile SingularAttribute<Kasir, String> idKasir;
    public static volatile SingularAttribute<Kasir, String> namaKasir;
    public static volatile CollectionAttribute<Kasir, Pembayaran> pembayaranCollection;

}