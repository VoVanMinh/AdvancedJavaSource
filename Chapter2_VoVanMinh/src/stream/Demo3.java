package stream;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 12, 2016
 */
public class Demo3 {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		String[] name = { "Minh", "Quan", "Tien", "Dan", "Thuan", "Nha", "Huy", "Nghia", "Dien", "Hoa" };
		int[] age = { 22, 17, 16, 10, 13, 25, 21, 26, 19, 12 };
		float[] mark1 = { 8, 9, 7, 8, 9, 7, 9, 8, 7, 8 };
		float[] mark2 = { 9, 7, 8, 7, 7, 8, 7, 8, 9, 8 };
		
		Demo3 demo = new Demo3();
		for (int i = 0; i < age.length; i++) {
			list.add(demo.new Student(name[i], age[i], mark1[i], mark2[i]));
		}

		System.out.println("Original list is: ");
		list.forEach(i -> System.out.println(i));

		int count = (int) list.stream().filter(i -> i.age >= 18).count();
		System.out.println("---Students have age >= 18 are: " + count);

		count = (int) list.stream().filter(i -> i.name.startsWith("H")).count();
		System.out.println("---The number students have name start with \"H\" are: " + count);

		Optional<Student> result = list.stream().filter(i -> i.name.startsWith("H")).findFirst();
		if (result.isPresent()) {
			System.out.println("\t\tThe first student is " + result.get());
		}

		DoubleSummaryStatistics stats = list.stream().mapToDouble(i -> i.calAverage()).summaryStatistics();
		System.out.println("---Highest mark in list is: " + stats.getMax());
		System.out.println("---Lowest mark in list is: " + stats.getMin());
		System.out.println("---Average of all mark in list is: " + stats.getMax());

		List<Student> list2 = list.stream().filter(i -> i.calAverage() >= 8).map(i -> i).collect(Collectors.toList());
		System.out.println("---Students have mark >= 8 are: " +list2);
		
	}

	public class Student {
		String name;
		int age;
		float mark1;
		float mark2;

		public Student(String name, int age, float mark1, float mark2) {
			super();
			this.name = name;
			this.age = age;
			this.mark1 = mark1;
			this.mark2 = mark2;
		}



		// to print a student info.
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "[" + name + ", " + age + ", " + mark1 + ", " + mark2 + ", " + calAverage() + "]";
		}
		
		//to calculate average mark. Return a float type.
		public float calAverage(){
			return (mark1 + mark2)/2;
		}
	}
}
