// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$115 {

    static final FunctionDescriptor RtlGetProductInfo$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlGetProductInfo$MH = RuntimeHelper.downcallHandle(
        "RtlGetProductInfo",
        constants$115.RtlGetProductInfo$FUNC
    );
    static final FunctionDescriptor RTL_UMS_SCHEDULER_ENTRY_POINT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RTL_UMS_SCHEDULER_ENTRY_POINT$MH = RuntimeHelper.downcallHandle(
        constants$115.RTL_UMS_SCHEDULER_ENTRY_POINT$FUNC
    );
    static final FunctionDescriptor PRTL_UMS_SCHEDULER_ENTRY_POINT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PRTL_UMS_SCHEDULER_ENTRY_POINT$MH = RuntimeHelper.downcallHandle(
        constants$115.PRTL_UMS_SCHEDULER_ENTRY_POINT$FUNC
    );
    static final FunctionDescriptor RtlCrc32$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RtlCrc32$MH = RuntimeHelper.downcallHandle(
        "RtlCrc32",
        constants$115.RtlCrc32$FUNC
    );
}


