package pen;

public class BallPointPenRefillStrategy implements RefillStrategy {

	public int remainingInk = 100;
	@Override
	public void refill() {
		this.remainingInk = 100;
	}

	@Override
	public int getRemainingInk() {
		return this.remainingInk;
	}

}
