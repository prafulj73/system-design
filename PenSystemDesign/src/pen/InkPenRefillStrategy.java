package pen;

public class InkPenRefillStrategy implements RefillStrategy {

	private int remainingInk = 100;
	@Override
	public void refill() {
		this.remainingInk = 100;
	}

	@Override
	public int getRemainingInk() {
		return this.remainingInk;
	}

}
