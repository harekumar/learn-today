package learn_today.learn_today.fundamental;

import org.apache.log4j.Logger;

public class ConstructorChaining {

	private int i = 0;
	
	static Logger logger = Logger.getLogger(ConstructorChaining.class);
	
	public ConstructorChaining() {
		this(1);
	}
	
	public ConstructorChaining(int i) {
		i += i;
		System.out.println(i);
	}
	public static void main(String[] args) {
		logger.info("Inside method");
		ConstructorChaining o = new ConstructorChaining();
	}

}
