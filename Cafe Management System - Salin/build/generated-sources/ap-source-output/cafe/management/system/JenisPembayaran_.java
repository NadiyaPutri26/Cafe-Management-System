package cafe.management.system;

import cafe.management.system.Pembayaran;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-30T04:20:25", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(JenisPembayaran.class)
public class JenisPembayaran_ { 

    public static volatile SingularAttribute<JenisPembayaran, String> idJenis;
    public static volatile CollectionAttribute<JenisPembayaran, Pembayaran> pembayaranCollection;
    public static volatile SingularAttribute<JenisPembayaran, String> namaJenis;

}