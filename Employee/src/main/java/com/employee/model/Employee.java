package com.employee.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "DemoEmployee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
	@jakarta.persistence.Id
	@Column (name = "ID")
	private Long Id;
	@Column (name = "Name")
	private String Name;
	@Column (name = "DOB")
	private LocalDate DOB;

}
