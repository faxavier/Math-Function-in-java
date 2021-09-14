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
public class Received implements Serializable {
     @Id
    private String id=UUID.randomUUID().toString();
    private String m_Id;
    private int r_Id;
    private String trackin_no;
    private String contact;
     @Temporal(javax.persistence.TemporalType.DATE)
    private Date received_time;
     @Temporal(javax.persistence.TemporalType.DATE)
    private Date receiverTime;
   
    @Enumerated(EnumType.STRING)
    private EReceiving receiving = EReceiving.Received;
     @Enumerated(EnumType.STRING)
    private EDelivering delivering = EDelivering.Delivered;
    @ManyToOne
    private Manager manager;

    public Received() {
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

    public int getR_Id() {
        return r_Id;
    }

    public void setR_Id(int r_Id) {
        this.r_Id = r_Id;
    }

    public String getTrackin_no() {
        return trackin_no;
    }

    public void setTrackin_no(String trackin_no) {
        this.trackin_no = trackin_no;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Date getReceived_time() {
        return received_time;
    }

    public void setReceived_time(Date received_time) {
        this.received_time = received_time;
    }

    public Date getReceiverTime() {
        return receiverTime;
    }

    public void setReceiverTime(Date receiverTime) {
        this.receiverTime = receiverTime;
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
