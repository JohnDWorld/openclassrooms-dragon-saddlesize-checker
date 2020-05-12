package com.openclassrooms.debugging;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Given that we have a DragonSaddleSizeEstimator")
public class DragonSaddleSizeEstimatorIntegrationTest {

    @DisplayName("When the year is 2019 Then the saddle size should be 20.18 meters")
    @Test
    public void estimateSaddleSizeInCentiMeters_shouldReturnTwentyPointEighteenMeters_whenCalculatingTheSizeIn2019() throws Exception {
        int targetYear = 2020;
        // ARRANGE
        DragonSaddleSizeEstimator estimator = DragonSaddleSizeEstimator.INSTANCE;

        // Act
        Double expectedSaddleSize = DragonSaddleSizeEstimator.INSTANCE.estimateSaddleSizeInCentiMeters(targetYear);

        // Assert
        assertThat(expectedSaddleSize, is(equalTo(2019.0)));
    }
}
