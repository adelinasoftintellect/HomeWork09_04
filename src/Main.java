import java.util.LinkedList;
import java.util.List;

class Library {
	private String lname;
	private String address;
	static List<String> listbooks = new LinkedList<String>();

	public Library(String lname, String address, List<String> listbooks) {
		super();
		this.lname = lname;
		this.address = address;
		this.listbooks = listbooks;
	}

	public Library() {
		this("", "", listbooks);
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static List<String> getListbooks() {

		return listbooks;
	}

	public static void setListbooks(List<String> listbooks) {
		Library.listbooks = listbooks;
	}

	public void addmethod() {
		listbooks.add("Game of thrones");
		listbooks.add("Game of thrones");
		listbooks.add("Game of thrones");
		listbooks.add("Game of thrones");
		listbooks.add("Game of thrones");
		System.out.println(listbooks);
	}

	public void deletemethod() {
		listbooks.remove(1);
		System.out.println(listbooks);
	}
}

public class Main {

	public static void main(String[] args) {

		Book got = new Book("Sofia Library", "", new LinkedList<String>(), "Game of thrones", "George R.R. Martin",
				900);
		got.addmethod();
		got.deletemethod();

	}

}
