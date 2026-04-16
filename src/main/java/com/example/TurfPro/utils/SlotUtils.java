package com.example.TurfPro.utils;

import java.time.LocalTime;

public class SlotUtils {

    public static boolean isValidSlot(LocalTime start, LocalTime end){
        return start.isBefore(end);
    }

}