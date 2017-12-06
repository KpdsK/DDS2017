package ar.edu.utn.frba.dds.dondeinvierto.jpa;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Usuario {
	String id;
	String userName;
	String password;
	String linkedId;
	String serializedprofile;
	
	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLinkedId() {
		return linkedId;
	}

	public void setLinkedId(String linkedId) {
		this.linkedId = linkedId;
	}

	public String getSerializedprofile() {
		return serializedprofile;
	}

	public void setSerializedprofile(String serializedprofile) {
		this.serializedprofile = serializedprofile;
	}
}
