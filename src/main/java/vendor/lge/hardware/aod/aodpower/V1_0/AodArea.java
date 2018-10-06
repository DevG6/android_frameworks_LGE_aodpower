package vendor.lge.hardware.aod.aodpower.V1_0;

import android.os.HidlSupport;
import android.os.HwBlob;
import android.os.HwParcel;
import java.util.ArrayList;
import java.util.Objects;

public final class AodArea {
    public boolean enable;
    public int height;
    public int startX;
    public int startY;
    public int width;

    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || otherObject.getClass() != AodArea.class) {
            return false;
        }
        AodArea other = (AodArea) otherObject;
        return this.enable == other.enable && this.startX == other.startX && this.startY == other.startY && this.width == other.width && this.height == other.height;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(HidlSupport.deepHashCode(Boolean.valueOf(this.enable))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.startX))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.startY))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.width))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.height)))});
    }

    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".enable = ");
        builder.append(this.enable);
        builder.append(", .startX = ");
        builder.append(this.startX);
        builder.append(", .startY = ");
        builder.append(this.startY);
        builder.append(", .width = ");
        builder.append(this.width);
        builder.append(", .height = ");
        builder.append(this.height);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(HwParcel parcel) {
        readEmbeddedFromParcel(parcel, parcel.readBuffer(20), 0);
    }

    public static final ArrayList<AodArea> readVectorFromParcel(HwParcel parcel) {
        ArrayList<AodArea> _hidl_vec = new ArrayList();
        HwBlob _hidl_blob = parcel.readBuffer(16);
        int _hidl_vec_size = _hidl_blob.getInt32(8);
        HwBlob childBlob = parcel.readEmbeddedBuffer((long) (_hidl_vec_size * 20), _hidl_blob.handle(), 0, true);
        _hidl_vec.clear();
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            AodArea _hidl_vec_element = new AodArea();
            _hidl_vec_element.readEmbeddedFromParcel(parcel, childBlob, (long) (_hidl_index_0 * 20));
            _hidl_vec.add(_hidl_vec_element);
        }
        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(HwParcel parcel, HwBlob _hidl_blob, long _hidl_offset) {
        this.enable = _hidl_blob.getBool(0 + _hidl_offset);
        this.startX = _hidl_blob.getInt32(4 + _hidl_offset);
        this.startY = _hidl_blob.getInt32(8 + _hidl_offset);
        this.width = _hidl_blob.getInt32(12 + _hidl_offset);
        this.height = _hidl_blob.getInt32(16 + _hidl_offset);
    }

    public final void writeToParcel(HwParcel parcel) {
        HwBlob _hidl_blob = new HwBlob(20);
        writeEmbeddedToBlob(_hidl_blob, 0);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(HwParcel parcel, ArrayList<AodArea> _hidl_vec) {
        HwBlob _hidl_blob = new HwBlob(16);
        int _hidl_vec_size = _hidl_vec.size();
        _hidl_blob.putInt32(8, _hidl_vec_size);
        _hidl_blob.putBool(12, false);
        HwBlob childBlob = new HwBlob(_hidl_vec_size * 20);
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            ((AodArea) _hidl_vec.get(_hidl_index_0)).writeEmbeddedToBlob(childBlob, (long) (_hidl_index_0 * 20));
        }
        _hidl_blob.putBlob(0, childBlob);
        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putBool(0 + _hidl_offset, this.enable);
        _hidl_blob.putInt32(4 + _hidl_offset, this.startX);
        _hidl_blob.putInt32(8 + _hidl_offset, this.startY);
        _hidl_blob.putInt32(12 + _hidl_offset, this.width);
        _hidl_blob.putInt32(16 + _hidl_offset, this.height);
    }
}
