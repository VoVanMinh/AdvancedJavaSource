package source;

/**
 * @author vovanminh
 * @version 1.0
 * @created 06-Sep-2016 6:40:13 PM
 */
public class ManagerFacade {

	public TeacherManager teacherManager;
	public StudentManager studentManager;
	public SubjectManager subjectManager;
	public CourseManager courseManager;

	public ManagerFacade() {
		teacherManager = new TeacherManager();
		studentManager = new StudentManager();
		subjectManager = new SubjectManager();
		courseManager = new CourseManager();
	}
}