// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$260 {

    static final FunctionDescriptor CreateFiberEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFiberEx$MH = RuntimeHelper.downcallHandle(
        "CreateFiberEx",
        constants$260.CreateFiberEx$FUNC
    );
    static final FunctionDescriptor ConvertThreadToFiberEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ConvertThreadToFiberEx$MH = RuntimeHelper.downcallHandle(
        "ConvertThreadToFiberEx",
        constants$260.ConvertThreadToFiberEx$FUNC
    );
    static final FunctionDescriptor CreateFiber$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFiber$MH = RuntimeHelper.downcallHandle(
        "CreateFiber",
        constants$260.CreateFiber$FUNC
    );
    static final FunctionDescriptor ConvertThreadToFiber$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ConvertThreadToFiber$MH = RuntimeHelper.downcallHandle(
        "ConvertThreadToFiber",
        constants$260.ConvertThreadToFiber$FUNC
    );
    static final FunctionDescriptor PUMS_SCHEDULER_ENTRY_POINT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PUMS_SCHEDULER_ENTRY_POINT$MH = RuntimeHelper.downcallHandle(
        constants$260.PUMS_SCHEDULER_ENTRY_POINT$FUNC
    );
}

