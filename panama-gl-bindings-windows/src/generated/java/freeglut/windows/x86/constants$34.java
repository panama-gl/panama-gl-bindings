// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$34 {

    static final FunctionDescriptor wcsset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle wcsset$MH = RuntimeHelper.downcallHandle(
        "wcsset",
        constants$34.wcsset$FUNC
    );
    static final FunctionDescriptor wcslwr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcslwr$MH = RuntimeHelper.downcallHandle(
        "wcslwr",
        constants$34.wcslwr$FUNC
    );
    static final FunctionDescriptor wcsupr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcsupr$MH = RuntimeHelper.downcallHandle(
        "wcsupr",
        constants$34.wcsupr$FUNC
    );
    static final FunctionDescriptor wcsicoll$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcsicoll$MH = RuntimeHelper.downcallHandle(
        "wcsicoll",
        constants$34.wcsicoll$FUNC
    );
    static final FunctionDescriptor strcpy_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcpy_s$MH = RuntimeHelper.downcallHandle(
        "strcpy_s",
        constants$34.strcpy_s$FUNC
    );
    static final FunctionDescriptor strcat_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcat_s$MH = RuntimeHelper.downcallHandle(
        "strcat_s",
        constants$34.strcat_s$FUNC
    );
}


