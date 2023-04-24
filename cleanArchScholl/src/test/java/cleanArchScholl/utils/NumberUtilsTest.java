package cleanArchScholl.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	@Test
	void testValidShort() {
		// Arrange
		String shortString = "81";
		
		// Act
		boolean result = NumberUtils.isAValidShort(shortString);
		
		// Assert
		assertTrue(result);
	}

	@Test
	void testInvalidShort() {
		// Arrange
		String shortString = "8i";
		
		// Act
		boolean result = NumberUtils.isAValidShort(shortString);
		
		// Assert
		assertFalse(result);
	}
	
	@Test
	void testTooLongInvalidShort() {
		// Arrange
		String shortString = "123456";
		
		// Act
		boolean result = NumberUtils.isAValidShort(shortString);
		
		// Assert
		assertFalse(result);
	}
	
	@Test
	void testValidInteger() {
		// Arrange
		String intString = "987654321";
		
		// Act
		boolean result = NumberUtils.isAValidInteger(intString);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void testInvalidInteger() {
		// Arrange
		String intString = "98765432i";
		
		// Act
		boolean result = NumberUtils.isAValidInteger(intString);
		
		// Assert
		assertFalse(result);
	}
	
	@Test
	void testTooLongInvaliInteger() {
		// Arrange
		String intString = "9876543210";
		
		// Act
		boolean result = NumberUtils.isAValidInteger(intString);
		
		// Assert
		assertFalse(result);
	}
	
}
