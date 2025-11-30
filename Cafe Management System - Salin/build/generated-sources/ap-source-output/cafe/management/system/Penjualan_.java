package cafe.management.system;

import cafe.management.system.Customers;
import cafe.management.system.Kasir;
import cafe.management.system.Pembayaran;
import cafe.management.system.Produk;
import cafe.management.system.Waiters;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-30T04:20:25", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Penjualan.class)
public class Penjualan_ { 

    public static volatile SingularAttribute<Penjualan, Date> tanggalPenjualan;
    public static volatile SingularAttribute<Penjualan, Customers> idCustomers;
    public static volatile SingularAttribute<Penjualan, String> idPenjualan;
    public static volatile CollectionAttribute<Penjualan, Produk> produkCollection;
    public static volatile SingularAttribute<Penjualan, Integer> totalHarga;
    public static volatile SingularAttribute<Penjualan, Kasir> idKasir;
    public static volatile CollectionAttribute<Penjualan, Pembayaran> pembayaranCollection;
    public static volatile SingularAttribute<Penjualan, Waiters> idWaiters;

}