// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$37 {

    static final FunctionDescriptor _strdup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strdup$MH = RuntimeHelper.downcallHandle(
        "_strdup",
        constants$37._strdup$FUNC
    );
    static final FunctionDescriptor _strerror$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strerror$MH = RuntimeHelper.downcallHandle(
        "_strerror",
        constants$37._strerror$FUNC
    );
    static final FunctionDescriptor _strerror_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strerror_s$MH = RuntimeHelper.downcallHandle(
        "_strerror_s",
        constants$37._strerror_s$FUNC
    );
    static final FunctionDescriptor strerror$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle strerror$MH = RuntimeHelper.downcallHandle(
        "strerror",
        constants$37.strerror$FUNC
    );
    static final FunctionDescriptor _stricmp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _stricmp$MH = RuntimeHelper.downcallHandle(
        "_stricmp",
        constants$37._stricmp$FUNC
    );
    static final FunctionDescriptor _stricoll$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _stricoll$MH = RuntimeHelper.downcallHandle(
        "_stricoll",
        constants$37._stricoll$FUNC
    );
}


