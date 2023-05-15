package com.example.math_lab5.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Answer {
    private double[] newton;
    private double[] cLang;
    private double[][] finiteDifference;
    private int n;
}
