package CSVBase;

public class CSVReadWrite {
	private static String path = "./Database/";

	public static boolean saveToFile(String fileName, String data) {
		try {
			TextIO.writeFile(path + fileName + ".csv");
			TextIO.putln(data);
		}
		catch(Exception e) {
			return false;
		}
		return true;
	}

}
