package nz.ac.massey.cs.pp.tutorial2.id19023236;
import java.util.*;
import java.io.*;

public class trytodo {
	public static void main(String[] args) throws Exception {
//		String readf="D:\\pathon\\272\\tutorial\\Tutorial+2-20190309\\students.csv";
//		String writef="D:\\\\student.html";
		
		String readf=args[0];
		String writef=args[1];
		
		File file1 = new File(readf);
		File file2 = new File(writef);
		BufferedReader reader = new BufferedReader(new FileReader(file1));
		String tempstring=null;
		FileWriter fw = new FileWriter(file2,true);
		fw.write("<html>\r\n" +"		 <body>\r\n" +"		 <table border=\"1\">");
		while((tempstring=reader.readLine()) != null) {
			Studentclass student = new Studentclass();
			StringTokenizer st = new StringTokenizer(tempstring,",");

			student.student_id=st.nextToken(",");
			student.student_firstName=st.nextToken(",");
			student.student_name=st.nextToken(",");
			student.student_program=st.nextToken(",");
			student.student_major=st.nextToken(",");
			
			fw.write("<tr>\r\n" );
			fw.write("	   <th>"+student.student_id);
			fw.write("	   <th>"+student.student_firstName);
			fw.write("	   <th>"+student.student_name);
			fw.write("	   <th>"+student.student_program);
			fw.write("	   <th>"+student.student_major);
			fw.write("  </tr>");
		}
		fw.write("</table>\r\n"+"</body>\r\n"+"</html>");
		fw.close();		
	}		
}
