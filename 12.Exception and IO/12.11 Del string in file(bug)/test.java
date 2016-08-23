import java.io.*;
import java.util.*;
public class test {
	public static void main(String args[])throws Exception{
		if (args.length!=2){
			System.out.println("Number of input args must be three!");
			System.exit(1);
		}
		File sourceFile = new File(args[1]);
		if(!sourceFile.exists()){
			System.out.println("Source file not exist.");
			System.exit(2);
		}
		try(
				Scanner input = new Scanner(sourceFile);
				PrintWriter output = new PrintWriter(sourceFile);
				)
				{
					while(input.hasNext()){
						String s1 = input.nextLine();
						s1.replaceAll(args[0], "");
						//output.print(s2);
					}
					input.close();
					output.close();
				}
	}
}

