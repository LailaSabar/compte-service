package org.sid.compte.model;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
public class Demande {
	
	 private Long id;
	 private String motif;
	 @Temporal(TemporalType.DATE)
	 private Date date_creation;
	 @Temporal(TemporalType.DATE)
	 private Date date_execution;
	 private String statut;

}
