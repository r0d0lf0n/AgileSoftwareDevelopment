package it.unical.info.banking.data.entities;

import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Contract")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "rate")
public class Contract {

    protected Contract() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ISIN_code")
    private Long ISIN_code;

    @Lob
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "Description", length = 200)
    private String description;

    @Basic(optional = false)
    @Column(name = "issuer", length = 100)
    private String issuer;

    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date expirationDate;

    @Basic(optional = false)
    @Column(name = "nominalValue")
    private Long nominalValue;

    @Column(name = "balances", nullable = false)
    @OneToMany(mappedBy = "contract",
            fetch = FetchType.LAZY,
            cascade = CascadeType.REMOVE)
    private List<AccountBalance> balances;

    @Column(name = "movement", nullable = false)
    @OneToMany(mappedBy = "contract",
            fetch = FetchType.LAZY,
            cascade = CascadeType.REMOVE)
    private List<Movement> movement;

    @Column(name = "coupon", nullable = false)
    @OneToMany(mappedBy = "contract",
            fetch = FetchType.LAZY,
            cascade = CascadeType.REMOVE)
    private List<Coupon> coupon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getISIN_code() {
        return ISIN_code;
    }

    public void setISIN_code(Long ISIN_code) {
        this.ISIN_code = ISIN_code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Long getNominalValue() {
        return nominalValue;
    }

    public void setNominalValue(Long nominalValue) {
        this.nominalValue = nominalValue;
    }

    public List<AccountBalance> getBalances() {
        return balances;
    }

    public void setBalances(List<AccountBalance> balances) {
        this.balances = balances;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return Objects.equals(id, contract.id) &&
                Objects.equals(ISIN_code, contract.ISIN_code) &&
                Objects.equals(description, contract.description) &&
                Objects.equals(issuer, contract.issuer) &&
                Objects.equals(expirationDate, contract.expirationDate) &&
                Objects.equals(nominalValue, contract.nominalValue) &&
                Objects.equals(balances, contract.balances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ISIN_code, description, issuer, expirationDate, nominalValue, balances);
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", ISIN_code=" + ISIN_code +
                ", description='" + description + '\'' +
                ", issuer='" + issuer + '\'' +
                ", expirationDate=" + expirationDate +
                ", nominalValue=" + nominalValue +
                ", balances=" + balances +
                '}';
    }
}
