package cafe.management.system;

import cafe.management.system.Penjualan;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-21T19:11:52", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Produk.class)
public class Produk_ { 

    public static volatile SingularAttribute<Produk, String> idProduk;
    public static volatile SingularAttribute<Produk, String> namaProduk;
    public static volatile CollectionAttribute<Produk, Penjualan> penjualanCollection;
    public static volatile SingularAttribute<Produk, Integer> hargaProduk;
    public static volatile SingularAttribute<Produk, Date> tanggalMasukProduk;

}