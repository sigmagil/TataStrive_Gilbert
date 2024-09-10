package Day6;

public class Hosteller extends Student {
	private int roomNumber;
	private String blockName;
	private String roomType;
	private double TotalAmount;
	private double hostelFee;
	
	//constructor
	
	
	public Hosteller(int studentId, String studentName, String department, String gender, int category,
			double collegeFee, int roomNumber, String blockName, String roomType) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.roomNumber = roomNumber;
		this.blockName = blockName;
		this.roomType = roomType;
	}


	


	//getter and setter
	//room number
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	//block name
	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	//room type
	public String getRoomType() {
		
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	
	//method total fees
		@Override
		public double calculateTotalFee() {
			
			double totalFee=getCollegeFee();
			if(blockName=="a") {
				totalFee+=60000;
				if(roomType.equals("ac")){
					totalFee+=8000;
				}
			}
			else if(blockName=="b") {
				totalFee+=50000;
				if(roomType.equals("ac")){
					totalFee+=5000;
				}
			}
			else if(blockName=="c") {
				totalFee+=60000;
				if(roomType.equals("ac")){
					totalFee+=2500;
				}
			}
			
			return  totalFee;
		}
	
}
