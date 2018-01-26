
public class RentalCalculator {

	public static double carRental(String carModel, int duration, boolean firstTimer, boolean member){
		
		double rentalFees = 0.0;
				
		if (firstTimer){
			if (carModel.equals("Honda"))
				rentalFees = 65.0*duration*0.95;
			else
				rentalFees = 80.0*duration*0.95;
		}  
		else {//if customer not firstTimer 
			if (member){ 
			//member = true
			//10% discount <= 3 days
				//20% discount > 3 days
				//handle member transactions
				// ...

				if (carModel.equals("Honda") && (duration > 3))
					rentalFees = 65.0*duration*0.80;
				else if (carModel.equals("Honda") && (duration <= 3))
					rentalFees = 65.0*duration*0.90;
				else if (carModel.equals("Toyota") && (duration > 3))
					rentalFees = 80.0*duration*0.80;
				else
					rentalFees = 80.0*duration*0.90;
				
				
				
				
				
				
				
			}
			else { //non-member
				// no discount for non member
				//handle non-member transactions
				//...
				if (carModel.equals("Honda") && (duration > 3))
					rentalFees = 65.0*duration;
				else if (carModel.equals("Honda") && (duration <= 3))
					rentalFees = 65.0*duration;
				else if (carModel.equals("Toyota") && (duration > 3))
					rentalFees = 80.0*duration;
				else
					rentalFees = 80.0*duration;
				
			}
		}
		
		return rentalFees;
	}
	

}



