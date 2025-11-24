package cafe.management.system;

import cafe.management.system.JenisPembayaran;
import cafe.management.system.Kasir;
import cafe.management.system.Penjualan;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-21T19:11:52", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pembayaran.class)
public class Pembayaran_ { 

    public static volatile SingularAttribute<Pembayaran, Date> tanggalBayar;
    public static volatile SingularAttribute<Pembayaran, BigInteger> totalBayar;
    public static volatile SingularAttribute<Pembayaran, Penjualan> idPenjualan;
    public static volatile SingularAttribute<Pembayaran, JenisPembayaran> idJenis;
    public static volatile SingularAttribute<Pembayaran, String> statusBayar;
    public static volatile SingularAttribute<Pembayaran, Kasir> idKasir;
    public static volatile SingularAttribute<Pembayaran, String> idPembayaran;

}