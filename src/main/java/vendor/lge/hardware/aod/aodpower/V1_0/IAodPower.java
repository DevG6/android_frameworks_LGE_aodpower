package vendor.lge.hardware.aod.aodpower.V1_0;

import android.hidl.base.V1_0.DebugInfo;
import android.hidl.base.V1_0.IBase;
import android.os.HwBinder;
import android.os.HwBlob;
import android.os.HwParcel;
import android.os.IHwBinder;
import android.os.IHwBinder.DeathRecipient;
import android.os.IHwInterface;
import android.os.RemoteException;
import android.os.SystemProperties;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public interface IAodPower extends IBase {
    public static final String kInterfaceName = "vendor.lge.hardware.aod.aodpower@1.0::IAodPower";

    public static final class Proxy implements IAodPower {
        private IHwBinder mRemote;

        public Proxy(IHwBinder remote) {
            this.mRemote = (IHwBinder) Objects.requireNonNull(remote);
        }

        public IHwBinder asBinder() {
            return this.mRemote;
        }

        public String toString() {
            try {
                return interfaceDescriptor() + "@Proxy";
            } catch (RemoteException e) {
                return "[class or subclass of vendor.lge.hardware.aod.aodpower@1.0::IAodPower]@Proxy";
            }
        }

        public void getAodState(getAodStateCallback _hidl_cb) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodPower.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(1, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                _hidl_cb.onValues(_hidl_reply.readInt32(), _hidl_reply.readBool());
            } finally {
                _hidl_reply.release();
            }
        }

        public int setAodState(boolean enable) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodPower.kInterfaceName);
            _hidl_request.writeBool(enable);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(2, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_err = _hidl_reply.readInt32();
                return _hidl_out_err;
            } finally {
                _hidl_reply.release();
            }
        }

        public void getKeepAod(getKeepAodCallback _hidl_cb) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodPower.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(3, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                _hidl_cb.onValues(_hidl_reply.readInt32(), _hidl_reply.readInt32());
            } finally {
                _hidl_reply.release();
            }
        }

        public int setKeepAod(int state) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodPower.kInterfaceName);
            _hidl_request.writeInt32(state);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(4, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_err = _hidl_reply.readInt32();
                return _hidl_out_err;
            } finally {
                _hidl_reply.release();
            }
        }

        public void getAodArea(getAodAreaCallback _hidl_cb) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodPower.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(5, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_err = _hidl_reply.readInt32();
                AodArea _hidl_out_position = new AodArea();
                _hidl_out_position.readFromParcel(_hidl_reply);
                _hidl_cb.onValues(_hidl_out_err, _hidl_out_position);
            } finally {
                _hidl_reply.release();
            }
        }

        public int setAodArea(AodArea position) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodPower.kInterfaceName);
            position.writeToParcel(_hidl_request);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(6, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_err = _hidl_reply.readInt32();
                return _hidl_out_err;
            } finally {
                _hidl_reply.release();
            }
        }

        public void getFbExtOff(getFbExtOffCallback _hidl_cb) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodPower.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(7, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                _hidl_cb.onValues(_hidl_reply.readInt32(), _hidl_reply.readBool());
            } finally {
                _hidl_reply.release();
            }
        }

        public int setFbExtOff(boolean enable) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodPower.kInterfaceName);
            _hidl_request.writeBool(enable);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(8, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_err = _hidl_reply.readInt32();
                return _hidl_out_err;
            } finally {
                _hidl_reply.release();
            }
        }

        public void getFbToggleU1(getFbToggleU1Callback _hidl_cb) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodPower.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(9, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                _hidl_cb.onValues(_hidl_reply.readInt32(), _hidl_reply.readBool());
            } finally {
                _hidl_reply.release();
            }
        }

        public int setFbToggleU1(boolean enable) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodPower.kInterfaceName);
            _hidl_request.writeBool(enable);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(10, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_err = _hidl_reply.readInt32();
                return _hidl_out_err;
            } finally {
                _hidl_reply.release();
            }
        }

        public void getCurPanelMode(getCurPanelModeCallback _hidl_cb) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodPower.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(11, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                _hidl_cb.onValues(_hidl_reply.readInt32(), _hidl_reply.readInt32());
            } finally {
                _hidl_reply.release();
            }
        }

        public void getModeSwitch(getModeSwitchCallback _hidl_cb) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodPower.kInterfaceName);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(12, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                _hidl_cb.onValues(_hidl_reply.readInt32(), _hidl_reply.readBool());
            } finally {
                _hidl_reply.release();
            }
        }

        public int setModeSwitch(boolean state) throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken(IAodPower.kInterfaceName);
            _hidl_request.writeBool(state);
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(13, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                int _hidl_out_err = _hidl_reply.readInt32();
                return _hidl_out_err;
            } finally {
                _hidl_reply.release();
            }
        }

        public ArrayList<String> interfaceChain() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken("android.hidl.base@1.0::IBase");
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256067662, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                ArrayList<String> _hidl_out_descriptors = _hidl_reply.readStringVector();
                return _hidl_out_descriptors;
            } finally {
                _hidl_reply.release();
            }
        }

        public String interfaceDescriptor() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken("android.hidl.base@1.0::IBase");
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256136003, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                String _hidl_out_descriptor = _hidl_reply.readString();
                return _hidl_out_descriptor;
            } finally {
                _hidl_reply.release();
            }
        }

        public ArrayList<byte[]> getHashChain() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken("android.hidl.base@1.0::IBase");
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256398152, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                ArrayList<byte[]> _hidl_out_hashchain = new ArrayList();
                HwBlob _hidl_blob = _hidl_reply.readBuffer(16);
                int _hidl_vec_size = _hidl_blob.getInt32(8);
                HwBlob childBlob = _hidl_reply.readEmbeddedBuffer((long) (_hidl_vec_size * 32), _hidl_blob.handle(), 0, true);
                _hidl_out_hashchain.clear();
                for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
                    Object _hidl_vec_element = new byte[32];
                    long _hidl_array_offset_1 = (long) (_hidl_index_0 * 32);
                    for (int _hidl_index_1_0 = 0; _hidl_index_1_0 < 32; _hidl_index_1_0++) {
                        _hidl_vec_element[_hidl_index_1_0] = childBlob.getInt8(_hidl_array_offset_1);
                        _hidl_array_offset_1++;
                    }
                    _hidl_out_hashchain.add(_hidl_vec_element);
                }
                return _hidl_out_hashchain;
            } finally {
                _hidl_reply.release();
            }
        }

        public void setHALInstrumentation() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken("android.hidl.base@1.0::IBase");
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256462420, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public boolean linkToDeath(DeathRecipient recipient, long cookie) throws RemoteException {
            return this.mRemote.linkToDeath(recipient, cookie);
        }

        public void ping() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken("android.hidl.base@1.0::IBase");
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(256921159, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public DebugInfo getDebugInfo() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken("android.hidl.base@1.0::IBase");
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(257049926, _hidl_request, _hidl_reply, 0);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
                DebugInfo _hidl_out_info = new DebugInfo();
                _hidl_out_info.readFromParcel(_hidl_reply);
                return _hidl_out_info;
            } finally {
                _hidl_reply.release();
            }
        }

        public void notifySyspropsChanged() throws RemoteException {
            HwParcel _hidl_request = new HwParcel();
            _hidl_request.writeInterfaceToken("android.hidl.base@1.0::IBase");
            HwParcel _hidl_reply = new HwParcel();
            try {
                this.mRemote.transact(257120595, _hidl_request, _hidl_reply, 1);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        public boolean unlinkToDeath(DeathRecipient recipient) throws RemoteException {
            return this.mRemote.unlinkToDeath(recipient);
        }
    }

    public interface getAodStateCallback {
        void onValues(int i, boolean z);
    }

    public interface getKeepAodCallback {
        void onValues(int i, int i2);
    }

    public interface getAodAreaCallback {
        void onValues(int i, AodArea aodArea);
    }

    public interface getFbExtOffCallback {
        void onValues(int i, boolean z);
    }

    public interface getFbToggleU1Callback {
        void onValues(int i, boolean z);
    }

    public interface getCurPanelModeCallback {
        void onValues(int i, int i2);
    }

    public interface getModeSwitchCallback {
        void onValues(int i, boolean z);
    }

    public static abstract class Stub extends HwBinder implements IAodPower {
        public IHwBinder asBinder() {
            return this;
        }

        public final ArrayList<String> interfaceChain() {
            return new ArrayList(Arrays.asList(new String[]{IAodPower.kInterfaceName, "android.hidl.base@1.0::IBase"}));
        }

        public final String interfaceDescriptor() {
            return IAodPower.kInterfaceName;
        }

        public final ArrayList<byte[]> getHashChain() {
            return new ArrayList(Arrays.asList(new byte[][]{new byte[]{(byte) 56, (byte) 88, (byte) -97, (byte) -54, (byte) 123, (byte) -43, (byte) 123, (byte) -77, (byte) -108, (byte) 68, (byte) -118, (byte) 75, (byte) 95, (byte) 98, (byte) 37, (byte) -31, (byte) -53, (byte) -49, (byte) -40, (byte) 61, (byte) -110, (byte) 36, (byte) 27, (byte) 84, (byte) -70, (byte) -3, (byte) 106, (byte) 2, (byte) -73, (byte) 124, (byte) 99, (byte) 102}, new byte[]{(byte) -67, (byte) -38, (byte) -74, (byte) 24, (byte) 77, (byte) 122, (byte) 52, (byte) 109, (byte) -90, (byte) -96, (byte) 125, (byte) -64, (byte) -126, (byte) -116, (byte) -15, (byte) -102, (byte) 105, (byte) 111, (byte) 76, (byte) -86, (byte) 54, (byte) 17, (byte) -59, (byte) 31, (byte) 46, (byte) 20, (byte) 86, (byte) 90, (byte) 20, (byte) -76, (byte) 15, (byte) -39}}));
        }

        public final void setHALInstrumentation() {
        }

        public final boolean linkToDeath(DeathRecipient recipient, long cookie) {
            return true;
        }

        public final void ping() {
        }

        public final DebugInfo getDebugInfo() {
            DebugInfo info = new DebugInfo();
            info.pid = -1;
            info.ptr = 0;
            info.arch = 0;
            return info;
        }

        public final void notifySyspropsChanged() {
            SystemProperties.reportSyspropChanged();
        }

        public final boolean unlinkToDeath(DeathRecipient recipient) {
            return true;
        }

        public IHwInterface queryLocalInterface(String descriptor) {
            if (IAodPower.kInterfaceName.equals(descriptor)) {
                return this;
            }
            return null;
        }

        public void registerAsService(String serviceName) throws RemoteException {
            registerService(serviceName);
        }

        public String toString() {
            return interfaceDescriptor() + "@Stub";
        }

        public void onTransact(int _hidl_code, HwParcel _hidl_request, HwParcel _hidl_reply, int _hidl_flags) throws RemoteException {
            final HwParcel hwParcel;
            int _hidl_out_err;
            switch (_hidl_code) {
                case 1:
                    _hidl_request.enforceInterface(IAodPower.kInterfaceName);
                    hwParcel = _hidl_reply;
                    getAodState(new getAodStateCallback() {
                        public void onValues(int err, boolean enable) {
                            hwParcel.writeStatus(0);
                            hwParcel.writeInt32(err);
                            hwParcel.writeBool(enable);
                            hwParcel.send();
                        }
                    });
                    return;
                case 2:
                    _hidl_request.enforceInterface(IAodPower.kInterfaceName);
                    _hidl_out_err = setAodState(_hidl_request.readBool());
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_err);
                    _hidl_reply.send();
                    return;
                case 3:
                    _hidl_request.enforceInterface(IAodPower.kInterfaceName);
                    hwParcel = _hidl_reply;
                    getKeepAod(new getKeepAodCallback() {
                        public void onValues(int err, int state) {
                            hwParcel.writeStatus(0);
                            hwParcel.writeInt32(err);
                            hwParcel.writeInt32(state);
                            hwParcel.send();
                        }
                    });
                    return;
                case AodCurPanelMode.AOD_PANEL_MODE_U2_UNBLANK /*4*/:
                    _hidl_request.enforceInterface(IAodPower.kInterfaceName);
                    _hidl_out_err = setKeepAod(_hidl_request.readInt32());
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_err);
                    _hidl_reply.send();
                    return;
                case 5:
                    _hidl_request.enforceInterface(IAodPower.kInterfaceName);
                    hwParcel = _hidl_reply;
                    getAodArea(new getAodAreaCallback() {
                        public void onValues(int err, AodArea position) {
                            hwParcel.writeStatus(0);
                            hwParcel.writeInt32(err);
                            position.writeToParcel(hwParcel);
                            hwParcel.send();
                        }
                    });
                    return;
                case 6:
                    _hidl_request.enforceInterface(IAodPower.kInterfaceName);
                    AodArea position = new AodArea();
                    position.readFromParcel(_hidl_request);
                    _hidl_out_err = setAodArea(position);
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_err);
                    _hidl_reply.send();
                    return;
                case 7:
                    _hidl_request.enforceInterface(IAodPower.kInterfaceName);
                    hwParcel = _hidl_reply;
                    getFbExtOff(new getFbExtOffCallback() {
                        public void onValues(int err, boolean state) {
                            hwParcel.writeStatus(0);
                            hwParcel.writeInt32(err);
                            hwParcel.writeBool(state);
                            hwParcel.send();
                        }
                    });
                    return;
                case 8:
                    _hidl_request.enforceInterface(IAodPower.kInterfaceName);
                    _hidl_out_err = setFbExtOff(_hidl_request.readBool());
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_err);
                    _hidl_reply.send();
                    return;
                case 9:
                    _hidl_request.enforceInterface(IAodPower.kInterfaceName);
                    hwParcel = _hidl_reply;
                    getFbToggleU1(new getFbToggleU1Callback() {
                        public void onValues(int err, boolean state) {
                            hwParcel.writeStatus(0);
                            hwParcel.writeInt32(err);
                            hwParcel.writeBool(state);
                            hwParcel.send();
                        }
                    });
                    return;
                case 10:
                    _hidl_request.enforceInterface(IAodPower.kInterfaceName);
                    _hidl_out_err = setFbToggleU1(_hidl_request.readBool());
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_err);
                    _hidl_reply.send();
                    return;
                case 11:
                    _hidl_request.enforceInterface(IAodPower.kInterfaceName);
                    hwParcel = _hidl_reply;
                    getCurPanelMode(new getCurPanelModeCallback() {
                        public void onValues(int err, int mode) {
                            hwParcel.writeStatus(0);
                            hwParcel.writeInt32(err);
                            hwParcel.writeInt32(mode);
                            hwParcel.send();
                        }
                    });
                    return;
                case 12:
                    _hidl_request.enforceInterface(IAodPower.kInterfaceName);
                    hwParcel = _hidl_reply;
                    getModeSwitch(new getModeSwitchCallback() {
                        public void onValues(int err, boolean state) {
                            hwParcel.writeStatus(0);
                            hwParcel.writeInt32(err);
                            hwParcel.writeBool(state);
                            hwParcel.send();
                        }
                    });
                    return;
                case 13:
                    _hidl_request.enforceInterface(IAodPower.kInterfaceName);
                    _hidl_out_err = setModeSwitch(_hidl_request.readBool());
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeInt32(_hidl_out_err);
                    _hidl_reply.send();
                    return;
                case 256067662:
                    _hidl_request.enforceInterface("android.hidl.base@1.0::IBase");
                    ArrayList<String> _hidl_out_descriptors = interfaceChain();
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeStringVector(_hidl_out_descriptors);
                    _hidl_reply.send();
                    return;
                case 256131655:
                    _hidl_request.enforceInterface("android.hidl.base@1.0::IBase");
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.send();
                    return;
                case 256136003:
                    _hidl_request.enforceInterface("android.hidl.base@1.0::IBase");
                    String _hidl_out_descriptor = interfaceDescriptor();
                    _hidl_reply.writeStatus(0);
                    _hidl_reply.writeString(_hidl_out_descriptor);
                    _hidl_reply.send();
                    return;
                case 256398152:
                    _hidl_request.enforceInterface("android.hidl.base@1.0::IBase");
                    ArrayList<byte[]> _hidl_out_hashchain = getHashChain();
                    _hidl_reply.writeStatus(0);
                    HwBlob _hidl_blob = new HwBlob(16);
                    int _hidl_vec_size = _hidl_out_hashchain.size();
                    _hidl_blob.putInt32(8, _hidl_vec_size);
                    _hidl_blob.putBool(12, false);
                    HwBlob childBlob = new HwBlob(_hidl_vec_size * 32);
                    for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
                        long _hidl_array_offset_1 = (long) (_hidl_index_0 * 32);
                        for (int _hidl_index_1_0 = 0; _hidl_index_1_0 < 32; _hidl_index_1_0++) {
                            childBlob.putInt8(_hidl_array_offset_1, ((byte[]) _hidl_out_hashchain.get(_hidl_index_0))[_hidl_index_1_0]);
                            _hidl_array_offset_1++;
                        }
                    }
                    _hidl_blob.putBlob(0, childBlob);
                    _hidl_reply.writeBuffer(_hidl_blob);
                    _hidl_reply.send();
                    return;
                case 256462420:
                    _hidl_request.enforceInterface("android.hidl.base@1.0::IBase");
                    setHALInstrumentation();
                    return;
                case 257049926:
                    _hidl_request.enforceInterface("android.hidl.base@1.0::IBase");
                    DebugInfo _hidl_out_info = getDebugInfo();
                    _hidl_reply.writeStatus(0);
                    _hidl_out_info.writeToParcel(_hidl_reply);
                    _hidl_reply.send();
                    return;
                case 257120595:
                    _hidl_request.enforceInterface("android.hidl.base@1.0::IBase");
                    notifySyspropsChanged();
                    return;
                default:
                    return;
            }
        }
    }

    IHwBinder asBinder();

    void getAodArea(getAodAreaCallback getaodareacallback) throws RemoteException;

    void getAodState(getAodStateCallback getaodstatecallback) throws RemoteException;

    void getCurPanelMode(getCurPanelModeCallback getcurpanelmodecallback) throws RemoteException;

    DebugInfo getDebugInfo() throws RemoteException;

    void getFbExtOff(getFbExtOffCallback getfbextoffcallback) throws RemoteException;

    void getFbToggleU1(getFbToggleU1Callback getfbtoggleu1callback) throws RemoteException;

    ArrayList<byte[]> getHashChain() throws RemoteException;

    void getKeepAod(getKeepAodCallback getkeepaodcallback) throws RemoteException;

    void getModeSwitch(getModeSwitchCallback getmodeswitchcallback) throws RemoteException;

    ArrayList<String> interfaceChain() throws RemoteException;

    String interfaceDescriptor() throws RemoteException;

    boolean linkToDeath(DeathRecipient deathRecipient, long j) throws RemoteException;

    void notifySyspropsChanged() throws RemoteException;

    void ping() throws RemoteException;

    int setAodArea(AodArea aodArea) throws RemoteException;

    int setAodState(boolean z) throws RemoteException;

    int setFbExtOff(boolean z) throws RemoteException;

    int setFbToggleU1(boolean z) throws RemoteException;

    void setHALInstrumentation() throws RemoteException;

    int setKeepAod(int i) throws RemoteException;

    int setModeSwitch(boolean z) throws RemoteException;

    boolean unlinkToDeath(DeathRecipient deathRecipient) throws RemoteException;

    static IAodPower asInterface(IHwBinder binder) {
        if (binder == null) {
            return null;
        }
        IHwInterface iface = binder.queryLocalInterface(kInterfaceName);
        if (iface != null && (iface instanceof IAodPower)) {
            return (IAodPower) iface;
        }
        IAodPower proxy = new Proxy(binder);
        try {
            for (String descriptor : proxy.interfaceChain()) {
                if (descriptor.equals(kInterfaceName)) {
                    return proxy;
                }
            }
        } catch (RemoteException e) {
        }
        return null;
    }

    static IAodPower castFrom(IHwInterface iface) {
        return iface == null ? null : asInterface(iface.asBinder());
    }

    static IAodPower getService(String serviceName) throws RemoteException {
        return asInterface(HwBinder.getService(kInterfaceName, serviceName));
    }

    static IAodPower getService() throws RemoteException {
        return asInterface(HwBinder.getService(kInterfaceName, "default"));
    }
}
