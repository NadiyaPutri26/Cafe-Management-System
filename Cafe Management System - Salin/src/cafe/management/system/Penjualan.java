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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Huawei
 */
@Entity
@Table(name = "penjualan")
@NamedQueries({
    @NamedQuery(name = "Penjualan.findAll", query = "SELECT p FROM Penjualan p"),
    @NamedQuery(name = "Penjualan.findByIdPenjualan", query = "SELECT p FROM Penjualan p WHERE p.idPenjualan = :idPenjualan"),
    @NamedQuery(name = "Penjualan.findByTanggalPenjualan", query = "SELECT p FROM Penjualan p WHERE p.tanggalPenjualan = :tanggalPenjualan"),
    @NamedQuery(name = "Penjualan.findByTotalHarga", query = "SELECT p FROM Penjualan p WHERE p.totalHarga = :totalHarga")})
public class Penjualan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_penjualan")
    private String idPenjualan;
    @Column(name = "tanggal_penjualan")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggalPenjualan;
    @Column(name = "total_harga")
    private Integer totalHarga;
    @JoinTable(name = "dipesan_dalam", joinColumns = {
        @JoinColumn(name = "id_penjualan", referencedColumnName = "id_penjualan")}, inverseJoinColumns = {
        @JoinColumn(name = "id_produk", referencedColumnName = "id_produk")})
    @ManyToMany
    private Collection<Produk> produkCollection;
    @OneToMany(mappedBy = "idPenjualan")
    private Collection<Pembayaran> pembayaranCollection;
    @JoinColumn(name = "id_customers", referencedColumnName = "id_customers")
    @ManyToOne
    private Customers idCustomers;
    @JoinColumn(name = "id_kasir", referencedColumnName = "id_kasir")
    @ManyToOne
    private Kasir idKasir;
    @JoinColumn(name = "id_waiters", referencedColumnName = "id_waiters")
    @ManyToOne
    private Waiters idWaiters;

    public Penjualan() {
    }

    public Penjualan(String idPenjualan) {
        this.idPenjualan = idPenjualan;
    }

    public String getIdPenjualan() {
        return idPenjualan;
    }

    public void setIdPenjualan(String idPenjualan) {
        this.idPenjualan = idPenjualan;
    }

    public Date getTanggalPenjualan() {
        return tanggalPenjualan;
    }

    public void setTanggalPenjualan(Date tanggalPenjualan) {
        this.tanggalPenjualan = tanggalPenjualan;
    }

    public Integer getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(Integer totalHarga) {
        this.totalHarga = totalHarga;
    }

    public Collection<Produk> getProdukCollection() {
        return produkCollection;
    }

    public void setProdukCollection(Collection<Produk> produkCollection) {
        this.produkCollection = produkCollection;
    }

    public Collection<Pembayaran> getPembayaranCollection() {
        return pembayaranCollection;
    }

    public void setPembayaranCollection(Collection<Pembayaran> pembayaranCollection) {
        this.pembayaranCollection = pembayaranCollection;
    }

    public Customers getIdCustomers() {
        return idCustomers;
    }

    public void setIdCustomers(Customers idCustomers) {
        this.idCustomers = idCustomers;
    }

    public Kasir getIdKasir() {
        return idKasir;
    }

    public void setIdKasir(Kasir idKasir) {
        this.idKasir = idKasir;
    }

    public Waiters getIdWaiters() {
        return idWaiters;
    }

    public void setIdWaiters(Waiters idWaiters) {
        this.idWaiters = idWaiters;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPenjualan != null ? idPenjualan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Penjualan)) {
            return false;
        }
        Penjualan other = (Penjualan) object;
        if ((this.idPenjualan == null && other.idPenjualan != null) || (this.idPenjualan != null && !this.idPenjualan.equals(other.idPenjualan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cafe.management.system.Penjualan[ idPenjualan=" + idPenjualan + " ]";
    }
    
}
