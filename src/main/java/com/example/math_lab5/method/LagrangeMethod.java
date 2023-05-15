package com.example.math_lab5.method;

import com.example.math_lab5.dto.Point;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class LagrangeMethod {
    public double[] solve(List<Point> points) {
        int n = points.size();
        double[] l = new double[n];


        for (int i = 0; i < n; i++) {
            double c = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    c *= points.get(i).getX() - points.get(j).getX();
                }
            }
            l[i] = points.get(i).getY() /
                    c;
        }

        return l;
    }
}
