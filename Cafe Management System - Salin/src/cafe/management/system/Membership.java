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
@Table(name = "membership")
@NamedQueries({
    @NamedQuery(name = "Membership.findAll", query = "SELECT m FROM Membership m"),
    @NamedQuery(name = "Membership.findByIdMember", query = "SELECT m FROM Membership m WHERE m.idMember = :idMember"),
    @NamedQuery(name = "Membership.findByNamaMember", query = "SELECT m FROM Membership m WHERE m.namaMember = :namaMember"),
    @NamedQuery(name = "Membership.findByTanggalDaftar", query = "SELECT m FROM Membership m WHERE m.tanggalDaftar = :tanggalDaftar"),
    @NamedQuery(name = "Membership.findByPoinMember", query = "SELECT m FROM Membership m WHERE m.poinMember = :poinMember")})
public class Membership implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_member")
    private String idMember;
    @Column(name = "nama_member")
    private String namaMember;
    @Column(name = "tanggal_daftar")
    @Temporal(TemporalType.DATE)
    private Date tanggalDaftar;
    @Column(name = "poin_member")
    private Integer poinMember;
    @OneToMany(mappedBy = "idMember")
    private Collection<Customers> customersCollection;
    @JoinColumn(name = "id_customers", referencedColumnName = "id_customers")
    @ManyToOne
    private Customers idCustomers;

    public Membership() {
    }

    public Membership(String idMember) {
        this.idMember = idMember;
    }

    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public String getNamaMember() {
        return namaMember;
    }

    public void setNamaMember(String namaMember) {
        this.namaMember = namaMember;
    }

    public Date getTanggalDaftar() {
        return tanggalDaftar;
    }

    public void setTanggalDaftar(Date tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

    public Integer getPoinMember() {
        return poinMember;
    }

    public void setPoinMember(Integer poinMember) {
        this.poinMember = poinMember;
    }

    public Collection<Customers> getCustomersCollection() {
        return customersCollection;
    }

    public void setCustomersCollection(Collection<Customers> customersCollection) {
        this.customersCollection = customersCollection;
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
        hash += (idMember != null ? idMember.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Membership)) {
            return false;
        }
        Membership other = (Membership) object;
        if ((this.idMember == null && other.idMember != null) || (this.idMember != null && !this.idMember.equals(other.idMember))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cafe.management.system.Membership[ idMember=" + idMember + " ]";
    }
    
}
