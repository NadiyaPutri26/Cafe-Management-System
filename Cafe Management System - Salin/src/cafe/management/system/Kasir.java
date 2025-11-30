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
@Table(name = "kasir")
@NamedQueries({
    @NamedQuery(name = "Kasir.findAll", query = "SELECT k FROM Kasir k"),
    @NamedQuery(name = "Kasir.findByIdKasir", query = "SELECT k FROM Kasir k WHERE k.idKasir = :idKasir"),
    @NamedQuery(name = "Kasir.findByNamaKasir", query = "SELECT k FROM Kasir k WHERE k.namaKasir = :namaKasir"),
    @NamedQuery(name = "Kasir.findByShiftKasir", query = "SELECT k FROM Kasir k WHERE k.shiftKasir = :shiftKasir"),
    @NamedQuery(name = "Kasir.findByGajiKasir", query = "SELECT k FROM Kasir k WHERE k.gajiKasir = :gajiKasir")})
public class Kasir implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_kasir")
    private String idKasir;
    @Column(name = "nama_kasir")
    private String namaKasir;
    @Column(name = "shift_kasir")
    @Temporal(TemporalType.TIME)
    private Date shiftKasir;
    @Column(name = "gaji_kasir")
    private Integer gajiKasir;
    @OneToMany(mappedBy = "idKasir")
    private Collection<Pembayaran> pembayaranCollection;
    @OneToMany(mappedBy = "idKasir")
    private Collection<Penjualan> penjualanCollection;

    public Kasir() {
    }

    public Kasir(String idKasir) {
        this.idKasir = idKasir;
    }

    public String getIdKasir() {
        return idKasir;
    }

    public void setIdKasir(String idKasir) {
        this.idKasir = idKasir;
    }

    public String getNamaKasir() {
        return namaKasir;
    }

    public void setNamaKasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    public Date getShiftKasir() {
        return shiftKasir;
    }

    public void setShiftKasir(Date shiftKasir) {
        this.shiftKasir = shiftKasir;
    }

    public Integer getGajiKasir() {
        return gajiKasir;
    }

    public void setGajiKasir(Integer gajiKasir) {
        this.gajiKasir = gajiKasir;
    }

    public Collection<Pembayaran> getPembayaranCollection() {
        return pembayaranCollection;
    }

    public void setPembayaranCollection(Collection<Pembayaran> pembayaranCollection) {
        this.pembayaranCollection = pembayaranCollection;
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
        hash += (idKasir != null ? idKasir.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kasir)) {
            return false;
        }
        Kasir other = (Kasir) object;
        if ((this.idKasir == null && other.idKasir != null) || (this.idKasir != null && !this.idKasir.equals(other.idKasir))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cafe.management.system.Kasir[ idKasir=" + idKasir + " ]";
    }
    
}
