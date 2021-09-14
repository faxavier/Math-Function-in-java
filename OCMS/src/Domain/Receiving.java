/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Date;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Xavier de Jesus
 */
public class Receiving {
    @Id
    private int Id;
    private String trackingno;
    private  String senderName;
    private String receiverName;
    private Date recorded_time;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date delivered_time;
    @Temporal(javax.persistence.TemporalType.DATE)
    
    private String managerId;
    private Date timeReceiving;
    @ManyToOne
    private Manager manager;
     @ManyToOne
    private Branch branch;

    public Receiving() {
    }
    
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTrackingno() {
        return trackingno;
    }

    public void setTrackingno(String trackingno) {
        this.trackingno = trackingno;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public Date getRecorded_time() {
        return recorded_time;
    }

    public void setRecorded_time(Date recorded_time) {
        this.recorded_time = recorded_time;
    }

    public Date getDelivered_time() {
        return delivered_time;
    }

    public void setDelivered_time(Date delivered_time) {
        this.delivered_time = delivered_time;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public Date getTimeReceiving() {
        return timeReceiving;
    }

    public void setTimeReceiving(Date timeReceiving) {
        this.timeReceiving = timeReceiving;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
    
    
    
    
}
