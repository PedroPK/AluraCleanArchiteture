package cleanArchScholl.commons;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CPFTest {

	@Test
	void testNullCPF() {
		// Arrange
		String nullString = null;

		// Act
		// CPF cpf = new CPF(nullString);

		// Assert
		assertThrows(IllegalArgumentException.class, () -> new CPF(nullString));
	}

	@Test
	void testEmptyCPF() {
		// Arrange
		String emptyString = "";

		// Act
		// CPF cpf = new CPF(emptyString);		

		// Assert
		assertThrows(IllegalArgumentException.class, () -> new CPF(emptyString));
	}

	@Test
	void testBlackCPF() {
		// Arrange
		String blankString = " ";

		// Act
		// CPF cpf = new CPF(blankString);		

		// Assert
		assertThrows(IllegalArgumentException.class, () -> new CPF(blankString));
	}

	@Test
	void test9DigitsWithoutDotsCPF() {
		// Arrange
		String nineDigitsWithoutDotsCPF = "123456789";

		// Act
		// CPF cpf = new CPF(nineDigitsWithoutDotsCPF);		

		// Assert
		assertThrows(IllegalArgumentException.class, () -> new CPF(nineDigitsWithoutDotsCPF));
	}

	@Test
	void testValidWithoutDotsCPF() {
		// Arrange
		String nineDigitsWithoutDotsCPF = "12345678901";

		// Act
		// CPF cpf = new CPF(nineDigitsWithoutDotsCPF);		

		// Assert
		assertThrows(IllegalArgumentException.class, () -> new CPF(nineDigitsWithoutDotsCPF));
	}

	@Test
	void testValidWithDotsCPF() {
		// Arrange
		String nineDigitsWithDotsCPF = "123.456.789-01";

		// Act
		CPF cpf = new CPF(nineDigitsWithDotsCPF);		

		// Assert
		assertNotNull(cpf);
	}
	
	@Test
	void testInvaliCPFdWithOneDigitAtThirdSegment() {
		// Arrange
		String nineDigitsWithDotsCPF = "123.456.78-01";
		
		// Act
		// CPF cpf = new CPF(nineDigitsWithoutDotsCPF);		

		// Assert
		assertThrows(IllegalArgumentException.class, () -> new CPF(nineDigitsWithDotsCPF));
	}
	
	@Test
	void testInvaliCPFdWithOneDigitAtSecondSegment() {
		// Arrange
		String nineDigitsWithDotsCPF = "123.45.789-01";
		
		// Act
		// CPF cpf = new CPF(nineDigitsWithoutDotsCPF);		
		
		// Assert
		assertThrows(IllegalArgumentException.class, () -> new CPF(nineDigitsWithDotsCPF));
	}
	
	@Test
	void testInvaliCPFdWithOneDigitAtFirstSegment() {
		// Arrange
		String nineDigitsWithDotsCPF = "12.456.789-01";
		
		// Act
		// CPF cpf = new CPF(nineDigitsWithoutDotsCPF);		
		
		// Assert
		assertThrows(IllegalArgumentException.class, () -> new CPF(nineDigitsWithDotsCPF));
	}
	
	@Test
	void testInvalidCPFWithDotsButOneVerificationDigitOnly() {
		// Arrange
		String nineDigitsWithDotsCPF = "123.456.789-0";
		
		// Act
		// CPF cpf = new CPF(nineDigitsWithoutDotsCPF);		
		
		// Assert
		assertThrows(IllegalArgumentException.class, () -> new CPF(nineDigitsWithDotsCPF));
	}

	@Test
	void testInvalidCPFWithDotsButWithoutHyphenVerificationDigit() {
		// Arrange
		String nineDigitsWithDotsCPF = "123.456.78901";
		
		// Act
		// CPF cpf = new CPF(nineDigitsWithoutDotsCPF);		
		
		// Assert
		assertThrows(IllegalArgumentException.class, () -> new CPF(nineDigitsWithDotsCPF));
	}
	
	@Test
	void testInvalidCPFWithoutDots() {
		// Arrange
		String nineDigitsWithDotsCPF = "123456789-01";
		
		// Act
		// CPF cpf = new CPF(nineDigitsWithoutDotsCPF);		
		
		// Assert
		assertThrows(IllegalArgumentException.class, () -> new CPF(nineDigitsWithDotsCPF));
	}
}