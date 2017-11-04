package interfaces;

public class MixedCapsString extends SpecialString implements TextFunkifier {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String text) {
		text = text.toLowerCase();
		for(int i = 0;i<text.length();i++) {
			if(i%2==1) {
				text = text.substring(0,i) + Character.toUpperCase(text.charAt(i)) + text.substring(i+1);
			}
		}
		text=text.trim();
		return text;
	}

}
