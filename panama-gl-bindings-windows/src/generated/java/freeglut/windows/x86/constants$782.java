// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$782 {

    static final FunctionDescriptor swab$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle swab$MH = RuntimeHelper.downcallHandle(
        "swab",
        constants$782.swab$FUNC
    );
    static final FunctionDescriptor ultoa$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ultoa$MH = RuntimeHelper.downcallHandle(
        "ultoa",
        constants$782.ultoa$FUNC
    );
    static final FunctionDescriptor putenv$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle putenv$MH = RuntimeHelper.downcallHandle(
        "putenv",
        constants$782.putenv$FUNC
    );
    static final FunctionDescriptor onexit$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle onexit$MH = RuntimeHelper.downcallHandle(
        "onexit",
        constants$782.onexit$FUNC
    );
    static final FunctionDescriptor __glutInitWithExit$exitfunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle __glutInitWithExit$exitfunc$MH = RuntimeHelper.downcallHandle(
        constants$782.__glutInitWithExit$exitfunc$FUNC
    );
}

