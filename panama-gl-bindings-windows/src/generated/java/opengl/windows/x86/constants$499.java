// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$499 {

    static final FunctionDescriptor MapWindowPoints$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MapWindowPoints$MH = RuntimeHelper.downcallHandle(
        "MapWindowPoints",
        constants$499.MapWindowPoints$FUNC
    );
    static final FunctionDescriptor WindowFromPoint$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT")
    );
    static final MethodHandle WindowFromPoint$MH = RuntimeHelper.downcallHandle(
        "WindowFromPoint",
        constants$499.WindowFromPoint$FUNC
    );
    static final FunctionDescriptor WindowFromPhysicalPoint$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT")
    );
    static final MethodHandle WindowFromPhysicalPoint$MH = RuntimeHelper.downcallHandle(
        "WindowFromPhysicalPoint",
        constants$499.WindowFromPhysicalPoint$FUNC
    );
    static final FunctionDescriptor ChildWindowFromPoint$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT")
    );
    static final MethodHandle ChildWindowFromPoint$MH = RuntimeHelper.downcallHandle(
        "ChildWindowFromPoint",
        constants$499.ChildWindowFromPoint$FUNC
    );
    static final FunctionDescriptor ClipCursor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ClipCursor$MH = RuntimeHelper.downcallHandle(
        "ClipCursor",
        constants$499.ClipCursor$FUNC
    );
    static final FunctionDescriptor ChildWindowFromPointEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT"),
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ChildWindowFromPointEx$MH = RuntimeHelper.downcallHandle(
        "ChildWindowFromPointEx",
        constants$499.ChildWindowFromPointEx$FUNC
    );
}


