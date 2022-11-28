package com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {
@Id
private int fid;
private String flightname;
private float price;
private LocalDate dof;
private int seats;
private int pid;
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getFlightname() {
	return flightname;
}
public void setFlightname(String flightname) {
	this.flightname = flightname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public LocalDate getDof() {
	return dof;
}
public void setDof(LocalDate dof) {
	this.dof = dof;
}
public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
@Override
public String toString() {
	return "Flight [fid=" + fid + ", flightname=" + flightname + ", price=" + price + ", dof=" + dof + ", seats="
			+ seats + ", pid=" + pid + "]";
}



}
