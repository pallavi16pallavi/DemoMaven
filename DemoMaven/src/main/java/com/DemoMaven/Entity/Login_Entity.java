package com.DemoMaven.Entity;
import javax.persistence.*;

@Entity
@Table

public class Login_Entity
{

	@Column (name="uname")
	private String name=" ";
	
	@Column (name="upass")
	private String pass=" ";
}
