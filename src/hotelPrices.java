import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class hotelPrices {

	public static void main(String[] args) {
		int royalPalm = 275;
		int finchBay = 337;
		int casaNatura = 99;
		int daysStaying;
		
		String input;
		do {
			input = JOptionPane.showInputDialog(null, "How many days are you staying?");
			daysStaying = Integer.parseInt(input);
		} while (daysStaying <= 0);
		
		ImageIcon icon = new ImageIcon("swimming-pool.jpg");
		ImageIcon icon2 = new ImageIcon("finch-bay-eco-hotel.jpg");
		ImageIcon icon3 = new ImageIcon("casa-natura-galapagos.jpg");
		
		
		if (daysStaying > 0) {
			int totalPrice1 = daysStaying * royalPalm;
			JOptionPane.showMessageDialog(null, 
					"At Royal Palm Hotel, your total cost for " 
					+ daysStaying + " days will be $" 
					+ totalPrice1 + ".", "Royal Palm Hotel", JOptionPane.INFORMATION_MESSAGE, icon);
			int totalPrice2 = daysStaying * finchBay;
			JOptionPane.showMessageDialog(null, 
					"At Finch Bay Hotel, your total cost for " 
					+ daysStaying + " days will be $" 
					+ totalPrice2 + ".", "Finch Bay Hotel", JOptionPane.INFORMATION_MESSAGE, icon2);
			int totalPrice3 = daysStaying * casaNatura;
			JOptionPane.showMessageDialog(null, 
					"At Casa Natura Hotel, your total cost for " 
					+ daysStaying + " days will be $" 
					+ totalPrice3 + ".", "Casa Natura Hotel", JOptionPane.INFORMATION_MESSAGE, icon3);
			
			int numStars = totalPrice1/50;
			String stars1 = "*";
			String totalStars1 = "";
			for (int i = 0; i < numStars; i +=1) {
				totalStars1 += stars1;
			}
			
			int numStars2 = totalPrice2/50;
			String stars2 = "*";
			String totalStars2 = "";
			for (int i = 0; i < numStars2; i +=1) {
				totalStars2 += stars2;
			}
			
			int numStars3 = totalPrice3/50;
			String stars3 = "*";
			String totalStars3 = "";
			for (int i = 0; i < numStars3; i +=1) {
				totalStars3 += stars3;
			}
			JOptionPane.showMessageDialog(null, "For " + daysStaying 
					+ " nights, it will cost:\n  Royal Palm Hotel: " + totalStars1 + " ($" + totalPrice1 + ")"
					+ "\n    Finch Bay Hotel: " + totalStars2 + " ($" + totalPrice2 + ")" 
					+ "\nCasa Natura Hotel: " + totalStars3 + " ($" + totalPrice3 + ")");
			
		}
			
		
	}

}
