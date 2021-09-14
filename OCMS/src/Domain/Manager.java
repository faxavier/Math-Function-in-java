/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Xavier de Jesus
 */
@Entity
public class Manager implements Serializable {
     @Id
    private String id=UUID.randomUUID().toString();
    private String name;
    private String contact;
    private String username;
    private String password;
    private String branchname;
    @OneToOne
    private Branch branch;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "manager", orphanRemoval = true)
    private List<Courier> couriers;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "manager", orphanRemoval = true)
    private List<Sent> sents;
     @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "manager", orphanRemoval = true)
    private List<Received> received;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "manager", orphanRemoval = true)
    private List<Receiving> receivings;

    public Manager() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public List<Courier> getCouriers() {
        return couriers;
    }

    public void setCouriers(List<Courier> couriers) {
        this.couriers = couriers;
    }

    public List<Sent> getSents() {
        return sents;
    }

    public void setSents(List<Sent> sents) {
        this.sents = sents;
    }

    public List<Received> getReceived() {
        return received;
    }

    public void setReceived(List<Received> received) {
        this.received = received;
    }

    public List<Receiving> getReceiving() {
        return receivings;
    }

    public void setReceiving(List<Receiving> receiving) {
        this.receivings = receiving;
    }

    
    
}
