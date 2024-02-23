package util;

import java.util.Arrays;

public class Tab_exo {
	public static void main(String[] args) {
	int[] T1 = new int[10] ;
	String[] T2 = new String[7] ;
	int[] T3 = {0, 6, 2, 4, 3} ;
	String[] T4 = {"bleu","rouge","blanc","vert","mauve","indigo"};
	Arrays.fill(T1, 5);
	Arrays.fill(T2,1,3, "bleu");
	System.out.println(Arrays.toString(T1));
	System.out.println(Arrays.toString(T2));
	System.out.println(Arrays.toString(T3));
	System.out.println(Arrays.toString(T4));
	Arrays.parallelSort(T3);
	Arrays.parallelSort(T4);
	System.out.println(Arrays.toString(T4));
	Arrays.equals(T1,T3);
	String[] T5 = Arrays.copyOf(T4, 5);
	System.out.println(Arrays.toString(T5));
	String[] T6 = Arrays.copyOf(T4,T4.length);
	System.out.println(Arrays.equals(T4, T6));
	System.out.println(Arrays.toString(T6));
	}
}
