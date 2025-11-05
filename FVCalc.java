// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		double currentValue = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		double n = Double.parseDouble(args[2]);
		double futureValue = currentValue * Math.pow((1 + rate/100), n);

		// Format: years as integer, current as integer, rate with one decimal, future truncated to integer
		String rateStr = String.format("%.1f", rate);
		long futureInt = (long) futureValue; // truncate toward zero to match expected outputs
		System.out.println("After " + (int) n + " years, $" + (int) currentValue +
			" saved at " + rateStr + "% will yield $" + futureInt);
	}
}