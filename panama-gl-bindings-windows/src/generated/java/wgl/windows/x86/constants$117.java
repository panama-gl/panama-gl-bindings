// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$117 {

    static final FunctionDescriptor RtlWriteNonVolatileMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RtlWriteNonVolatileMemory$MH = RuntimeHelper.downcallHandle(
        "RtlWriteNonVolatileMemory",
        constants$117.RtlWriteNonVolatileMemory$FUNC
    );
    static final FunctionDescriptor RtlFillNonVolatileMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RtlFillNonVolatileMemory$MH = RuntimeHelper.downcallHandle(
        "RtlFillNonVolatileMemory",
        constants$117.RtlFillNonVolatileMemory$FUNC
    );
    static final FunctionDescriptor RtlFlushNonVolatileMemoryRanges$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RtlFlushNonVolatileMemoryRanges$MH = RuntimeHelper.downcallHandle(
        "RtlFlushNonVolatileMemoryRanges",
        constants$117.RtlFlushNonVolatileMemoryRanges$FUNC
    );
    static final FunctionDescriptor RtlInitializeCorrelationVector$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlInitializeCorrelationVector$MH = RuntimeHelper.downcallHandle(
        "RtlInitializeCorrelationVector",
        constants$117.RtlInitializeCorrelationVector$FUNC
    );
    static final FunctionDescriptor RtlIncrementCorrelationVector$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlIncrementCorrelationVector$MH = RuntimeHelper.downcallHandle(
        "RtlIncrementCorrelationVector",
        constants$117.RtlIncrementCorrelationVector$FUNC
    );
    static final FunctionDescriptor RtlExtendCorrelationVector$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlExtendCorrelationVector$MH = RuntimeHelper.downcallHandle(
        "RtlExtendCorrelationVector",
        constants$117.RtlExtendCorrelationVector$FUNC
    );
}

