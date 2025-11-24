/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafe.management.system;

import java.io.Serializable;
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
@Table(name = "vale")
@NamedQueries({
    @NamedQuery(name = "Vale.findAll", query = "SELECT v FROM Vale v"),
    @NamedQuery(name = "Vale.findByIdVale", query = "SELECT v FROM Vale v WHERE v.idVale = :idVale"),
    @NamedQuery(name = "Vale.findByWaktuTiba", query = "SELECT v FROM Vale v WHERE v.waktuTiba = :waktuTiba")})
public class Vale implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_vale")
    private String idVale;
    @Column(name = "waktu_tiba")
    @Temporal(TemporalType.TIME)
    private Date waktuTiba;
    @JoinColumn(name = "id_customers", referencedColumnName = "id_customers")
    @ManyToOne
    private Customers idCustomers;

    public Vale() {
    }

    public Vale(String idVale) {
        this.idVale = idVale;
    }

    public String getIdVale() {
        return idVale;
    }

    public void setIdVale(String idVale) {
        this.idVale = idVale;
    }

    public Date getWaktuTiba() {
        return waktuTiba;
    }

    public void setWaktuTiba(Date waktuTiba) {
        this.waktuTiba = waktuTiba;
    }

    public Customers getIdCustomers() {
        return idCustomers;
    }

    public void setIdCustomers(Customers idCustomers) {
        this.idCustomers = idCustomers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVale != null ? idVale.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vale)) {
            return false;
        }
        Vale other = (Vale) object;
        if ((this.idVale == null && other.idVale != null) || (this.idVale != null && !this.idVale.equals(other.idVale))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cafe.management.system.Vale[ idVale=" + idVale + " ]";
    }
    
}
