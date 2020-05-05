package nelio.cursojava.entities;

public class Rent {
	
	private String name;
	private String email;
		
	public Rent() {
		}

	public Rent(String name, String email) {
		this.name = name;
		this.email = email;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	Rent[] vetor = new Rent[10];
	
	public void add(String name, String email, int room) {
		this.addvet(new Rent(name,email), room);
	}
	
	public void addvet(Rent rent, int room) {
		
		 vetor[room] = (rent);
	}
	
	@Override
	public String toString() {
		return name + ", " + email;
	}


	
	
	
}
	

