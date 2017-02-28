package at.woodstick.pitest;

public class Simple {

	public static final int CONST_ONE = 1;
	
	public int getOne() {
		return CONST_ONE;
	}
	
	public int incrementGreaterOne(int value) {
		if(value > 1) {
			value++; 
		}
		
		return value;
	}
	
}
