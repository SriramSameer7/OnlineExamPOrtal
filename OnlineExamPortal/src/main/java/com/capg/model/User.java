package com.capg.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
	@Table(name = "user_table")
	public class User {
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "userid", length = 200, unique = true)
	private long userid;
	
	@Column(unique=true)
	private String useremail;
	
	@Column(name = "username", length = 200, unique = true)
	private String username;
	
    @Column(unique = true)
	private long usermobileno;
	
	@Embedded
	@Column(name = "useraddress")
	private UserAddress useraddress;
	
	@Column(name = "password", length = 200)
	private String password;
	
	//@OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
	//private Enrollment enrollment;

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getUsermobileno() {
		return usermobileno;
	}

	public void setUsermobileno(long usermobileno) {
		this.usermobileno = usermobileno;
	}

	public UserAddress getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(UserAddress useraddress) {
		this.useraddress = useraddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [userid=" + userid + ", useremail=" + useremail + ", username=" + username + ", usermobileno="
				+ usermobileno + ", useraddress=" + useraddress + ", password=" + password + "]";
	}

	
	
}