package com.ty.clubspark.dto;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class DanceClub extends Club {
	
	private User coach;

}
