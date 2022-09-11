import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student student = new Student(1, "Gopal Komati", 25, "CS");
		list.add(student);
		student = new Student(2, "Gopi Komati", 23, "Mthematics");
		list.add(student);
		student = new Student(3, "z Gopal Komati", 26, "Physics");
		list.add(student);
		System.out.println("list before sort - " + list);
		// Collections.sort(list);
		List<Student> list3 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("list after sort - " + list3);
		List<Student> list2 = list.stream().filter(i -> i.getFee() % 2 != 0).collect(Collectors.toList());
		System.out.println("list after filter- " + list2);
	}
}
