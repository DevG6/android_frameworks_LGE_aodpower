package vendor.lge.hardware.aod.aodpower.V1_0;

import java.util.ArrayList;

public final class AodCurPanelMode {
    public static final int AOD_PANEL_MODE_ERROR = -1;
    public static final int AOD_PANEL_MODE_U0_BLANK = 0;
    public static final int AOD_PANEL_MODE_U1_UNBLANK = 1;
    public static final int AOD_PANEL_MODE_U2_BLANK = 2;
    public static final int AOD_PANEL_MODE_U2_UNBLANK = 4;
    public static final int AOD_PANEL_MODE_U3_UNBLANK = 3;

    public static final String toString(int o) {
        if (o == -1) {
            return "AOD_PANEL_MODE_ERROR";
        }
        if (o == 0) {
            return "AOD_PANEL_MODE_U0_BLANK";
        }
        if (o == 1) {
            return "AOD_PANEL_MODE_U1_UNBLANK";
        }
        if (o == 2) {
            return "AOD_PANEL_MODE_U2_BLANK";
        }
        if (o == 3) {
            return "AOD_PANEL_MODE_U3_UNBLANK";
        }
        if (o == 4) {
            return "AOD_PANEL_MODE_U2_UNBLANK";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        ArrayList<String> list = new ArrayList();
        int flipped = 0;
        if ((o & -1) == -1) {
            list.add("AOD_PANEL_MODE_ERROR");
            flipped = -1;
        }
        if ((o & 0) == 0) {
            list.add("AOD_PANEL_MODE_U0_BLANK");
            flipped |= 0;
        }
        if ((o & 1) == 1) {
            list.add("AOD_PANEL_MODE_U1_UNBLANK");
            flipped |= 1;
        }
        if ((o & 2) == 2) {
            list.add("AOD_PANEL_MODE_U2_BLANK");
            flipped |= 2;
        }
        if ((o & 3) == 3) {
            list.add("AOD_PANEL_MODE_U3_UNBLANK");
            flipped |= 3;
        }
        if ((o & 4) == 4) {
            list.add("AOD_PANEL_MODE_U2_UNBLANK");
            flipped |= 4;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString((~flipped) & o));
        }
        return String.join(" | ", list);
    }
}
