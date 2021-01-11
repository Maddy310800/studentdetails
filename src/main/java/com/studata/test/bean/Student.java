/**
 * 
 */
package com.studata.test.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Madhaw Agrawal
 *
 */
@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Student {
	
	@Id
	@GeneratedValue
	private Integer studentId;
	
	private String studentName;
	
	private Integer totalMarks;
	
	private Integer avgMarks;
	
	@OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "sa_fk", referencedColumnName = "studentId")
	private List<Address> address;

}
