// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$407 {

    static final FunctionDescriptor SENDASYNCPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SENDASYNCPROC$MH = RuntimeHelper.downcallHandle(
        constants$407.SENDASYNCPROC$FUNC
    );
    static final FunctionDescriptor PROPENUMPROCA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PROPENUMPROCA$MH = RuntimeHelper.downcallHandle(
        constants$407.PROPENUMPROCA$FUNC
    );
    static final FunctionDescriptor PROPENUMPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PROPENUMPROCW$MH = RuntimeHelper.downcallHandle(
        constants$407.PROPENUMPROCW$FUNC
    );
}


