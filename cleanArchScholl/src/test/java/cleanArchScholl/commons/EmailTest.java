package cleanArchScholl.commons;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void invalidNullEmailAddress() {
		assertThrows(
			IllegalArgumentException.class, 
			() -> new Email(null)
		);
	}

	@Test
	void invalidEmptyEmailAddress() {
		assertThrows(
			IllegalArgumentException.class, 
			() -> new Email("")
		);
	}

	@Test
	void invalidWithoutAtEmailAddress() {
		assertThrows(
				IllegalArgumentException.class, 
				() -> new Email("myemail.com")
				);
	}

	@Test
	void invalidWithoutDotEmailAddress() {
		assertThrows(
				IllegalArgumentException.class, 
				() -> new Email("myemail@provider")
				);
	}

	@Test
	void validEmailAddress() {
		// Arrange
		String emailAddress = "myEmail@provider.com";

		// Act
		Email email = new Email(emailAddress);

		assertNotNull(email);
	}

}