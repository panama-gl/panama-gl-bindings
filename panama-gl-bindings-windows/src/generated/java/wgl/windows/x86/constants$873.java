// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$873 {

    static final FunctionDescriptor DeviceDsmValidateInput$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmValidateInput$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmValidateInput",
        constants$873.DeviceDsmValidateInput$FUNC
    );
    static final FunctionDescriptor DeviceDsmOutputBlock$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeviceDsmOutputBlock$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmOutputBlock",
        constants$873.DeviceDsmOutputBlock$FUNC
    );
    static final FunctionDescriptor DeviceDsmGetOutputLength$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmGetOutputLength$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmGetOutputLength",
        constants$873.DeviceDsmGetOutputLength$FUNC
    );
    static final FunctionDescriptor DeviceDsmValidateOutputLength$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmValidateOutputLength$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmValidateOutputLength",
        constants$873.DeviceDsmValidateOutputLength$FUNC
    );
    static final FunctionDescriptor DeviceDsmGetOutputBlockLength$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmGetOutputBlockLength$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmGetOutputBlockLength",
        constants$873.DeviceDsmGetOutputBlockLength$FUNC
    );
    static final FunctionDescriptor DeviceDsmInitializeOutput$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmInitializeOutput$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmInitializeOutput",
        constants$873.DeviceDsmInitializeOutput$FUNC
    );
}

