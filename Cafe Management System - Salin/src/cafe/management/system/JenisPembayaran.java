/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafe.management.system;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Huawei
 */
@Entity
@Table(name = "jenis_pembayaran")
@NamedQueries({
    @NamedQuery(name = "JenisPembayaran.findAll", query = "SELECT j FROM JenisPembayaran j"),
    @NamedQuery(name = "JenisPembayaran.findByIdJenis", query = "SELECT j FROM JenisPembayaran j WHERE j.idJenis = :idJenis"),
    @NamedQuery(name = "JenisPembayaran.findByNamaJenis", query = "SELECT j FROM JenisPembayaran j WHERE j.namaJenis = :namaJenis")})
public class JenisPembayaran implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_jenis")
    private String idJenis;
    @Column(name = "nama_jenis")
    private String namaJenis;
    @OneToMany(mappedBy = "idJenis")
    private Collection<Pembayaran> pembayaranCollection;

    public JenisPembayaran() {
    }

    public JenisPembayaran(String idJenis) {
        this.idJenis = idJenis;
    }

    public String getIdJenis() {
        return idJenis;
    }

    public void setIdJenis(String idJenis) {
        this.idJenis = idJenis;
    }

    public String getNamaJenis() {
        return namaJenis;
    }

    public void setNamaJenis(String namaJenis) {
        this.namaJenis = namaJenis;
    }

    public Collection<Pembayaran> getPembayaranCollection() {
        return pembayaranCollection;
    }

    public void setPembayaranCollection(Collection<Pembayaran> pembayaranCollection) {
        this.pembayaranCollection = pembayaranCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJenis != null ? idJenis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JenisPembayaran)) {
            return false;
        }
        JenisPembayaran other = (JenisPembayaran) object;
        if ((this.idJenis == null && other.idJenis != null) || (this.idJenis != null && !this.idJenis.equals(other.idJenis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cafe.management.system.JenisPembayaran[ idJenis=" + idJenis + " ]";
    }
    
}
