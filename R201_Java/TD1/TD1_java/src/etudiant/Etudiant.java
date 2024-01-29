package etudiant;

public class Etudiant {
	private String nom;

	public Etudiant(String nom) {
        this.nom = nom;
    }
	
	public void Travailler(){
			System.out.println(this.nom + " se met au travail !");
	}
	public void seReposer() {
			System.out.println(this.nom + " se repose ");
	}
	public static void main(String[] args) {
		Etudiant etudiant = new Etudiant("titi");
		etudiant.nom = args[0];
		etudiant.seReposer();
		etudiant.Travailler();
	}
}
