package encode;

import java.util.Base64;

public class PswEncoder {
public String encode (String text) {
		
		java.util.Base64.Encoder encoder = Base64.getEncoder();
		String encodeToString = encoder.encodeToString(text.getBytes());
		
		return encodeToString;
		
}
}
