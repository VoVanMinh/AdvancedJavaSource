package task29;
/**
 * @author vovanminh
 * @version 1.0
 * @created 04-Sep-2016 8:14:59 PM
 */
public class SingleTeacher {
	private static SingleTeacher instance = new SingleTeacher();

    private SingleTeacher() {
    }

    public static SingleTeacher getInstance() {
        return instance;
    }
    //to print example about singleton.
    public String shareDocument() {
        return "Tai lieu tham khai: \n - Chuong 1\n - Chuong 2\n - Chuong 3\n - Chuong 4\n ...";
    }
}
