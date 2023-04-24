package cleanArchScholl.utils;

public class NumberUtils {
	
	public static boolean isAValidShort(String pShort) {
		boolean result = false;
		
		if ( 
				StringUtils.isStringValid(pShort)
		) {
			try {
				short validShort = Short.valueOf(pShort);
				result = true;
			} catch (NumberFormatException nfe) {
				result = false;
			}
		}
		
		return result;
	}
	
	public static boolean isAValidInteger(String pInteger) {
		boolean result = false;
		
		if ( 
				StringUtils.isStringValid(pInteger)
		) {
			try {
				int validInt = Integer.valueOf(pInteger);
				result = true;
			} catch (NumberFormatException nfe) {
				result = false;
			}
		}
		
		return result;
	}
	
}