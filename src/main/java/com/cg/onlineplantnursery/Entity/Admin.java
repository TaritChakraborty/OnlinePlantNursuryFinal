package com.cg.onlineplantnursery.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int adminId;
	
	@NotBlank(message = "Username is mandatory")
	private String adminUsername;
	
	@NotBlank(message = "Password is mandatory")
	private String adminpassword;
	
}
