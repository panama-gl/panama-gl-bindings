// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$872 {

    static final FunctionDescriptor DeviceDsmDataSetRanges$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeviceDsmDataSetRanges$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmDataSetRanges",
        constants$872.DeviceDsmDataSetRanges$FUNC
    );
    static final FunctionDescriptor DeviceDsmNumberOfDataSetRanges$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeviceDsmNumberOfDataSetRanges$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmNumberOfDataSetRanges",
        constants$872.DeviceDsmNumberOfDataSetRanges$FUNC
    );
    static final FunctionDescriptor DeviceDsmGetInputLength$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmGetInputLength$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmGetInputLength",
        constants$872.DeviceDsmGetInputLength$FUNC
    );
    static final FunctionDescriptor DeviceDsmGetNumberOfDataSetRanges$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmGetNumberOfDataSetRanges$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmGetNumberOfDataSetRanges",
        constants$872.DeviceDsmGetNumberOfDataSetRanges$FUNC
    );
    static final FunctionDescriptor DeviceDsmInitializeInput$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmInitializeInput$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmInitializeInput",
        constants$872.DeviceDsmInitializeInput$FUNC
    );
    static final FunctionDescriptor DeviceDsmAddDataSetRange$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmAddDataSetRange$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmAddDataSetRange",
        constants$872.DeviceDsmAddDataSetRange$FUNC
    );
}


