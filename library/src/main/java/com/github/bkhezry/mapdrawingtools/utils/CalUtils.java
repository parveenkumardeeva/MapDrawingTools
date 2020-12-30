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

    public static double getCircleArea(List<LatLng> latLngs) {
        LatLng centerLatLng = latLngs.get(0);
        LatLng perimeterLatLng = latLngs.get(1);
        double radius = SphericalUtil.computeDistanceBetween(centerLatLng, perimeterLatLng);
        return radius * radius * Math.PI;
    }

}
