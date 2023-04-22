package cleanArchScholl.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void testNotNullString() {
		// Arrange
		String nullString = null;

		// Act
		boolean response = StringUtils.isStringValid(nullString);

		// Assert
		assertFalse(response);
	}

	@Test
	void testNotEmptyString() {
		// Arrange
		String emptyString = "";

		// Act
		boolean response = StringUtils.isStringValid(emptyString);

		// Assert
		assertFalse(response);
	}

	@Test
	void testSpaceString() {
		// Arrange
		String spaceString = " ";

		// Act
		boolean response = StringUtils.isStringValid(spaceString);

		// Assert
		assertFalse(response);
	}

	@Test
	void testDoubleSpaceString() {
		// Arrange
		String doubleSpaceString = "  ";

		// Act
		boolean response = StringUtils.isStringValid(doubleSpaceString);

		// Assert
		assertFalse(response);
	}

	@Test
	void testDotString() {
		// Arrange
		String dotString = ".";

		// Act
		boolean response = StringUtils.isStringValid(dotString);

		// Assert
		assertTrue(response);
	}

}