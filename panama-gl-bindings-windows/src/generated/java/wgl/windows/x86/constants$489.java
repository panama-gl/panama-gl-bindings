// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$489 {

    static final FunctionDescriptor MSGBOXCALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MSGBOXCALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$489.MSGBOXCALLBACK$FUNC
    );
    static final FunctionDescriptor MessageBoxIndirectA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MessageBoxIndirectA$MH = RuntimeHelper.downcallHandle(
        "MessageBoxIndirectA",
        constants$489.MessageBoxIndirectA$FUNC
    );
    static final FunctionDescriptor MessageBoxIndirectW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MessageBoxIndirectW$MH = RuntimeHelper.downcallHandle(
        "MessageBoxIndirectW",
        constants$489.MessageBoxIndirectW$FUNC
    );
    static final FunctionDescriptor MessageBeep$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MessageBeep$MH = RuntimeHelper.downcallHandle(
        "MessageBeep",
        constants$489.MessageBeep$FUNC
    );
    static final FunctionDescriptor ShowCursor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ShowCursor$MH = RuntimeHelper.downcallHandle(
        "ShowCursor",
        constants$489.ShowCursor$FUNC
    );
}


