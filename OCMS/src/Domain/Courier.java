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
public class Courier implements Serializable {

    @Id
    private String id = UUID.randomUUID().toString();
    private String tracking_no;
    private String courier_name;
    private String courier_details;
    private String courier_price;
    private String courier_parcel_weight;
    private String courier_volume;
    private String branch_name;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date recorded_time;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date delivered_time;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date received_time;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date receiver_time;
    private String source;
    private String destination;
    @ManyToOne
    private Car car;
    @ManyToOne
    private Driver driver;
    @ManyToOne
    private Manager manager;
    @ManyToOne
    private Sender sender;
    @ManyToOne
    private Receiver receiver;
    @Enumerated(EnumType.STRING)
    private EReceiving receiving = EReceiving.Not_received;
    @Enumerated(EnumType.STRING)
    private EDelivering delivering = EDelivering.Not_delivered;
   

    public Courier() {
    }

    public String getTracking_no() {
        return tracking_no;
    }

    public void setTracking_no(String tracking_no) {
        this.tracking_no = tracking_no;
    }

    public String getCourier_name() {
        return courier_name;
    }

    public void setCourier_name(String courier_name) {
        this.courier_name = courier_name;
    }

    public String getCourier_details() {
        return courier_details;
    }

    public void setCourier_details(String courier_details) {
        this.courier_details = courier_details;
    }

    public String getCourier_price() {
        return courier_price;
    }

    public void setCourier_price(String courier_price) {
        this.courier_price = courier_price;
    }

    public String getCourier_parcel_weight() {
        return courier_parcel_weight;
    }

    public void setCourier_parcel_weight(String courier_parcel_weight) {
        this.courier_parcel_weight = courier_parcel_weight;
    }

    public String getCourier_volume() {
        return courier_volume;
    }

    public void setCourier_volume(String courier_volume) {
        this.courier_volume = courier_volume;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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

    public Date getReceived_time() {
        return received_time;
    }

    public void setReceived_time(Date received_time) {
        this.received_time = received_time;
    }

    public Date getReceiver_time() {
        return receiver_time;
    }

    public void setReceiver_time(Date receiver_time) {
        this.receiver_time = receiver_time;
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
