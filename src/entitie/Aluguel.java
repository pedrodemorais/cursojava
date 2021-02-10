package entitie;

public class Aluguel {
	private String  nameHospede;
	private String emailHospede;
	private int numeroQuarto;
	
	
	
	public Aluguel(String nameHospede, String emailHospede, int numeroQuarto) {
		this.nameHospede = nameHospede;
		this.emailHospede = emailHospede;
		this.numeroQuarto = numeroQuarto;
	}
	
	public String getNameHospede() {
		return nameHospede;
	}
	public void setNameHospede(String nameHospede) {
		this.nameHospede = nameHospede;
	}
	public String getEmailHospede() {
		return emailHospede;
	}
	public void setEmailHospede(String emailHospede) {
		this.emailHospede = emailHospede;
	}
	public int getNumeroQuarto() {
		return numeroQuarto;
	}
	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	@Override
	public String toString() {
		return 
				"Nome do Hospede: " 
				+ nameHospede 
				+ " e-mail: " 
				+ emailHospede 
				+ " Quarto:"
				+ numeroQuarto 
				;
	}
	
	
	

}
