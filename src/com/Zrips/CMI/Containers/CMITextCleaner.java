package com.Zrips.CMI.Containers;

import org.bukkit.entity.Player;

public class CMITextCleaner {

    private static int cicles = 0;

    public static String cleanFromColorCodes(Object p, String msg, CMIColorTypes type, boolean clean) {
        return cleanFromColorCodes(p, msg, type, clean, false);
    }

    public static String cleanFromColorCodes(Object p, String msg, CMIColorTypes type, boolean clean, boolean forceClean) {

        return null;
    }

    private static boolean hasColorPermission(Player player, CMIColorTypes type, String color, boolean wildCard) {
        return true;
    }
}
