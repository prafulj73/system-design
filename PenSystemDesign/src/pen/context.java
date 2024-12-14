package pen;

public class context {

	public static void main(String[] args) {
		Pen p = new BallPointPen();
		p.write();
		p.refill();
		Pen p2 = new InkPen();
		p2.write();
		p2.refill();
		System.out.println(p.refillStrategy.getRemainingInk());
		System.out.println(p2.refillStrategy.getRemainingInk());
		
		Pencil pencil = new Pencil();
		pencil.write();
	}

}
