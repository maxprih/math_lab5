package com.example.math_lab5.service;

import com.example.math_lab5.dto.Answer;
import com.example.math_lab5.dto.Point;
import com.example.math_lab5.math.FiniteDifferenceCounter;
import com.example.math_lab5.method.LagrangeMethod;
import com.example.math_lab5.method.NewtonMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MathService {

    @Autowired
    private FiniteDifferenceCounter differenceCounter;

    @Autowired
    private NewtonMethod newtonMethod;

    @Autowired
    private LagrangeMethod lagrangeMethod;

    public Answer solve(List<Point> pointList) {
        Answer answer = new Answer();

        answer.setFiniteDifference(differenceCounter.count(pointList));
        answer.setN(pointList.size());

        answer.setNewton(newtonMethod.countCoef(pointList));
        answer.setCLang(lagrangeMethod.solve(pointList));

        return answer;
    }
}
