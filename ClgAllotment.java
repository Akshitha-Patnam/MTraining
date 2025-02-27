import java.util.*;
public class Clg{
	public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
System.out.print("Candidate Name");
String name=sc.nextLine();
System.out.print("College Name");
String clg=sc.nextLine();

system.out.println("entrance test rank");
int rank=sc.nextInt();
System.out.println("CGPA");
double cgpa=sc.nextDouble();
System.out.print("Branch");
String branch=sc.nextLine();
System.out.print("DOJ");
String doj=sc.nextLine();
System.out.print("Address");
String add=sc.nextLine();
System.out.print("University Name");
String Uni=sc.nextLine();
if (cgpa>=9.0){
System.out.println("top tier");
}
else if(cgpa>=7.5){
System.out.println("mid-tier");
}
else if(cgpa>=6.0){
System.out.println("general");
}
else{
System.out.println("not eligible");
}
if(rank<=500)
System.out.println("IIT/NIT");
else if(rak<=2000)
System.out.println("state university");
else
System.out.println("private college");
System.out.println("\n*******************************************");
System.out.println("College Allotment Order");
System.out.println("*********************************************");
System.out.println("Candidate name"+name);
System.out.println("College name"+ clg);
System.out.println("Entrance test rank"+rank);
System.out.println("Branch"+branch);
System.out.println("DOJ"+doj);
System.out.println("Address"+add);
System.out.println("CGPA"+cgpa);
System.out.println("University Name"+uni);
System.out.println("*********************************************");


