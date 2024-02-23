package polymorphisme;

public class Poly {
public static void main (String arg[]) {
A a = new A() ; a.affiche() ; System.out.println();
B b = new B() ; a=b;
b.affiche() ; a.affiche() ; System.out.println();
C c = new C() ; a=c;
c.affiche() ; a.affiche() ; System.out.println();
D d = new D() ; a=d; c=d;
d.affiche() ; a.affiche() ; c.affiche() ; System.out.println();
E e = new E() ; a=e; b=e;
e.affiche() ; a.affiche() ; b.affiche() ; System.out.println();
F f = new F() ; a=f; c=f;
f.affiche() ; a.affiche() ; c.affiche() ; System.out.println();
}
}

/*La première ligne affiche A basiquement rien à dire
 *La ligne 2 B est une extension de A et a=b donc "Je suis A" va être associé à b par défaut si il n'y à pas de println
 *La L3 C possède un println propre à lui même il n'est donc pas par défaut à "Je suis A"  
 *La L4 la même que la ligne C il n'y à pas de transformation car le println de d est prioritaire
 *La L5 par défaut E n'a pas de println alors a=e,b=e prend la priorite sauf que b=e n'à pas de println dont a=e affiche A
 *La L6 F est extends de C il à donc la priorité sur A 
 */
