/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafe.management.system;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "pembayaran")
@NamedQueries({
    @NamedQuery(name = "Pembayaran.findAll", query = "SELECT p FROM Pembayaran p"),
    @NamedQuery(name = "Pembayaran.findByIdPembayaran", query = "SELECT p FROM Pembayaran p WHERE p.idPembayaran = :idPembayaran"),
    @NamedQuery(name = "Pembayaran.findByTanggalBayar", query = "SELECT p FROM Pembayaran p WHERE p.tanggalBayar = :tanggalBayar"),
    @NamedQuery(name = "Pembayaran.findByTotalBayar", query = "SELECT p FROM Pembayaran p WHERE p.totalBayar = :totalBayar"),
    @NamedQuery(name = "Pembayaran.findByStatusBayar", query = "SELECT p FROM Pembayaran p WHERE p.statusBayar = :statusBayar")})
public class Pembayaran implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pembayaran")
    private String idPembayaran;
    @Column(name = "tanggal_bayar")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggalBayar;
    @Column(name = "total_bayar")
    private BigInteger totalBayar;
    @Column(name = "status_bayar")
    private String statusBayar;
    @JoinColumn(name = "id_jenis", referencedColumnName = "id_jenis")
    @ManyToOne
    private JenisPembayaran idJenis;
    @JoinColumn(name = "id_kasir", referencedColumnName = "id_kasir")
    @ManyToOne
    private Kasir idKasir;
    @JoinColumn(name = "id_penjualan", referencedColumnName = "id_penjualan")
    @ManyToOne
    private Penjualan idPenjualan;

    public Pembayaran() {
    }

    public Pembayaran(String idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public String getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(String idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public Date getTanggalBayar() {
        return tanggalBayar;
    }

    public void setTanggalBayar(Date tanggalBayar) {
        this.tanggalBayar = tanggalBayar;
    }

    public BigInteger getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(BigInteger totalBayar) {
        this.totalBayar = totalBayar;
    }

    public String getStatusBayar() {
        return statusBayar;
    }

    public void setStatusBayar(String statusBayar) {
        this.statusBayar = statusBayar;
    }

    public JenisPembayaran getIdJenis() {
        return idJenis;
    }

    public void setIdJenis(JenisPembayaran idJenis) {
        this.idJenis = idJenis;
    }

    public Kasir getIdKasir() {
        return idKasir;
    }

    public void setIdKasir(Kasir idKasir) {
        this.idKasir = idKasir;
    }

    public Penjualan getIdPenjualan() {
        return idPenjualan;
    }

    public void setIdPenjualan(Penjualan idPenjualan) {
        this.idPenjualan = idPenjualan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPembayaran != null ? idPembayaran.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pembayaran)) {
            return false;
        }
        Pembayaran other = (Pembayaran) object;
        if ((this.idPembayaran == null && other.idPembayaran != null) || (this.idPembayaran != null && !this.idPembayaran.equals(other.idPembayaran))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cafe.management.system.Pembayaran[ idPembayaran=" + idPembayaran + " ]";
    }
    
}
