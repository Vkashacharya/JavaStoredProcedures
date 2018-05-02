package Day2StreamApiandlamdaExpressions;

public interface Actor {
	void act();
	void speak();
	default void comedy() {
		System.out.println("I can make ppl Laugh");
	} //public method interface definition

}
