package CSVBase;

public class Test {
	public static void main(String[] args) {
		User test = new User("Benjamin", "Talic", 24, true);
		System.out.println(test.toCSVString(";"));
		//TextIO.readUserSelectedFile();
		CSVReadWrite.saveToFile("user", test.toCSVString(";"));
	}
}
