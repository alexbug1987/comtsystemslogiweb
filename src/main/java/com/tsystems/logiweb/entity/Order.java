package com.tsystems.logiweb.entity;

import com.tsystems.logiweb.entity.enums.OrderStatus;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "OrderID", nullable = false)
    private int orderId;

    @Column(name = "OrderNumber", nullable = false)
    private int orderNumber;

    @Column(name = "OrderStatus", nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @Column(name = "Weight", nullable = false)
    private int weight;

    @Column(name = "DeadlineForDelivery", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date deadlineForDelivery;

    //связь с городом погрузки
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "CityOfLoadingID", nullable = false)
    private CountryMap cityOfLoadingOrder;

    //связь с городом разгрузки
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "CityOfDischargeID", nullable = false)
    private CountryMap cityOfDischargeOrder;

    //связь с текущей фурой
    @OneToOne
    @JoinColumn(name="AppointedTruckID")
    private Truck truck;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getDeadlineForDelivery() {
        return deadlineForDelivery;
    }

    public void setDeadlineForDelivery(Date deadlineForDelivery) {
        this.deadlineForDelivery = deadlineForDelivery;
    }

    public CountryMap getCityOfLoadingOrder() {
        return cityOfLoadingOrder;
    }

    public void setCityOfLoadingOrder(CountryMap cityOfLoadingOrder) {
        this.cityOfLoadingOrder = cityOfLoadingOrder;
    }

    public CountryMap getCityOfDischargeOrder() {
        return cityOfDischargeOrder;
    }

    public void setCityOfDischargeOrder(CountryMap cityOfDischargeOrder) {
        this.cityOfDischargeOrder = cityOfDischargeOrder;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

}