package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String code;
    
    @OneToMany(mappedBy = "salle", fetch = FetchType.EAGER)
    private List<Machine> machines;

	public Salle(String code) {
		// TODO Auto-generated constructor stub
		this.code=code;
	}

	public Salle() {
		// TODO Auto-generated constructor stub
	}

	public void setCode(String code) {
		// TODO Auto-generated method stub
		this.code=code;
		
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getCode() {
		// TODO Auto-generated method stub
		return code;
	}

	public List<Machine> getMachines() {
		// TODO Auto-generated method stub
		return machines;
	}

    // Getters et Setters
}