import java.util.Scanner;
import java.util.ArrayList;

public class problem4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while(in.hasNext()) {
			String input = in.nextLine();
			String[] tokens = input.split("/");	//splits the path into its parts
			String result = "";
			ArrayList<String> fullPath = new ArrayList<String>();

			for(int i = 0; i < tokens.length; i++) {
				if(fullPath.size() != 0) {
					if(!tokens[i].equals(".")) {
						if(tokens[i].equals("..")) {
							if(fullPath.get(fullPath.size() - 1).equals(".."))
								fullPath.add(tokens[i]);
							else if(fullPath.get(fullPath.size() - 1).equals(".")) {
								fullPath.remove(fullPath.size() - 1);
								fullPath.add(tokens[i]);
							}
							else
								fullPath.remove(fullPath.size() - 1);
						}
						else
							fullPath.add(tokens[i]);
					}

				}
				else
					fullPath.add(tokens[i]);
			}

			// if(fullPath.size() == 1 && fullPath.get(0).equals("."))
			// 	fullPath.remove(0);
			if(fullPath.size() == 0)
				fullPath.add(".");

			for(int i = 0; i < fullPath.size(); i++) {
				result += fullPath.get(i);
				if(i != fullPath.size() - 1)
					result += "/";
			}

			System.out.println(result);
		}
	}
}

/*

//try 1
import java.util.Scanner;
import java.util.ArrayList;

public class problem4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while(in.hasNext()) {
			String input = in.nextLine();
			String[] tokens = input.split("/");	//splits the path into its parts
			String result = "";
			ArrayList<String> fullPath = new ArrayList<String>();

			for(int i = 0; i < tokens.length; i++) {
				if(tokens[i].equals("..")) {
					if(fullPath.size() != 0) {
						if(!tokens[i -1].equals(".."))	//size != 0 safe
							fullPath.remove(fullPath.size() - 1);
						else
							fullPath.add(tokens[i]);	
					}
					else
						fullPath.add(tokens[i]);	
				}
				else if(fullPath.size()==1)
					{
						if(fullPath.get(0).equals(".") && (tokens[i].equals(".") || tokens[i].equals(".")))
							fullPath.remove(0);
						fullPath.add(tokens[i]);
					
					}
				else if(fullPath.size() == 0)		//IS a "."
					fullPath.add(tokens[i]);
			}

			if(fullPath.size() == 1 && fullPath.get(0).equals("."))
				fullPath.remove(0);

			for(int i = 0; i < fullPath.size(); i++) {
				result += fullPath.get(i);
				if(i != fullPath.size() - 1)
					result += "/";
			}

			System.out.println(result);
		}
	}
}





////////////////////////



//try 2
import java.util.Scanner;
import java.util.ArrayList;

public class problem4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while(in.hasNext()) {
			String input = in.nextLine();
			String[] tokens = input.split("/");	//splits the path into its parts
			String result = "";
			ArrayList<String> fullPath = new ArrayList<String>();

			for(int i = 0; i < tokens.length; i++) {
				if(fullPath.size() == 0) {
					fullPath.add(tokens[i]);
				}
				else if(fullPath.size() == 1) {
					if(fullPath.get(0).equals("."))
						if(tokens[i].equals(".."))
							fullPath.remove(0);
						if(!tokens[i].equals("."))
							fullPath.add(tokens[i]);
				}
				else {	
					if(!tokens[i].equals(".")) {
						if(tokens[i -1].equals(".."))	//size != 0 safe
								fullPath.add(tokens[i]);	
						else
							fullPath.remove(fullPath.size() - 1);
					}
				}
			}


			for(int i = 0; i < fullPath.size(); i++) {
				result += fullPath.get(i);
				if(i != fullPath.size() - 1)
					result += "/";
			}

			System.out.println(result);
		}
	}
}


*/
