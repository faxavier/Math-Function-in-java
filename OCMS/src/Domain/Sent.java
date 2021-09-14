/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Xavier de Jesus
 */
@Entity
public class Sent implements Serializable {
     @Id
    
    private String id=UUID.randomUUID().toString();
    private String m_Id;
    private String tracking_no;
    private int s_Id;
    private String contact;
     @Temporal(javax.persistence.TemporalType.DATE)
    private Date delivered_time;
    
     @Enumerated(EnumType.STRING)
    private EReceiving receiving = EReceiving.Received;
     @Enumerated(EnumType.STRING)
    private EDelivering delivering = EDelivering.Delivered;
    @ManyToOne
    private Manager manager;

    public Sent() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getM_Id() {
        return m_Id;
    }

    public void setM_Id(String m_Id) {
        this.m_Id = m_Id;
    }

    public String getTracking_no() {
        return tracking_no;
    }

    public void setTracking_no(String tracking_no) {
        this.tracking_no = tracking_no;
    }

    public int getS_Id() {
        return s_Id;
    }

    public void setS_Id(int s_Id) {
        this.s_Id = s_Id;
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

    public EReceiving getReceiving() {
        return receiving;
    }

    public void setReceiving(EReceiving receiving) {
        this.receiving = receiving;
    }

    public EDelivering getDelivering() {
        return delivering;
    }

    public void setDelivering(EDelivering delivering) {
        this.delivering = delivering;
    }
    
    
    
    
    
    
}
