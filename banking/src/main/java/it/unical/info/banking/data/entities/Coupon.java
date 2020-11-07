package it.unical.info.banking.data.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "coupon")
public class Coupon {

    protected Coupon() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic(optional = false)
    @Column(name = "couponSequentialNumber")
    private Long couponSequentialNumber;

    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date expirationDate;

    @Basic(optional = false)
    @Column(name = "amount")
    private Long amount;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "contract", referencedColumnName = "id")
    private Contract contract;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCouponSequentialNumber() {
        return couponSequentialNumber;
    }

    public void setCouponSequentialNumber(Long couponSequentialNumber) {
        this.couponSequentialNumber = couponSequentialNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coupon coupon = (Coupon) o;
        return Objects.equals(id, coupon.id) &&
                Objects.equals(couponSequentialNumber, coupon.couponSequentialNumber) &&
                Objects.equals(expirationDate, coupon.expirationDate) &&
                Objects.equals(amount, coupon.amount) &&
                Objects.equals(contract, coupon.contract);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, couponSequentialNumber, expirationDate, amount, contract);
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "id=" + id +
                ", couponSequentialNumber=" + couponSequentialNumber +
                ", expirationDate=" + expirationDate +
                ", amount=" + amount +
                ", contract=" + contract +
                '}';
    }
}
