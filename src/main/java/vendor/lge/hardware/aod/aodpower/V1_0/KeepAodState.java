package vendor.lge.hardware.aod.aodpower.V1_0;

import java.util.ArrayList;

public final class KeepAodState {
    public static final int AOD_ERROR = -1;
    public static final int AOD_KEEP_U2 = 1;
    public static final int AOD_MOVE_TO_U2 = 2;
    public static final int AOD_MOVE_TO_U3 = 0;
    public static final int AOD_NO_DECISION = 3;

    public static final String toString(int o) {
        if (o == -1) {
            return "AOD_ERROR";
        }
        if (o == 0) {
            return "AOD_MOVE_TO_U3";
        }
        if (o == 1) {
            return "AOD_KEEP_U2";
        }
        if (o == 2) {
            return "AOD_MOVE_TO_U2";
        }
        if (o == 3) {
            return "AOD_NO_DECISION";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        ArrayList<String> list = new ArrayList();
        int flipped = 0;
        if ((o & -1) == -1) {
            list.add("AOD_ERROR");
            flipped = -1;
        }
        if ((o & 0) == 0) {
            list.add("AOD_MOVE_TO_U3");
            flipped |= 0;
        }
        if ((o & 1) == 1) {
            list.add("AOD_KEEP_U2");
            flipped |= 1;
        }
        if ((o & 2) == 2) {
            list.add("AOD_MOVE_TO_U2");
            flipped |= 2;
        }
        if ((o & 3) == 3) {
            list.add("AOD_NO_DECISION");
            flipped |= 3;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString((~flipped) & o));
        }
        return String.join(" | ", list);
    }
}
