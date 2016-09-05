package task27;

/**
 * @author vovanminh
 * @version 1.0
 * @created 04-Sep-2016 8:14:59 PM
 */
public abstract class ShapeDecorator implements IShape {
	protected IShape iShape;

	public ShapeDecorator(IShape iShape) {
		super();
		this.iShape = iShape;
	}

	public IShape getiShape() {
		return iShape;
	}

	public void setiShape(IShape iShape) {
		this.iShape = iShape;
	}
	//to draw a shape.
	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return iShape.draw();
	}
}
