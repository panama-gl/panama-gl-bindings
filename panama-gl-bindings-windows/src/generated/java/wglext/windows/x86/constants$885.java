// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$885 {

    static final FunctionDescriptor SCardGetAttrib$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardGetAttrib$MH = RuntimeHelper.downcallHandle(
        "SCardGetAttrib",
        constants$885.SCardGetAttrib$FUNC
    );
    static final FunctionDescriptor SCardSetAttrib$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardSetAttrib$MH = RuntimeHelper.downcallHandle(
        "SCardSetAttrib",
        constants$885.SCardSetAttrib$FUNC
    );
    static final FunctionDescriptor LPOCNCONNPROCA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPOCNCONNPROCA$MH = RuntimeHelper.downcallHandle(
        constants$885.LPOCNCONNPROCA$FUNC
    );
    static final FunctionDescriptor LPOCNCONNPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPOCNCONNPROCW$MH = RuntimeHelper.downcallHandle(
        constants$885.LPOCNCONNPROCW$FUNC
    );
}

