// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$259 {

    static final FunctionDescriptor PFIBER_CALLOUT_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFIBER_CALLOUT_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$259.PFIBER_CALLOUT_ROUTINE$FUNC
    );
    static final FunctionDescriptor WinMain$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WinMain$MH = RuntimeHelper.downcallHandle(
        "WinMain",
        constants$259.WinMain$FUNC
    );
    static final FunctionDescriptor wWinMain$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle wWinMain$MH = RuntimeHelper.downcallHandle(
        "wWinMain",
        constants$259.wWinMain$FUNC
    );
    static final FunctionDescriptor GlobalAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle GlobalAlloc$MH = RuntimeHelper.downcallHandle(
        "GlobalAlloc",
        constants$259.GlobalAlloc$FUNC
    );
    static final FunctionDescriptor GlobalReAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GlobalReAlloc$MH = RuntimeHelper.downcallHandle(
        "GlobalReAlloc",
        constants$259.GlobalReAlloc$FUNC
    );
    static final FunctionDescriptor GlobalSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalSize$MH = RuntimeHelper.downcallHandle(
        "GlobalSize",
        constants$259.GlobalSize$FUNC
    );
}

