package cleanArchScholl.utils;

public class StringUtils {
	
	public static boolean isStringValid(String pString) {
		boolean result = false;
		
		if ( pString != null && !pString.isEmpty() && !pString.isBlank()) {
			result = true;
		}
		
		return result;
	}
	
}