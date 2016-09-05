package task27;

/**
 * @author vovanminh
 * @version 1.0
 * @created 04-Sep-2016 8:14:59 PM
 */
public class NormalShapeDecorator extends ShapeDecorator {

	public NormalShapeDecorator(IShape iShape) {
		super(iShape);
		// TODO Auto-generated constructor stub
	}

	// to draw a shape with normal border.
	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return this.iShape.draw() + " and " + setNormalBorder(iShape);
	}

	// to set normal border.
	private String setNormalBorder(IShape iShape) {
		// TODO Auto-generated method stub
		return "with normal border.";
	}
}
