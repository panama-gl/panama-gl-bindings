// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1256 {

    static final FunctionDescriptor OleConvertIStorageToOLESTREAMEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleConvertIStorageToOLESTREAMEx$MH = RuntimeHelper.downcallHandle(
        "OleConvertIStorageToOLESTREAMEx",
        constants$1256.OleConvertIStorageToOLESTREAMEx$FUNC
    );
    static final FunctionDescriptor OleConvertOLESTREAMToIStorageEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleConvertOLESTREAMToIStorageEx$MH = RuntimeHelper.downcallHandle(
        "OleConvertOLESTREAMToIStorageEx",
        constants$1256.OleConvertOLESTREAMToIStorageEx$FUNC
    );
    static final  GroupLayout IID_IPrintDialogCallback$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IPrintDialogCallback$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IPrintDialogCallback", constants$1256.IID_IPrintDialogCallback$LAYOUT);
    static final  GroupLayout IID_IPrintDialogServices$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IPrintDialogServices$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IPrintDialogServices", constants$1256.IID_IPrintDialogServices$LAYOUT);
    static final FunctionDescriptor LPOFNHOOKPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPOFNHOOKPROC$MH = RuntimeHelper.downcallHandle(
        constants$1256.LPOFNHOOKPROC$FUNC
    );
}


