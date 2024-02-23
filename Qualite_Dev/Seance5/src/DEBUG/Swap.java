package DEBUG;

public class Swap {

	/* "Echange" les deux elements donnes en argument */
	public static void swap(Object obj1, Object obj2) { 
        Object obj = obj1;
        obj1 = obj2;
        obj2 = obj;
    }

    /* "Echange" les deux elements donnes en argument */
    public static void swap(ObjectRef ref1, ObjectRef ref2) {
        Object obj = ref1.obj;
        ref1.obj = ref2.obj;
        ref2.obj = obj;
    }

	
    public static void main(String[] args) {
    	System.out.println("testSwap:");

        /* 1ere tentative */
        String s1 = "chaine1";
        String s2 = "chaine2";

        System.out.println("    s1: " + s1);
        System.out.println("    s2: " + s2);
        System.out.println("    swap()");
        Swap.swap(s1, s2);
        System.out.println("    s1: " + s1);
        System.out.println("    s2: " + s2);		

        System.out.println();

        /* 2nde tentative */
        ObjectRef ref1 = new ObjectRef(s1);
        ObjectRef ref2 = new ObjectRef(s2);

        System.out.println("    ref1.obj: " + ref1.obj);
        System.out.println("    ref2.obj: " + ref2.obj);			
        System.out.println("    swap()");
        Swap.swap(ref1, ref2);
        System.out.println("    ref1.obj: " + ref1.obj);
        System.out.println("    ref2.obj: " + ref2.obj);	
        
        
        

    }
    
}