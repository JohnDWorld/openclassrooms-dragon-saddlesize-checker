package com.openclassrooms.debugging;

import com.openclassrooms.debugging.service.SaddleSizeReporter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Given that a dragon's saddle size has been estimated")
class SaddleSizeReporterTest {
    private SaddleSizeReporter classUnderTest = new SaddleSizeReporter();

    @DisplayName("When reported on it, then it should clearly communicate the size")
    @Test
    void report() {
        // Arrange
        int targetYear = 2019;
        int saddleSize = 2018;
        // Act
        String response = classUnderTest.report(targetYear, saddleSize);

        // Assert
        assertThat( response,
                startsWith("En l'an 2019, les dragons nés en l'an 1 " +
                        "auront une taille de selle de 20.18 metres(2018.0 centimetres)"));
    }
}