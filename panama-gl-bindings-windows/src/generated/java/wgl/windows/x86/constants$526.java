// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$526 {

    static final FunctionDescriptor RealChildWindowFromPoint$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT")
    );
    static final MethodHandle RealChildWindowFromPoint$MH = RuntimeHelper.downcallHandle(
        "RealChildWindowFromPoint",
        constants$526.RealChildWindowFromPoint$FUNC
    );
    static final FunctionDescriptor RealGetWindowClassA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RealGetWindowClassA$MH = RuntimeHelper.downcallHandle(
        "RealGetWindowClassA",
        constants$526.RealGetWindowClassA$FUNC
    );
    static final FunctionDescriptor RealGetWindowClassW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RealGetWindowClassW$MH = RuntimeHelper.downcallHandle(
        "RealGetWindowClassW",
        constants$526.RealGetWindowClassW$FUNC
    );
    static final FunctionDescriptor GetAltTabInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetAltTabInfoA$MH = RuntimeHelper.downcallHandle(
        "GetAltTabInfoA",
        constants$526.GetAltTabInfoA$FUNC
    );
    static final FunctionDescriptor GetAltTabInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetAltTabInfoW$MH = RuntimeHelper.downcallHandle(
        "GetAltTabInfoW",
        constants$526.GetAltTabInfoW$FUNC
    );
    static final FunctionDescriptor GetListBoxInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetListBoxInfo$MH = RuntimeHelper.downcallHandle(
        "GetListBoxInfo",
        constants$526.GetListBoxInfo$FUNC
    );
}


