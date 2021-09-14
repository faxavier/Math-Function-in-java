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
public class Branch implements Serializable {
    @Id
        private String id=UUID.randomUUID().toString();
        private String name;
        private String address;
        private String contact;
        @OneToOne
        private Manager manager;
        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "branch", orphanRemoval = true)
        private List<Driver> drivers;
        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "branch", orphanRemoval = true)
        private List<Car> cars;
        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "branch", orphanRemoval = true)
        private List <Receiving> receivings;
    public Branch() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Receiving> getReceivings() {
        return receivings;
    }

    public void setReceivings(List<Receiving> receivings) {
        this.receivings = receivings;
    }

        
    
}
