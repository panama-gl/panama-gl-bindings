// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$481 {

    static final FunctionDescriptor MenuItemFromPoint$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT")
    );
    static final MethodHandle MenuItemFromPoint$MH = RuntimeHelper.downcallHandle(
        "MenuItemFromPoint",
        constants$481.MenuItemFromPoint$FUNC
    );
    static final FunctionDescriptor DragObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DragObject$MH = RuntimeHelper.downcallHandle(
        "DragObject",
        constants$481.DragObject$FUNC
    );
    static final FunctionDescriptor DragDetect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT")
    );
    static final MethodHandle DragDetect$MH = RuntimeHelper.downcallHandle(
        "DragDetect",
        constants$481.DragDetect$FUNC
    );
    static final FunctionDescriptor DrawIcon$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DrawIcon$MH = RuntimeHelper.downcallHandle(
        "DrawIcon",
        constants$481.DrawIcon$FUNC
    );
    static final FunctionDescriptor DrawTextA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DrawTextA$MH = RuntimeHelper.downcallHandle(
        "DrawTextA",
        constants$481.DrawTextA$FUNC
    );
    static final FunctionDescriptor DrawTextW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DrawTextW$MH = RuntimeHelper.downcallHandle(
        "DrawTextW",
        constants$481.DrawTextW$FUNC
    );
}


