// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$26 {

    static final FunctionDescriptor wcscpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcscpy$MH = RuntimeHelper.downcallHandle(
        "wcscpy",
        constants$26.wcscpy$FUNC
    );
    static final FunctionDescriptor wcscspn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcscspn$MH = RuntimeHelper.downcallHandle(
        "wcscspn",
        constants$26.wcscspn$FUNC
    );
    static final FunctionDescriptor wcslen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcslen$MH = RuntimeHelper.downcallHandle(
        "wcslen",
        constants$26.wcslen$FUNC
    );
    static final FunctionDescriptor wcsnlen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle wcsnlen$MH = RuntimeHelper.downcallHandle(
        "wcsnlen",
        constants$26.wcsnlen$FUNC
    );
    static final FunctionDescriptor wcsnlen_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle wcsnlen_s$MH = RuntimeHelper.downcallHandle(
        "wcsnlen_s",
        constants$26.wcsnlen_s$FUNC
    );
    static final FunctionDescriptor wcsncat$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle wcsncat$MH = RuntimeHelper.downcallHandle(
        "wcsncat",
        constants$26.wcsncat$FUNC
    );
}


