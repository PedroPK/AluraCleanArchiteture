package cleanArchScholl.commons;

public class Email {
	
	private String prefix;
	private String domain;
	
	public Email(String pPrefix, String pDomain) {
		super();
		
		if ( pPrefix != null && !pPrefix.isBlank()  &&
			 pDomain != null && !pDomain.isBlank()
		) {
			this.prefix = pPrefix;			
			this.domain = pDomain;
		} else {
			throw new IllegalArgumentException("Prefix or Domain are Invalid");
		}
	}
	
	public Email(String pFullAddress) {
		super();
		
		if ( 	 pFullAddress != null 			&& 
				!pFullAddress.isBlank() 		&& 
				 pFullAddress.contains("@") 	&& 
				 pFullAddress.contains(".") 
		) {
			String[] email = pFullAddress.split("@");
			this.prefix = email[0];
			this.domain = email[1];
		} else {
			throw new IllegalArgumentException("Prefix or Domain are Invalid");
		}
	}
	
}
