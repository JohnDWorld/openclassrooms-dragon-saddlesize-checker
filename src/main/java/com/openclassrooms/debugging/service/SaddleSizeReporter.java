package com.openclassrooms.debugging.service;

import org.springframework.stereotype.Service;

@Service
public class SaddleSizeReporter {

    /**
     * Returns a stock response reporting the dragon's saddle size
     * @param targetYear The year for which an estimate was calculated
     * @param beltSize The estimate for the dragon's saddle size
     * @return answer to the question of "what is my dragon's saddle size?"
     */
    public String report(int targetYear, double beltSize) {
        double sizeInMeters = beltSize / 100;
        StringBuilder response = new StringBuilder("En l'an ");
        response.append(targetYear);
        response.append(", les dragons nés en l'an 1 auront une taille de selle de ");
        response.append(sizeInMeters);
        response.append(" metres");
        response.append("(");
        response.append(beltSize);
        response.append(" centimetres)");

        return response.toString();
    }
}