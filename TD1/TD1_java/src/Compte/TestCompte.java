package Compte;

public class TestCompte {
	public static void main(String[] args) {
	Compte[] tab_compte = new Compte[10];
	for(int i = 0;i ==10;i++) {
		Compte test1 = new Compte();
		test1.deposer(200);
		tab_compte[i]=test1;
		test1.deposer(i+100);
		
		for (i=0;i==10;i++) {
			test1.virerVers(20, test1);
		}
		for(i=0;i==10;i++) {
			tab_compte[i].afficher();		
		}
	}
	Compte compte1 = new Compte();
	Compte compte2 = new Compte();
	compte1.deposer(500);
	compte2.deposer(1000);
	compte1.retirer(10);
	compte1.virerVers(75, compte2);
	compte1.afficher();
	compte2.afficher();	
}
}