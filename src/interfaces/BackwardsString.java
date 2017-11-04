package interfaces;

public class BackwardsString extends SpecialString implements TextFunkifier{

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String text) {
		String output = "";
		for (int i = 0; i < text.length(); i++) {
			output= text.charAt(i)+output;
		}
		return output;
	}

}
