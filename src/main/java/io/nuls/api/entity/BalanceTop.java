package io.nuls.api.entity;

import java.io.Serializable;

public class BalanceTop implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column balance_top.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column balance_top.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column balance_top.balance
     *
     * @mbggenerated
     */
    private Long balance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column balance_top.tx_count
     *
     * @mbggenerated
     */
    private Integer txCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column balance_top.create_time
     *
     * @mbggenerated
     */
    private Long createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table balance_top
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column balance_top.id
     *
     * @return the value of balance_top.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column balance_top.id
     *
     * @param id the value for balance_top.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column balance_top.address
     *
     * @return the value of balance_top.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column balance_top.address
     *
     * @param address the value for balance_top.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column balance_top.balance
     *
     * @return the value of balance_top.balance
     *
     * @mbggenerated
     */
    public Long getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column balance_top.balance
     *
     * @param balance the value for balance_top.balance
     *
     * @mbggenerated
     */
    public void setBalance(Long balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column balance_top.tx_count
     *
     * @return the value of balance_top.tx_count
     *
     * @mbggenerated
     */
    public Integer getTxCount() {
        return txCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column balance_top.tx_count
     *
     * @param txCount the value for balance_top.tx_count
     *
     * @mbggenerated
     */
    public void setTxCount(Integer txCount) {
        this.txCount = txCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column balance_top.create_time
     *
     * @return the value of balance_top.create_time
     *
     * @mbggenerated
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column balance_top.create_time
     *
     * @param createTime the value for balance_top.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_top
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BalanceTop other = (BalanceTop) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getTxCount() == null ? other.getTxCount() == null : this.getTxCount().equals(other.getTxCount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_top
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getTxCount() == null) ? 0 : getTxCount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance_top
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", address=").append(address);
        sb.append(", balance=").append(balance);
        sb.append(", txCount=").append(txCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}