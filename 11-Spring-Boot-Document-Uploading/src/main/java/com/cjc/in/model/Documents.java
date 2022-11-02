package com.cjc.in.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Entity
public class Documents {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int did;
	@Lob
	private byte[] adhar;
	@Lob
	private byte[] pan;
	@Lob
	private byte[] voterId;
	@Lob
	private byte[] sign;
	@Lob
	private byte[] photo;

}
