package com.github.bkhezry.mapdrawingtools.utils;


import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.SphericalUtil;

import java.util.List;

public class CalUtils {
    public static double getArea(List<LatLng> latLngs) {
        return SphericalUtil.computeArea(latLngs);
    }

    public static double getLength(List<LatLng> latLngs) {
        return SphericalUtil.computeLength(latLngs);
    }

    public static double getRadius(List<LatLng> latLngs) {
        LatLng centerLatLng = latLngs.get(0);
        LatLng perimeterLatLng = latLngs.get(1);
        return SphericalUtil.computeDistanceBetween(centerLatLng, perimeterLatLng);
    }

    public static double getRadius(LatLng[] latLngs) {
        LatLng centerLatLng = latLngs[0];
        LatLng perimeterLatLng = latLngs[1];
        return SphericalUtil.computeDistanceBetween(centerLatLng, perimeterLatLng);
    }

    public static double getCircleArea(double radius) {
        return radius * radius * Math.PI;
    }

}
