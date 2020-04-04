import java.util.ArrayList;
import java.util.List;

class Course {
	private List<Student> lista;

	public Course(List<Student> lista) {
		this.lista = lista;
	}

	public List<Student> getLista() {
		return lista;
	}

	public void setLista(List<Student> lista) {
		this.lista = lista;
	}
	public static void funkcija(List<Integer> lista) {
		int suma1 = 0;
		for (int i = 0; i < lista.size(); i++) {
			suma1 = suma1 + lista.get(i);
		}
		System.out.println(suma1);
	}
}



class Student {

	private String index;
	private String firstName;
	private String lastName;
	private List<Integer> labPoints;

	//TODO constructor
	public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}
	//TODO seters & getters
	public String getIndex() {
		return index;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public List<Integer> getLabPoints() {
		return labPoints;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLabPoints(List<Integer> labPoints) {
		this.labPoints = labPoints;
	}

	public static double getAverage(ArrayList<Integer> labPoints) {
		double prosek = 0;
		double suma = 0;
		for(int i=0; i<labPoints.size(); i++){
			suma = suma + labPoints.get(i);
		}
		prosek = suma / labPoints.size();
		return prosek;
	}

	public static void  hasSignature(double prosek) {
		//TODO
		if(prosek > 8){
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> labPoints = new ArrayList<>();
		List<Integer> lista = new ArrayList<>();
		labPoints.add(5);
		labPoints.add(10);
		labPoints.add(6);
		labPoints.add(9);
		labPoints.add(8);
		lista.add(5);
		lista.add(10);
		lista.add(6);
		lista.add(9);
		lista.add(8);

		double prosek = Student.getAverage(labPoints);

		System.out.println(prosek);
		Student.hasSignature(prosek);
		Course.funkcija(lista);
	}
}
