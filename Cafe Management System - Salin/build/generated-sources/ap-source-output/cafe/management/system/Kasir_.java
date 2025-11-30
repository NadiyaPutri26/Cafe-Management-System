package cafe.management.system;

import cafe.management.system.Pembayaran;
import cafe.management.system.Penjualan;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-30T04:20:25", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Kasir.class)
public class Kasir_ { 

    public static volatile CollectionAttribute<Kasir, Penjualan> penjualanCollection;
    public static volatile SingularAttribute<Kasir, Date> shiftKasir;
    public static volatile SingularAttribute<Kasir, Integer> gajiKasir;
    public static volatile SingularAttribute<Kasir, String> idKasir;
    public static volatile SingularAttribute<Kasir, String> namaKasir;
    public static volatile CollectionAttribute<Kasir, Pembayaran> pembayaranCollection;

}