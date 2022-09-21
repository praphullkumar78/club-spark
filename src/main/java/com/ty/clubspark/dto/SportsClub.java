package com.ty.clubspark.dto;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class SportsClub extends Club {
	
	private User coach;

}
