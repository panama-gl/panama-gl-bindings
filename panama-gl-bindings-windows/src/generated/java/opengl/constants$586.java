// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$586 {

    static final FunctionDescriptor VerQueryValueW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VerQueryValueW$MH = RuntimeHelper.downcallHandle(
        "VerQueryValueW",
        constants$586.VerQueryValueW$FUNC
    );
    static final FunctionDescriptor QUERYHANDLER$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle QUERYHANDLER$MH = RuntimeHelper.downcallHandle(
        constants$586.QUERYHANDLER$FUNC
    );
    static final FunctionDescriptor PQUERYHANDLER$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PQUERYHANDLER$MH = RuntimeHelper.downcallHandle(
        constants$586.PQUERYHANDLER$FUNC
    );
    static final FunctionDescriptor RegCloseKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegCloseKey$MH = RuntimeHelper.downcallHandle(
        "RegCloseKey",
        constants$586.RegCloseKey$FUNC
    );
}


