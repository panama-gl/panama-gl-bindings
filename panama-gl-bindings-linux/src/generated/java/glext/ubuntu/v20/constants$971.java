// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$971 {

    static final FunctionDescriptor strtoll$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strtoll$MH = RuntimeHelper.downcallHandle(
        "strtoll",
        constants$971.strtoll$FUNC
    );
    static final FunctionDescriptor strtoull$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strtoull$MH = RuntimeHelper.downcallHandle(
        "strtoull",
        constants$971.strtoull$FUNC
    );
    static final FunctionDescriptor l64a$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle l64a$MH = RuntimeHelper.downcallHandle(
        "l64a",
        constants$971.l64a$FUNC
    );
    static final FunctionDescriptor a64l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle a64l$MH = RuntimeHelper.downcallHandle(
        "a64l",
        constants$971.a64l$FUNC
    );
    static final FunctionDescriptor __bswap_16$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle __bswap_16$MH = RuntimeHelper.downcallHandle(
        "__bswap_16",
        constants$971.__bswap_16$FUNC
    );
    static final FunctionDescriptor __bswap_32$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __bswap_32$MH = RuntimeHelper.downcallHandle(
        "__bswap_32",
        constants$971.__bswap_32$FUNC
    );
}


