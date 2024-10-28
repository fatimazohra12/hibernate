package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedQuery(name = "findBetweenDate", query = "from Machine where dateAchat between :d1 and :d2")
public class Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String ref;
    
    @Temporal(TemporalType.DATE)
    private Date dateAchat;
    
    @ManyToOne
    private Salle salle;

	public Machine(String ref, Date dateAchat, Salle salle) {
		this.ref=ref;
		this.dateAchat=dateAchat;
		this.salle=salle;
	}

	public Machine() {
		// TODO Auto-generated constructor stub
	}

	public void setRef(String ref) {
		// TODO Auto-generated method stub
		this.ref=ref;
	}

	public void setSalle(Salle salle) {
		// TODO Auto-generated method stub
		this.salle=salle;
		
	}

	public void setDateAchat(Date dateAchat) {
		// TODO Auto-generated method stub
		this.dateAchat=dateAchat;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getRef() {
		// TODO Auto-generated method stub
		return ref;
	}

	public Date getDateAchat() {
		// TODO Auto-generated method stub
		return dateAchat;
	}

    // Getters et Setters
}