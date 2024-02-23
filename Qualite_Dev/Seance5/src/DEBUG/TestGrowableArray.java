package DEBUG;

public class TestGrowableArray {
	
	public static void main(String[] args) {
	
		System.out.println("testGrowableArray:");

        GrowableArray array = new GrowableArray();

        for (int i = 1; i < 32; i++)
            array.addElement(Integer.valueOf(i));
        
        System.out.print("    array:");
        for (int i = 0; i < array.size(); i++)
            System.out.print(" " + array.elementAt(i));
        System.out.println(" (" + array.capacity() + ")");
        
        System.out.println("    Growable.removeElement()");
        for (int i = 0; i < 11; i++)
            array.removeElement();
        

        System.out.print("    array:");        
        for (int i = 0; i < array.size(); i++)
            System.out.print(" " + array.elementAt(i));
        System.out.println(" (" + array.capacity() + ")");
	}

}