// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1395 {

    static final FunctionDescriptor mrand48_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mrand48_r$MH = RuntimeHelper.downcallHandle(
        "mrand48_r",
        constants$1395.mrand48_r$FUNC
    );
    static final FunctionDescriptor jrand48_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle jrand48_r$MH = RuntimeHelper.downcallHandle(
        "jrand48_r",
        constants$1395.jrand48_r$FUNC
    );
    static final FunctionDescriptor srand48_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle srand48_r$MH = RuntimeHelper.downcallHandle(
        "srand48_r",
        constants$1395.srand48_r$FUNC
    );
    static final FunctionDescriptor seed48_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle seed48_r$MH = RuntimeHelper.downcallHandle(
        "seed48_r",
        constants$1395.seed48_r$FUNC
    );
    static final FunctionDescriptor lcong48_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lcong48_r$MH = RuntimeHelper.downcallHandle(
        "lcong48_r",
        constants$1395.lcong48_r$FUNC
    );
    static final FunctionDescriptor malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle malloc$MH = RuntimeHelper.downcallHandle(
        "malloc",
        constants$1395.malloc$FUNC
    );
}

