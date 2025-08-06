package Unboxing.programme;

public class UnboxingProgramme {

	public static void main(String[] args) {
		Integer boxed = new Integer(20);
        int unboxed = boxed.intValue(); 

        System.out.println("Boxed: " + boxed);
        System.out.println("Unboxed: " + unboxed);

	}

}

