
public class Television {
	
	//instance variables
		private String brand;
		private boolean power;
		
		//overloaded constructors
		public Television(String brand, int power) {
			this.brand = brand;
			if (power==1)
			{
				this.power = true;
			}
			else
			{
				this.power = false;
			}
		}
		
		//default constructor
		public Television() {
			this("", 0); //brand = ""
						 //power = 0;
		}
		
		public Television(String newBrand) {
			brand = newBrand; //this(newBrand,0);
			power = false;
		}
		
		public void setBrand(String brand) {
			this.brand = brand;
		}
		
		public void setPower(int power) {
			if(power == 0) 
				this.power = false;
			else if (power == 1)
				this.power = true;
			else
				this.power = false;
		}
		
		public String getBrand() {
			return brand;
		}
		
		public int getPower() {
			if (power == false)
				return 0;
			else
				return 1;
		}
		

}
