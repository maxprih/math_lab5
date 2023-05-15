package com.example.math_lab5.method;

import com.example.math_lab5.dto.Point;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NewtonMethod {

    public double[] countCoef(List<Point> points) {
        return count(points);
    }

    private double[] count(List<Point> points) {
        int n = points.size();
        double[][] arr = new double[n][n];

        for (int i = 0; i < n; i++) {
            arr[i][0] = points.get(i).getY();
        }

        int k = 1;
        while (k <= n) {
            for (int i = 0; i < n - k; i++) {
                arr[i][k] = (arr[i + 1][k - 1] - arr[i][k - 1]) / (points.get(i + k).getX() - points.get(i).getX());
            }
            k++;
        }
        double[] brr = new double[n];
        for (int i = 0; i < n; i++) {
            brr[i] = arr[0][i];

        }

        return brr;
    }
}
