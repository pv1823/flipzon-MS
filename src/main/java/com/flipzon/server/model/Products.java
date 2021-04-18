package com.flipzon.server.model;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTS")
public class Products {
    @Id
    @Column(name = "PID")
    private Long pid;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PDESC")
    private String pdesc;

    @Column(name = "PRICE")
    private double price;

    @Column(name = "IMAGE")
    private String image;

    @Column(name = "PTYPE")
    private String ptype;

    @Column(name = "DIMENSIONS")
    private String dimensions;

    public Long getPid() {
        return this.pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPdesc() {
        return this.pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPtype() {
        return this.ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getDimensions() {
        return this.dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
