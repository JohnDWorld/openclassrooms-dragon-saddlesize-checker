package com.openclassrooms.debugging;

public class SaddleSizeReporter {

    /**
     * Produces a sentence reporting on the dragon saddle size
     * @param targetYear of estimate
     * @param beltSize estimated
     * @return sentence communicating the estimate
     */
    public String report(int targetYear, double beltSize) {
        return new StringBuilder("En l'an ").
            append(targetYear).
            append(", les dragons nes en l'an 1 auront une taille de selle de ").
            append(beltSize).append(" metres").toString();
    }
}