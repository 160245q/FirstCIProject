import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class RentalAnalysis {

	public RentalAnalysis() {
	}

	public ArrayList<RentalRecord> createRecords() {

		ArrayList<RentalRecord> rList = new ArrayList<RentalRecord>();

		// for Honda Fit records

		RentalRecord rh1 = new RentalRecord("Honda Fit", "Jul", 1543.75, 25);
		rList.add(rh1);

		RentalRecord rh2 = new RentalRecord("Honda Fit", "Aug", 1235.00, 20);
		rList.add(rh2);

		RentalRecord rh3 = new RentalRecord("Honda Fit", "Sep", 1235.00, 20);
		rList.add(rh3);

		RentalRecord rh4 = new RentalRecord("Honda Fit", "Oct", 1543.75, 25);
		rList.add(rh4);

		RentalRecord rh5 = new RentalRecord("Honda Fit", "Nov", 1852.50, 30);
		rList.add(rh5);

		RentalRecord rh6 = new RentalRecord("Honda Fit", "Dec", 3087.50, 50);
		rList.add(rh6);

		// for Toyota Wish records
		RentalRecord rt1 = new RentalRecord("Toyota Wish", "Jul", 1140.00, 15);
		rList.add(rt1);

		RentalRecord rt2 = new RentalRecord("Toyota Wish", "Aug", 1140.00, 15);
		rList.add(rt2);

		RentalRecord rt3 = new RentalRecord("Toyota Wish", "Sep", 1140.00, 15);
		rList.add(rt3);

		RentalRecord rt4 = new RentalRecord("Toyota Wish", "Oct", 2280.00, 30);
		rList.add(rt4);

		RentalRecord rt5 = new RentalRecord("Toyota Wish", "Nov", 2660.00, 35);
		rList.add(rt5);

		RentalRecord rt6 = new RentalRecord("Toyota Wish", "Dec", 3800.00, 50);
		rList.add(rt6);

		return rList;

	}

	// complete this method
	public double aveMonthlyRentalDur(String carModel, ArrayList<RentalRecord> rlist) {
		double total = 0.0;
		ArrayList<RentalRecord> honda = new ArrayList<RentalRecord>();
		ArrayList<RentalRecord> toyota = new ArrayList<RentalRecord>();

		if (carModel.equals("Honda Fit")) {
			for (RentalRecord Rentalrecord : rlist) {
				if (Rentalrecord.getModel() == "Honda Fit") {
					honda.add(Rentalrecord);
				}
			}
			for (int i = 0; i < honda.size(); i++) {
				total = total + honda.get(i).getDuration();

			}
		} else if (carModel.equals("Toyota Wish")) {
			for (RentalRecord Rentalrecord : rlist) {
				if (Rentalrecord.getModel() == "Toyota Wish") {
					toyota.add(Rentalrecord);
				}
			}
			for (int i = 0; i < toyota.size(); i++) {
				total = total + toyota.get(i).getDuration();

			}

		}

		double x = total / 6;
		return Math.floor(x);
	}

	// complete this method
	public double totalRev(String carModel, ArrayList<RentalRecord> rlist) {

		double total = 0.0;
		ArrayList<RentalRecord> honda = new ArrayList<RentalRecord>();
		ArrayList<RentalRecord> toyota = new ArrayList<RentalRecord>();

		if (carModel.equals("Honda Fit")) {
			for (RentalRecord Rentalrecord : rlist) {
				if (Rentalrecord.getModel() == "Honda Fit") {
					honda.add(Rentalrecord);
				}
			}
			for (int i = 0; i < honda.size(); i++) {
				total = total + honda.get(i).getRevenue();

			}
		} else if (carModel.equals("Toyota Wish")) {
			for (RentalRecord Rentalrecord : rlist) {
				if (Rentalrecord.getModel() == "Toyota Wish") {
					toyota.add(Rentalrecord);
				}
			}
			for (int i = 0; i < toyota.size(); i++) {
				total = total + toyota.get(i).getRevenue();

			}

		}

		return total;

	}

}
