package com.shiva.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "STATE_MASTER")
public class StateEntity {
	@Id
	@Column(name = "SNO")
private Integer state_number;
	@Column(name = "STATE_NAME")
private String state_name;
}
