package pen;

public class BallPointPen extends Pen{
	
	BallPointPen(){
		super(new BallPointPenRefillStrategy());
	}
}
