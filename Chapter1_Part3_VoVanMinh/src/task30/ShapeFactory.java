package task30;
/**
 * @author vovanminh
 * @version 1.0
 * @created 04-Sep-2016 8:14:59 PM
 */
public class ShapeFactory {
    /*
     * to get a Shape from a chosen.
     * return a Shape.
     */
	public Shape getShape(String shapeType){
        if(shapeType== null){
            return null;
        }
        else if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
