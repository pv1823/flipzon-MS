package com.flipzon.server.model;

import javax.persistence.*;

@Entity
@Table(name = "ORDERS")
public class Orders {
    @Id
    @Column(name = "OID")
    private long oid;

    @Column(name = "QTY")
    private int qty;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "PID")
    private long pid;

    public long getOid() {
        return this.oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public long getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getPid() {
        return this.pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }
}
