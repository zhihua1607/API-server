package io.nuls.api.entity;

public class Output {

    private String txHash;

    private String address;

    private Long value;

    public Output() {

    }

    public Output(String txHash, String address, long value) {
        this.txHash = txHash;
        this.address = address;
        this.value = value;
    }

    public String getTxHash() {
        return txHash;
    }

    public void setTxHash(String txHash) {
        this.txHash = txHash;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}