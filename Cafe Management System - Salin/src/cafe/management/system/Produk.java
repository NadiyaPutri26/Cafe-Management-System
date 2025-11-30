/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafe.management.system;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Huawei
 */
@Entity
@Table(name = "produk")
@NamedQueries({
    @NamedQuery(name = "Produk.findAll", query = "SELECT p FROM Produk p"),
    @NamedQuery(name = "Produk.findByIdProduk", query = "SELECT p FROM Produk p WHERE p.idProduk = :idProduk"),
    @NamedQuery(name = "Produk.findByNamaProduk", query = "SELECT p FROM Produk p WHERE p.namaProduk = :namaProduk"),
    @NamedQuery(name = "Produk.findByHargaProduk", query = "SELECT p FROM Produk p WHERE p.hargaProduk = :hargaProduk"),
    @NamedQuery(name = "Produk.findByTanggalMasukProduk", query = "SELECT p FROM Produk p WHERE p.tanggalMasukProduk = :tanggalMasukProduk")})
public class Produk implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_produk")
    private String idProduk;
    @Column(name = "nama_produk")
    private String namaProduk;
    @Column(name = "harga_produk")
    private Integer hargaProduk;
    @Column(name = "tanggal_masuk_produk")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggalMasukProduk;
    @ManyToMany(mappedBy = "produkCollection")
    private Collection<Penjualan> penjualanCollection;

    public Produk() {
    }

    public Produk(String idProduk) {
        this.idProduk = idProduk;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(String idProduk) {
        this.idProduk = idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public Integer getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(Integer hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public Date getTanggalMasukProduk() {
        return tanggalMasukProduk;
    }

    public void setTanggalMasukProduk(Date tanggalMasukProduk) {
        this.tanggalMasukProduk = tanggalMasukProduk;
    }

    public Collection<Penjualan> getPenjualanCollection() {
        return penjualanCollection;
    }

    public void setPenjualanCollection(Collection<Penjualan> penjualanCollection) {
        this.penjualanCollection = penjualanCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduk != null ? idProduk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produk)) {
            return false;
        }
        Produk other = (Produk) object;
        if ((this.idProduk == null && other.idProduk != null) || (this.idProduk != null && !this.idProduk.equals(other.idProduk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cafe.management.system.Produk[ idProduk=" + idProduk + " ]";
    }
    
}
