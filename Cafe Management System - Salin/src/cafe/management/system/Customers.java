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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Huawei
 */
@Entity
@Table(name = "customers")
@NamedQueries({
    @NamedQuery(name = "Customers.findAll", query = "SELECT c FROM Customers c"),
    @NamedQuery(name = "Customers.findByIdCustomers", query = "SELECT c FROM Customers c WHERE c.idCustomers = :idCustomers"),
    @NamedQuery(name = "Customers.findByNamaCustomers", query = "SELECT c FROM Customers c WHERE c.namaCustomers = :namaCustomers")})
public class Customers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_customers")
    private String idCustomers;
    @Column(name = "nama_customers")
    private String namaCustomers;
    @OneToMany(mappedBy = "idCustomers")
    private Collection<Vale> valeCollection;
    @OneToMany(mappedBy = "idCustomers")
    private Collection<Penjualan> penjualanCollection;
    @JoinColumn(name = "id_member", referencedColumnName = "id_member")
    @ManyToOne
    private Membership idMember;
    @OneToMany(mappedBy = "idCustomers")
    private Collection<Membership> membershipCollection;

    public Customers() {
    }

    public Customers(String idCustomers) {
        this.idCustomers = idCustomers;
    }

    public String getIdCustomers() {
        return idCustomers;
    }

    public void setIdCustomers(String idCustomers) {
        this.idCustomers = idCustomers;
    }

    public String getNamaCustomers() {
        return namaCustomers;
    }

    public void setNamaCustomers(String namaCustomers) {
        this.namaCustomers = namaCustomers;
    }

    public Collection<Vale> getValeCollection() {
        return valeCollection;
    }

    public void setValeCollection(Collection<Vale> valeCollection) {
        this.valeCollection = valeCollection;
    }

    public Collection<Penjualan> getPenjualanCollection() {
        return penjualanCollection;
    }

    public void setPenjualanCollection(Collection<Penjualan> penjualanCollection) {
        this.penjualanCollection = penjualanCollection;
    }

    public Membership getIdMember() {
        return idMember;
    }

    public void setIdMember(Membership idMember) {
        this.idMember = idMember;
    }

    public Collection<Membership> getMembershipCollection() {
        return membershipCollection;
    }

    public void setMembershipCollection(Collection<Membership> membershipCollection) {
        this.membershipCollection = membershipCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCustomers != null ? idCustomers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customers)) {
            return false;
        }
        Customers other = (Customers) object;
        if ((this.idCustomers == null && other.idCustomers != null) || (this.idCustomers != null && !this.idCustomers.equals(other.idCustomers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cafe.management.system.Customers[ idCustomers=" + idCustomers + " ]";
    }
    
}
