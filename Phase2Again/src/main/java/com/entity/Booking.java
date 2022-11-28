package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int bid;
private String pname;
private int numberOfseats;
private float totalAmount;
@OneToOne
private Flight fid;
@OneToOne
private Places pid;


}
