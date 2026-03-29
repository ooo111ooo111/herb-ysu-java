package org.herb.service;

public interface AiService {
    String herbQA(String herbName, String question);
    String prescriptionAnalysis(String prescriptionData);
    String diagnosis(String symptoms);
}
