package exercise8;
import java.util.ArrayList;
import java.util.List;
import exercise7.HumanWeightInMars;

public class HumanWeightList {
	public static void main(String[] args) {
		
		List<Double> OnEarthList = new ArrayList<Double>();
		List<Double> OnMarsList = new ArrayList<Double>();
		
		OnEarthList.add(37.6);
		OnEarthList.add(47.6);
		OnEarthList.add(57.6);
		OnEarthList.add(67.6);
		OnEarthList.add(77.6);

		for(double next:OnEarthList ) {
			HumanWeightInMars.calculateHumanWeigh(next);
			
		}
	}
}