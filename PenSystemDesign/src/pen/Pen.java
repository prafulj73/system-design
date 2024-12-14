package pen;

public abstract class Pen implements Writeable{
	
	RefillStrategy refillStrategy;
	
	Pen(){
		System.out.println("inside pen constructor!!");
	}
	
	Pen(RefillStrategy refillStrategy) {
		this.refillStrategy = refillStrategy;
	}
	
	public void write() {
		if(refillStrategy.getRemainingInk() >= 0) {
			if(refillStrategy instanceof BallPointPenRefillStrategy) {				
				System.out.println("writing from ball point pen!!");
			}
			else if(refillStrategy instanceof InkPenRefillStrategy) {				
				System.out.println("writing from Ink pen!!");
			}
			else {
				System.out.println("dont write!");
			}
		}
		else {
			System.out.println("need to refill!!");
		}
	}
	
	public void refill() {
		this.refillStrategy.refill();
	}
	
}
