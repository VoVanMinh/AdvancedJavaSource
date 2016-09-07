package source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created 06-Sep-2016 6:40:13 PM
 */
public class Main {

	public static void main(String[] args) throws IOException {

		ManagerFacade managerFacede = new ManagerFacade();
		managerFacede.teacherManager = setdataTeacher();
		managerFacede.subjectManager = setDataSubject(managerFacede);
		managerFacede.studentManager = setDataStudent(managerFacede);
		managerFacede.courseManager = setDataCourse(managerFacede);

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			int temp = 1;
			int temp1 = 0;
			while (temp != 0) {
				temp = mainMenu();
				switch (temp) {
				//teacher manager
				case 1:
					temp1 = teacherManagerMenu();
					if (temp1 == 1) {
						Teacher teacher = Teacher.getTeacher(Person.getPerson());
						//to get a list subject name that teacher teach.
						System.out.println("Enter number subject can teach >=1: ");
						int number = Integer.parseInt(input.readLine());
						for (int i = 0; i < number; i++) {
							System.out.println("Enter subject name can teach: ");
							String teach = input.readLine();
							teacher.listTeach.add(teach);
						}
						managerFacede.teacherManager.add(teacher);
						System.out.println("---Added successful!---");
					} else if (temp1 == 2) {
						managerFacede.teacherManager.print();
					}

					break;
				//subject manager
				case 2:
					temp1 = subjectManagerMenu();
					if (temp1 == 1) {
						Subject subject = Subject.getSubject();
						managerFacede.teacherManager.print();
						//to choose a teacher from list into a subject.
						int size = managerFacede.teacherManager.listTeacher.size() - 1;
						int choose = -1;
						while (choose < 0 || choose > size) {
							System.out.println("Choose a teacher for subject 0->" + size + ":");
							choose = Integer.parseInt(input.readLine());
						}
						subject.setM_Teacher(managerFacede.teacherManager.listTeacher.get(choose));
						managerFacede.subjectManager.add(subject);
						System.out.println("---Added successful!---");
					} else if (temp1 == 2) {
						managerFacede.subjectManager.print();
					}
					break;
				//course manager
				case 3:
					temp1 = courseManagerMenu();
					if (temp1 == 1) {
						Course course = Course.getCourse();
						//to choose a teacher from list into a course.
						managerFacede.teacherManager.print();
						int size = managerFacede.teacherManager.listTeacher.size() - 1;
						int choose = -1;
						while (choose < 0 || choose > size) {
							System.out.println("Choose a head teacher for cource 0->" + size + ":");
							choose = Integer.parseInt(input.readLine());
						}
						course.setM_Teacher(managerFacede.teacherManager.listTeacher.get(choose));
						//to add subject from list into a course.
						managerFacede.subjectManager.print();
						size = managerFacede.subjectManager.listSubject.size() - 1;
						choose = -1;
						while (choose != -1) {
							System.out.println("Enter -1 to quit or Choose subjects for cource 0->" + size + ":");
							choose = Integer.parseInt(input.readLine());
							if (choose == -1)
								break;
							else if (choose >= 0 && choose <= size)
								course.listSubject.add(managerFacede.subjectManager.listSubject.get(choose));
						}
						////to add students from keyboard into a course.
						int num = 0;
						while (num < 1) {
							System.out.println("Enter number student for course: ");
							num = Integer.parseInt(input.readLine());
						}
						for (int i = 0; i < num; i++) {
							Student st = Student.getStudent(Person.getPerson());
							for (int j = 0; j < course.listSubject.size(); j++) {
								Session s = new Session(0, 0, 0);
								Mark m = new Mark();
								m.listSession.add(s);
								m.setM_Subject(course.listSubject.get(j));
								st.listMark.add(m);
							}
							course.listStudent.add(st);
							managerFacede.studentManager.listStudent.add(st);
						}

						managerFacede.courseManager.add(course);
						System.out.println("---Added successful!---");
					} else if (temp1 == 2) {
						managerFacede.subjectManager.print();
					}
					break;
				//student manager
				case 4:
					temp1 = studentManagerMenu();
					if (temp1 == 1) {
						temp1 = aStudentMenu();
						if (temp1 >= 1 && temp <= 6) {
							managerFacede.studentManager.print();
							int size = managerFacede.studentManager.listStudent.size() - 1;
							int choose = -1;
							while (choose < 0 || choose > size) {
								System.out.println("Enter chosen a student 0-> " + size + ":");
								choose = Integer.parseInt(input.readLine());
							}
							managerFacede.studentManager.listStudent.get(choose).printStudent();
							size = managerFacede.studentManager.listStudent.get(choose).listMark.size() - 1;
							int chooseMark = -1;
							while (chooseMark < 0 || chooseMark > size) {
								System.out.println("Enter chosen a student 0-> " + size + ":");
								chooseMark = Integer.parseInt(input.readLine());
							}
							if (temp1 == 1) {
								Session s = Session.getSession();
								managerFacede.studentManager.listStudent.get(choose).listMark
										.get(chooseMark).listSession.add(s);
								System.out.println("---Added successful!---");
							} else if (temp1 == 2) {
								System.out.println("Enter appreciation of Subject teacher: ");
								managerFacede.studentManager.listStudent.get(choose).listMark.get(chooseMark)
										.setSubTeacherAppreciate(input.readLine());
								System.out.println("Enter appreciation of head teacher: ");
								managerFacede.studentManager.listStudent.get(choose).listMark.get(chooseMark)
										.setPMAppreciate(input.readLine());
								System.out.println("---Set successful!---");
							} else if (temp1 == 3) {
								System.out.println("Enter general appreciation: ");
								managerFacede.studentManager.listStudent.get(choose).setAppreciation(input.readLine());
								System.out.println("---Set successful!---");
							} else if (temp1 == 4) {
								System.out.println("Enter quiz mark: ");
								managerFacede.studentManager.listStudent.get(choose).listMark.get(chooseMark)
										.setQuizMark(Float.parseFloat(input.readLine()));
								System.out.println("Enter practice mark: ");
								managerFacede.studentManager.listStudent.get(choose).listMark.get(chooseMark)
										.setPracticeMark(Float.parseFloat(input.readLine()));
								System.out.println("---Set successful!---");
							} else if (temp1 == 5) {
								int append = managerFacede.studentManager.listStudent.get(choose).listMark
										.get(chooseMark).listSession.size() - 1;
								System.out.println("Enter assignment mark: ");
								managerFacede.studentManager.listStudent.get(choose).listMark
										.get(chooseMark).listSession.get(append)
												.setAssignmentMark(Float.parseFloat(input.readLine()));
								System.out.println("Enter positive mark: ");
								managerFacede.studentManager.listStudent.get(choose).listMark
										.get(chooseMark).listSession.get(append)
												.setPositiveMark(Float.parseFloat(input.readLine()));
								System.out.println("Enter make attendance mark: ");
								managerFacede.studentManager.listStudent.get(choose).listMark
										.get(chooseMark).listSession.get(append)
												.setPlusMark(Integer.parseInt(input.readLine()));
								System.out.println("---Set successful!---");
							} else if (temp1 == 6) {
								int append = managerFacede.studentManager.listStudent.get(choose).listMark
										.get(chooseMark).listSession.size() - 1;
								System.out.println("Enter make attendance mark: ");
								managerFacede.studentManager.listStudent.get(choose).listMark
										.get(chooseMark).listSession.get(append)
												.setPlusMark(Integer.parseInt(input.readLine()));
								System.out.println("---Set successful!---");
							}
						}
					} else if (temp1 == 2) {
						managerFacede.studentManager.print();
					}
					break;
				default:
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//to print student manager menu and return a type int.
	private static int studentManagerMenu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int temp = -1;
		while (temp < 0 || temp > 2) {
			System.out.println("-----Menu-----");
			System.out.println("1. Manage a student");
			System.out.println("2. Print student list");
			System.out.println("Enter 0 to quit! Enter a chosen 0->2: ");
			temp = input.nextInt();
		}
		return temp;
	}
	//to print manage a student menu and return a type int.
	private static int aStudentMenu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int temp = -1;
		while (temp < 0 || temp > 6) {
			System.out.println("-----Menu manage a student-----");
			System.out.println("1. Add a session");
			System.out.println("2. Appreciate for subject");
			System.out.println("3. Genernal appreciation");
			System.out.println("4. Make exam mark");
			System.out.println("5. Make personal mark");
			System.out.println("6. Make attendance");

			System.out.println("Enter 0 to quit! Enter a chosen 0->6: ");
			temp = input.nextInt();
		}
		return temp;
	}
	//to print main menu and return a type int.
	private static int mainMenu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int temp = -1;
		while (temp < 0 || temp > 4) {
			System.out.println("-----Menu-----");
			System.out.println("1. Teacher manager");
			System.out.println("2. Subject Manager");
			System.out.println("3. Course Manager");
			System.out.println("4. Student Manager");
			System.out.println("Enter 0 to quit! Enter a chosen 0->4: ");
			temp = input.nextInt();
		}
		return temp;
	}
	//to print subject manager menu and return a type int.
	private static int subjectManagerMenu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int temp = -1;
		while (temp < 0 || temp > 2) {
			System.out.println("-----Menu-----");
			System.out.println("1. Add a subject");
			System.out.println("2. Print subject list");
			System.out.println("Enter 0 to quit! Enter a chosen 0->2: ");
			temp = input.nextInt();
		}
		return temp;
	}
	//to print teacher manager menu and return a type int.
	private static int teacherManagerMenu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int temp = -1;
		while (temp < 0 || temp > 2) {
			System.out.println("-----Menu-----");
			System.out.println("1. Add a teacher");
			System.out.println("2. Print teacher list");
			System.out.println("Enter 0 to quit! Enter a chosen 0->2: ");
			temp = input.nextInt();
		}
		return temp;
	}
	//to print course manager menu and return a type int.
	private static int courseManagerMenu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int temp = -1;
		while (temp < 0 || temp > 2) {
			System.out.println("-----Menu-----");
			System.out.println("1. Add a course");
			System.out.println("2. Print course list");
			System.out.println("Enter 0 to quit! Enter a chosen 0->2: ");
			temp = input.nextInt();
		}
		return temp;
	}
	//to set example data for SubjectManager class
	public static SubjectManager setDataSubject(ManagerFacade managerFacade) {
		SubjectManager sm = new SubjectManager();

		Subject s1 = new Subject("Java", "10/07/2016", "20/07/2016", 50);
		s1.setM_Teacher(managerFacade.teacherManager.listTeacher.get(0));

		Subject s2 = new Subject("Linux", "21/07/2016", "30/07/2016", 50);
		s2.setM_Teacher(managerFacade.teacherManager.listTeacher.get(1));

		Subject s3 = new Subject("Java Advanced", "11/12/2016", "01/02/2017", 50);
		s3.setM_Teacher(managerFacade.teacherManager.listTeacher.get(0));

		Subject s4 = new Subject("C/C++", "10/10/2016", "20/11/2016", 50);
		s4.setM_Teacher(managerFacade.teacherManager.listTeacher.get(3));

		Subject s5 = new Subject("C#", "10/09/2016", "20/10/2016", 50);
		s5.setM_Teacher(managerFacade.teacherManager.listTeacher.get(2));

		sm.add(s1);
		sm.add(s2);
		sm.add(s3);
		sm.add(s4);
		sm.add(s5);

		return sm;
	}
	//to set example data for TeacherManager class
	public static TeacherManager setdataTeacher() {
		TeacherManager tm = new TeacherManager();

		Teacher teacher1 = new Teacher("KTP", "01/01/1999", "0123456789", "ktp@gmail.com");
		teacher1.listTeach.add("Java");
		teacher1.listTeach.add("Java Advanced");

		Teacher teacher2 = new Teacher("VQT", "01/01/1988", "0987624560", "vqt@gmail.com");
		teacher2.listTeach.add("Linux");

		Teacher teacher3 = new Teacher("DVT", "01/01/1978", "0924658795", "dvt@gmail.com");
		teacher3.listTeach.add("C#");

		Teacher teacher4 = new Teacher("DGQT", "01/01/1994", "01648568778", "dgqt@gmail.com");
		teacher4.listTeach.add("C/C++");

		tm.add(teacher1);
		tm.add(teacher2);
		tm.add(teacher3);
		tm.add(teacher4);

		return tm;
	}
	//to set example data for StudentManager class
	public static StudentManager setDataStudent(ManagerFacade managerFacade) {
		StudentManager sm = new StudentManager();

		Session s1 = new Session(6, 6, 10);
		Session s2 = new Session(7, 7, 9);
		Session s3 = new Session(8, 8, 8);
		Session s4 = new Session(9, 9, 7);
		Session s5 = new Session(10, 6, 6);

		Mark m1 = new Mark(7, 7, "trying", "hard work");
		m1.setM_Subject(managerFacade.subjectManager.listSubject.get(1));
		m1.listSession.add(s1);
		m1.listSession.add(s2);

		Mark m2 = new Mark(8, 8, "trying", "rather");
		m2.setM_Subject(managerFacade.subjectManager.listSubject.get(0));
		m2.listSession.add(s1);
		m2.listSession.add(s3);

		Mark m3 = new Mark(9, 9, "good", "good");
		m3.setM_Subject(managerFacade.subjectManager.listSubject.get(0));
		m3.listSession.add(s2);
		m3.listSession.add(s4);

		Mark m4 = new Mark(10, 10, "very good", "perfect");
		m4.setM_Subject(managerFacade.subjectManager.listSubject.get(0));
		m4.listSession.add(s3);
		m4.listSession.add(s5);

		Student st1 = new Student("Minh", "20/04/1994", "01648585678", "wm@gmail.com", "Ok");
		st1.listMark.add(m4);
		Student st2 = new Student("Quan", "9/02/1994", "123456789", "mq@gmail.com", "Ok");
		st2.listMark.add(m3);
		Student st3 = new Student("Dan", "30/01/1994", "0909080878", "tnd@gmail.com", "Ok");
		st3.listMark.add(m2);
		Student st4 = new Student("Thuan", "2/04/1994", "01648585678", "wm@gmail.com", "Ok");
		st4.listMark.add(m1);
		Student st5 = new Student("Dien", "3/10/1994", "01648585678", "wm@gmail.com", "Ok");
		st5.listMark.add(m1);

		sm.listStudent.add(st1);
		sm.listStudent.add(st2);
		sm.listStudent.add(st3);
		sm.listStudent.add(st4);
		sm.listStudent.add(st5);
		return sm;
	}
	//to set example data for CourseManager class
	public static CourseManager setDataCourse(ManagerFacade managerFacede) {
		CourseManager cm = new CourseManager();

		Course c1 = new Course("01", "Java class", "10/07/2016", "15/10/2016");
		c1.setM_Teacher(managerFacede.teacherManager.listTeacher.get(0));
		c1.listSubject.add(managerFacede.subjectManager.listSubject.get(0));
		c1.listSubject.add(managerFacede.subjectManager.listSubject.get(2));
		c1.listStudent.add(managerFacede.studentManager.listStudent.get(0));
		c1.listStudent.add(managerFacede.studentManager.listStudent.get(1));
		c1.listStudent.add(managerFacede.studentManager.listStudent.get(2));

		Course c2 = new Course("02", "Advanced", "10/08/2016", "15/11/2016");
		c2.setM_Teacher(managerFacede.teacherManager.listTeacher.get(1));
		c2.listSubject.add(managerFacede.subjectManager.listSubject.get(1));
		c2.listSubject.add(managerFacede.subjectManager.listSubject.get(3));
		c2.listSubject.add(managerFacede.subjectManager.listSubject.get(4));
		c2.listStudent.add(managerFacede.studentManager.listStudent.get(3));
		c2.listStudent.add(managerFacede.studentManager.listStudent.get(4));

		cm.add(c1);
		cm.add(c2);
		return cm;
	}
}