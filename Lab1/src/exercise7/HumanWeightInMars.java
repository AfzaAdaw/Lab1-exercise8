package exercise7;

public class HumanWeightInMars {
		
		double weight;
		static double weightInMars;
		
		public void weight(double weight) {
			this.weight = weight;
		}
		
		public static void calculateHumanWeigh(double weight) {
		weightInMars = weight*0.3783;
		
		System.out.print("\nHuman Weigth in Earth: " + weight);
		System.out.print("\tHuman Weigth in Mars: " + weightInMars);
		
		}
}
