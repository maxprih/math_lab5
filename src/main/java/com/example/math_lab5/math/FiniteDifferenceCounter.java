package com.example.math_lab5.math;

import com.example.math_lab5.dto.Point;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class FiniteDifferenceCounter {
    public double[][] count(List<Point> points) {
        int n = points.size();
        double[][] arr = new double[n+1][n];

        for (int i = 0; i < n; i++) {
            arr[0][i] = points.get(i).getX();
            arr[1][i] = points.get(i).getY();
        }

        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < n + 1 - i; j++) {
                arr[i][j] = arr[i - 1][j + 1] - arr[i - 1][j];
            }
        }

        return arr;
    }
}
