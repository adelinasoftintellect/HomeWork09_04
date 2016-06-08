import java.util.List;

public class Book extends Library {
	private String bname;
	private String author;
	private int numberpages;

	public Book(String lname, String address, List<String> listbooks, String bname, String author, int numberpages) {
		super(lname, address, listbooks);
		this.bname = bname;
		this.author = author;
		this.numberpages = numberpages;
	}

	public Book() {
		this("", "", listbooks, "", "", 0);
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumberpages() {
		return numberpages;
	}

	public void setNumberpages(int numberpages) {
		this.numberpages = numberpages;
	}

}
