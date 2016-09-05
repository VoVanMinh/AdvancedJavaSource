package task33;
/**
 * @author vovanminh
 * @version 1.0
 * @created 05-Sep-2016 8:14:59 PM
 */
public class RealImage implements Image{
    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    //to print file name.
    @Override
    public void display() {
        System.out.println("Displaying "+ fileName);
    }
    //to load file.
    private void loadFromDisk(String fileName){
        System.out.println("Loading "+ fileName);
    }
}
