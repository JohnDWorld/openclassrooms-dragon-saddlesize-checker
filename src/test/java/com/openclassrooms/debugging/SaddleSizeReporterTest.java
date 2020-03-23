package com.openclassrooms.debugging;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Given that a dragon's saddle size has been estimated")
class SaddleSizeReporterTest {
    SaddleSizeReporter classUnderTest = new SaddleSizeReporter();

    @DisplayName("When reported on it, then it should clearly communicate the size")
    @Test
    void report() {
        // Arrange
        int targetYear = 2019;
        double saddleSize = 20.18;

        // Act
        String actualReport = classUnderTest.report(targetYear, saddleSize);

        // Assert
        assertThat( actualReport,
                startsWith("En l'an 2019, les dragons nes en l'an 1 " +
                        "auront une taille de selle de 20.18 metres"));
    }
}