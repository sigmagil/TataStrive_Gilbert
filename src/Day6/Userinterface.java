package Day6;

import java.util.Scanner;

public class Userinterface {
	public static void main(String[] args) {
		Hosteller ht=new Hosteller(0, null, null, null, 0, 0, 0, null, null);
		DayScholar ds=new DayScholar(0, null, null, null, 0, 0, 0, 0);
		Student st=null;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Student id");
		st.setStudentId(sc.nextInt());
		
		System.out.println("Enter Student name");
		st.setStudentName(sc.next());
		sc.nextLine();
		
		System.out.println("Enter Department name");
		st.setDepartment(sc.nextLine());
		
		System.out.println("Enter Gender");
		st.setGender(sc.nextLine());
		
		System.out.println("Enter College fee");
		st.setCollegeFee(sc.nextInt());
		
		System.out.println("Select Category");
		System.out.println("1,Hosteller\n2,Dayscholar");
		st.setCategory(sc.nextInt());
		
		if(st.getCategory()==1) {

			System.out.println("Enter  the room number");
			ht.setRoomNumber(sc.nextInt());
			
			System.out.println("Enter  the block name");
			ht.setBlockName(sc.next());
			sc.nextLine();
			
			System.out.println("Enter  the room type");
			ht.setRoomType(sc.nextLine());
			
			
			
			
			System.out.println("Total College fee is" +  ht.calculateTotalFee());
			
		}
		else if(st.getCategory()==2) {
			
			System.out.println("Enter Bus Number");
			ds.setBusNumber(sc.nextInt());
			
			System.out.println("Enter the distance");
			ds.setDistance(sc.nextInt());
			
			System.out.println("Total College fee is" +  ds.calculateTotalFee());
		}
		
		
		
	}
}
