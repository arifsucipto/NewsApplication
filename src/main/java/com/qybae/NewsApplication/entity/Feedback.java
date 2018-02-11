package com.qybae.NewsApplication.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="feedback")
	private String sfeedback;
	
	
	public Feedback() {
		
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getSfeedback() {
		return sfeedback;
	}


	public void setSfeedback(String sfeedback) {
		this.sfeedback = sfeedback;
	}


	public Feedback(String firstName, String lastName, String email, String sfeedback) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.sfeedback = sfeedback;
	}


	@Override
	public String toString() {
		return "Feedback [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", sfeedback=" + sfeedback + "]";
	}















	



}
