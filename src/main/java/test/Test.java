package test;
import entities.Machine;
import entities.Salle;
import java.sql.Date;
import services.MachineService;
import services.SalleService;

public class Test {
public static void main(String[] args) { 
	SalleService salleService = new SalleService(); 
	MachineService machineService = new MachineService();
	Salle salle1 = new Salle("A1");
	Salle salle2 = new Salle("A2");
	salleService.create(salle1);
	salleService.create(salle2);
	Machine machine1 = new Machine ("M123", new Date(0), salleService.findById(1));
	Machine machine2 = new Machine ("M124", new Date(0), salleService.findById(2)); 
	machineService.create(machine1); 
	machineService.create(machine2);
	for(Salle salle:salleService.findAll()) {
		System.out.println("Salle:"+salle.getCode());
		for(Machine machine:salle.getMachines()) {
			System.out.println("Machine: "+machine.getRef());
		}
	}
	Date d1 = new Date(100,0,1);
	Date d2 = new Date(0, 0, 0);
	System.out.println("Machines achtées entre "+d1+"et "+d2+" :");
	for(Machine m:machineService.findBetweenDate(d1, d2)) {
		System.out.println(m.getRef()+"achetée le "+m.getDateAchat());
	}
	}
}
// Affichage des salles et leurs machines for (Salle salle salleService.findAll()) { System.out.println("Salle: " + salle.getCode());