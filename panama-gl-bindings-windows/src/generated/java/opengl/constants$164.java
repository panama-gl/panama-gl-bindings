// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$164 {

    static final FunctionDescriptor QueryPerformanceCounter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryPerformanceCounter$MH = RuntimeHelper.downcallHandle(
        "QueryPerformanceCounter",
        constants$164.QueryPerformanceCounter$FUNC
    );
    static final FunctionDescriptor QueryPerformanceFrequency$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryPerformanceFrequency$MH = RuntimeHelper.downcallHandle(
        "QueryPerformanceFrequency",
        constants$164.QueryPerformanceFrequency$FUNC
    );
    static final FunctionDescriptor HeapCreate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle HeapCreate$MH = RuntimeHelper.downcallHandle(
        "HeapCreate",
        constants$164.HeapCreate$FUNC
    );
    static final FunctionDescriptor HeapDestroy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HeapDestroy$MH = RuntimeHelper.downcallHandle(
        "HeapDestroy",
        constants$164.HeapDestroy$FUNC
    );
    static final FunctionDescriptor HeapAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle HeapAlloc$MH = RuntimeHelper.downcallHandle(
        "HeapAlloc",
        constants$164.HeapAlloc$FUNC
    );
    static final FunctionDescriptor HeapReAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle HeapReAlloc$MH = RuntimeHelper.downcallHandle(
        "HeapReAlloc",
        constants$164.HeapReAlloc$FUNC
    );
}


