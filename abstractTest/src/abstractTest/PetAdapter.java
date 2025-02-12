package abstractTest;

public abstract class PetAdapter implements Pet {

	@Override
	abstract public void sitDown();

	@Override
	abstract public void waitNow();

	@Override
	public void poop() {;}

}
