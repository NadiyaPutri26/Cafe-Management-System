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
@Table(name = "waiters")
@NamedQueries({
    @NamedQuery(name = "Waiters.findAll", query = "SELECT w FROM Waiters w"),
    @NamedQuery(name = "Waiters.findByIdWaiters", query = "SELECT w FROM Waiters w WHERE w.idWaiters = :idWaiters"),
    @NamedQuery(name = "Waiters.findByNamaWaiters", query = "SELECT w FROM Waiters w WHERE w.namaWaiters = :namaWaiters"),
    @NamedQuery(name = "Waiters.findByShiftWaiters", query = "SELECT w FROM Waiters w WHERE w.shiftWaiters = :shiftWaiters"),
    @NamedQuery(name = "Waiters.findByGajiWaiters", query = "SELECT w FROM Waiters w WHERE w.gajiWaiters = :gajiWaiters")})
public class Waiters implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_waiters")
    private String idWaiters;
    @Column(name = "nama_waiters")
    private String namaWaiters;
    @Column(name = "shift_waiters")
    @Temporal(TemporalType.TIME)
    private Date shiftWaiters;
    @Column(name = "gaji_waiters")
    private Integer gajiWaiters;
    @OneToMany(mappedBy = "idWaiters")
    private Collection<Penjualan> penjualanCollection;

    public Waiters() {
    }

    public Waiters(String idWaiters) {
        this.idWaiters = idWaiters;
    }

    public String getIdWaiters() {
        return idWaiters;
    }

    public void setIdWaiters(String idWaiters) {
        this.idWaiters = idWaiters;
    }

    public String getNamaWaiters() {
        return namaWaiters;
    }

    public void setNamaWaiters(String namaWaiters) {
        this.namaWaiters = namaWaiters;
    }

    public Date getShiftWaiters() {
        return shiftWaiters;
    }

    public void setShiftWaiters(Date shiftWaiters) {
        this.shiftWaiters = shiftWaiters;
    }

    public Integer getGajiWaiters() {
        return gajiWaiters;
    }

    public void setGajiWaiters(Integer gajiWaiters) {
        this.gajiWaiters = gajiWaiters;
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
        hash += (idWaiters != null ? idWaiters.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Waiters)) {
            return false;
        }
        Waiters other = (Waiters) object;
        if ((this.idWaiters == null && other.idWaiters != null) || (this.idWaiters != null && !this.idWaiters.equals(other.idWaiters))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cafe.management.system.Waiters[ idWaiters=" + idWaiters + " ]";
    }
    
}
