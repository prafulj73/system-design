package pen;

public class InkPen extends Pen{
	
	InkPen(){
		super(new InkPenRefillStrategy());
	}
}
