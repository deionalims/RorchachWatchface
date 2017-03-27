package com.nalims.rorchachwatchface.Digits;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by FX on 25/09/15.
 */
public class Zero extends Digit {

    public Zero(Context context) {
        super(context);
    }

    @Override
    public float[] getLeftMinute(float centerX, float centerY, float strokeWidth) {
        List<Float> points = new ArrayList<>();

        points.add(centerX / 2 - strokeWidth / 2 - space);
        points.add(centerY + (strokeWidth / 2) + space);
        points.add(strokeWidth / 2 + space);
        points.add(centerY + (strokeWidth / 2) + space);

        points.add(strokeWidth / 2 + space);
        points.add(centerY + (strokeWidth / 2) + space);
        points.add(strokeWidth / 2 + space);
        points.add(centerY + (centerY / 2) + (strokeWidth / 2) - 2 * space);

        points.add(strokeWidth / 2 + space);
        points.add(centerY + (centerY / 2) + (strokeWidth / 2) - 2 * space);
        points.add(centerX / 2 - strokeWidth / 2 - space);
        points.add(centerY + (centerY / 2) + (strokeWidth / 2) - space);

        points.add(centerX / 2 - strokeWidth / 2 - space);
        points.add(centerY + (centerY / 2) + (strokeWidth / 2) - space);
        points.add(centerX / 2 - strokeWidth / 2 - space);
        points.add(centerY + (strokeWidth / 2) + space);

        points.addAll(getMinutesMirrorPoints(points, centerX));

        return convertFromList(points);
    }

    @Override
    public float[] getRightMinute(float centerX, float centerY, float strokeWidth) {
        List<Float> points = new ArrayList<>();

        points.add(centerX - strokeWidth / 2 - space);
        points.add(centerY + (strokeWidth / 2) + space);
        points.add(centerX / 2 + strokeWidth / 2 + space);
        points.add(centerY + (strokeWidth / 2) + space);

        points.add(centerX / 2 + strokeWidth / 2 + space);
        points.add(centerY + (strokeWidth / 2) + space);
        points.add(centerX / 2 + strokeWidth / 2 + space);
        points.add(centerY + (centerY / 2) + (strokeWidth / 2));

        points.add(centerX / 2 + strokeWidth / 2 + space);
        points.add(centerY + (centerY / 2) + (strokeWidth / 2));
        points.add(centerX - strokeWidth / 2 - space);
        points.add(centerY + (centerY / 2) + (strokeWidth / 2) + space);

        points.add(centerX - strokeWidth / 2 - space);
        points.add(centerY + (centerY / 2) + (strokeWidth / 2) + space);
        points.add(centerX - strokeWidth / 2 - space);
        points.add(centerY + (strokeWidth / 2) + space);

        points.addAll(getMinutesMirrorPoints(points, centerX));

        return convertFromList(points);
    }

    @Override
    public float[] getLeftHour(float centerX, float centerY, float strokeWidth) {
        List<Float> points = new ArrayList<>();

        float centerUpY = centerY - (centerY / 2);
        float lineX2 = centerX + (centerX / 2) - (strokeWidth / 2) - space;

        points.add(centerX + strokeWidth / 2 + space);
        points.add(centerUpY - (strokeWidth / 2) - space);
        points.add(lineX2);
        points.add(centerUpY - (strokeWidth / 2));

        points.add(lineX2);
        points.add(centerUpY - (strokeWidth / 2));
        points.add(lineX2);
        points.add(centerY - (strokeWidth / 2) - space);

        points.add(lineX2);
        points.add(centerY - (strokeWidth / 2) - space);
        points.add(centerX + strokeWidth / 2 + space);
        points.add(centerY - (strokeWidth / 2) - space);

        points.add(centerX + strokeWidth / 2 + space);
        points.add(centerY - (strokeWidth / 2) - space);
        points.add(centerX + strokeWidth / 2 + space);
        points.add(centerUpY - (strokeWidth / 2) -   space);

        points.addAll(getHoursMirrorPoints(points, centerX));

        return convertFromList(points);
    }

    @Override
    public float[] getRightHour(float centerX, float centerY, float strokeWidth) {
        List<Float> points = new ArrayList<>();

        float centerUpY = centerY - (centerY / 2);
        float lineX4 = (2 * centerX) - space - strokeWidth / 2;
        float rightCenterX = centerX + (centerX / 2);

        points.add(rightCenterX + strokeWidth / 2 + space);
        points.add(centerUpY - (strokeWidth / 2) + space);
        points.add(lineX4);
        points.add(centerUpY - (strokeWidth / 2) +  2 * space);


        points.add(lineX4);
        points.add(centerUpY - (strokeWidth / 2) +  2 * space);
        points.add(lineX4);
        points.add(centerY - (strokeWidth / 2) - space);


        points.add(lineX4);
        points.add(centerY - (strokeWidth / 2) - space);
        points.add(rightCenterX + strokeWidth / 2 + space);
        points.add(centerY - (strokeWidth / 2) - space);


        points.add(rightCenterX + strokeWidth / 2 + space);
        points.add(centerY - (strokeWidth / 2) - space);
        points.add(rightCenterX + strokeWidth / 2 + space);
        points.add(centerUpY - (strokeWidth / 2) + space);

        points.addAll(getHoursMirrorPoints(points, centerX));

        return convertFromList(points);
    }
}
