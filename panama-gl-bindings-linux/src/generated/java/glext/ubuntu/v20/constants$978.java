// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$978 {

    static final FunctionDescriptor calloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle calloc$MH = RuntimeHelper.downcallHandle(
        "calloc",
        constants$978.calloc$FUNC
    );
    static final FunctionDescriptor realloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle realloc$MH = RuntimeHelper.downcallHandle(
        "realloc",
        constants$978.realloc$FUNC
    );
    static final FunctionDescriptor reallocarray$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle reallocarray$MH = RuntimeHelper.downcallHandle(
        "reallocarray",
        constants$978.reallocarray$FUNC
    );
    static final FunctionDescriptor free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle free$MH = RuntimeHelper.downcallHandle(
        "free",
        constants$978.free$FUNC
    );
    static final FunctionDescriptor alloca$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle alloca$MH = RuntimeHelper.downcallHandle(
        "alloca",
        constants$978.alloca$FUNC
    );
    static final FunctionDescriptor valloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle valloc$MH = RuntimeHelper.downcallHandle(
        "valloc",
        constants$978.valloc$FUNC
    );
}


