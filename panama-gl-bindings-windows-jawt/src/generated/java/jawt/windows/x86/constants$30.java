// Generated by jextract

package jawt.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$30 {

    static final FunctionDescriptor _popen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _popen$MH = RuntimeHelper.downcallHandle(
        "_popen",
        constants$30._popen$FUNC
    );
    static final FunctionDescriptor putc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle putc$MH = RuntimeHelper.downcallHandle(
        "putc",
        constants$30.putc$FUNC
    );
    static final FunctionDescriptor putchar$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle putchar$MH = RuntimeHelper.downcallHandle(
        "putchar",
        constants$30.putchar$FUNC
    );
    static final FunctionDescriptor puts$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle puts$MH = RuntimeHelper.downcallHandle(
        "puts",
        constants$30.puts$FUNC
    );
    static final FunctionDescriptor _putw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _putw$MH = RuntimeHelper.downcallHandle(
        "_putw",
        constants$30._putw$FUNC
    );
    static final FunctionDescriptor remove$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle remove$MH = RuntimeHelper.downcallHandle(
        "remove",
        constants$30.remove$FUNC
    );
}


