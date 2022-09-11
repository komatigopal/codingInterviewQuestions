
public class Student implements Comparable<Student> {
	private int htno;
	private String name;
	private int fee;
	private String subs;

	public int getHtno() {
		return htno;
	}

	public void setHtno(int htno) {
		this.htno = htno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getSubs() {
		return subs;
	}

	public void setSubs(String subs) {
		this.subs = subs;
	}

	public Student(int htno, String name, int fee, String subs) {
		super();
		this.htno = htno;
		this.name = name;
		this.fee = fee;
		this.subs = subs;
	}

	@Override
	public String toString() {
		return "Student [htno=" + htno + ", name=" + name + ", fee=" + fee + ", subs=" + subs + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fee;
		result = prime * result + htno;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((subs == null) ? 0 : subs.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (fee != other.fee)
			return false;
		if (htno != other.htno)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (subs == null) {
			if (other.subs != null)
				return false;
		} else if (!subs.equals(other.subs))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		/*
		 * Student e = (Student) o; int iSalComaprison = Integer.compare(this.fee,
		 * e.fee); if (iSalComaprison == 0) {// Salaries are equal use name as
		 * comparison criteria return name.compareTo(e.name); } return iSalComaprison;
		 */
		return name.compareTo(o.name);
	}

}
