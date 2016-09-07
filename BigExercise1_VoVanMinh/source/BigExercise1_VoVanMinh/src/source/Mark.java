package source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author vovanminh
 * @version 1.0
 * @created 06-Sep-2016 6:40:13 PM
 */
public class Mark {

	private float quizMark;
	private float practiceMark;
	private String PMAppreciate;
	private String SubTeacherAppreciate;
	public Subject m_Subject = new Subject();
	public ArrayList<Session> listSession = new ArrayList<Session>();

	public Mark() {

	}

	public Mark(float quizMark, float practiceMark, String pMAppreciate, String subTeacherAppreciate) {
		super();
		this.quizMark = quizMark;
		this.practiceMark = practiceMark;
		PMAppreciate = pMAppreciate;
		SubTeacherAppreciate = subTeacherAppreciate;
	}

	public float getQuizMark() {
		return quizMark;
	}

	public void setQuizMark(float quizMark) {
		this.quizMark = quizMark;
	}

	public float getPracticeMark() {
		return practiceMark;
	}

	public void setPracticeMark(float practiceMark) {
		this.practiceMark = practiceMark;
	}

	public String getPMAppreciate() {
		return PMAppreciate;
	}

	public void setPMAppreciate(String pMAppreciate) {
		PMAppreciate = pMAppreciate;
	}

	public String getSubTeacherAppreciate() {
		return SubTeacherAppreciate;
	}

	public void setSubTeacherAppreciate(String subTeacherAppreciate) {
		SubTeacherAppreciate = subTeacherAppreciate;
	}

	public Subject getM_Subject() {
		return m_Subject;
	}

	public void setM_Subject(Subject m_Subject) {
		this.m_Subject = m_Subject;
	}

	public ArrayList<Session> getListSession() {
		return listSession;
	}

	public void setListSession(ArrayList<Session> listSession) {
		this.listSession = listSession;
	}
	
	//to calculate total mark of subject.
	public float totalMark() {
		return (float) (totalPersonalMark() * 0.3 + quizMark * 0.4 + practiceMark * 0.3);
	}
	//to calculate total personal mark of all session.
	public float totalPersonalMark() {
		float result = 0;
		int count = 0;
		for (int i = 0; i < listSession.size(); i++) {
			result += listSession.get(i).sumMark();
			count++;
		}
		if (count != 0)
			result /= count;
		return result;
	}
	/*
	 * to get a Mark from keyboard.
	 * return a Mark.
	 */
	static Mark getMark() throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-------Input Mark Information-----");
		System.out.println("Enter quiz mark: ");
		Float quiz = Float.parseFloat(input.readLine());
		System.out.println("Enter practice mark: ");
		Float prac = Float.parseFloat(input.readLine());
		String PMAppreciate = " ";
		String SubTeacherAppreciate = " ";

		Mark m = new Mark(quiz, prac, PMAppreciate, SubTeacherAppreciate);
		return m;
	}
	//to print a Mark.
	public void printMark() {
		System.out.println("-------Mark Information-----");
		System.out.println("Quiz mark: " + quizMark);
		System.out.println("Practice mark: " + practiceMark);
		System.out.println("Head teacher appreciate: " + PMAppreciate);
		System.out.println("Subject Teacher appreciate: " + SubTeacherAppreciate);
		System.out.println("Total Personal Mark: " + totalPersonalMark());
		System.out.println("Total Mark: " + totalMark());
		m_Subject.printSubject();
		printSessionList();
	}
	//to print session list of a mark.
	public void printSessionList() {
		System.out.println("----------Session List-------");
		for (int i = 0; i < listSession.size(); i++) {
			listSession.get(i).printSession();
		}
	}
}