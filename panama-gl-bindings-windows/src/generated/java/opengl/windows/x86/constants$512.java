// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$512 {

    static final FunctionDescriptor LoadCursorFromFileA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadCursorFromFileA$MH = RuntimeHelper.downcallHandle(
        "LoadCursorFromFileA",
        constants$512.LoadCursorFromFileA$FUNC
    );
    static final FunctionDescriptor LoadCursorFromFileW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadCursorFromFileW$MH = RuntimeHelper.downcallHandle(
        "LoadCursorFromFileW",
        constants$512.LoadCursorFromFileW$FUNC
    );
    static final FunctionDescriptor CreateCursor$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateCursor$MH = RuntimeHelper.downcallHandle(
        "CreateCursor",
        constants$512.CreateCursor$FUNC
    );
    static final FunctionDescriptor DestroyCursor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroyCursor$MH = RuntimeHelper.downcallHandle(
        "DestroyCursor",
        constants$512.DestroyCursor$FUNC
    );
    static final FunctionDescriptor SetSystemCursor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSystemCursor$MH = RuntimeHelper.downcallHandle(
        "SetSystemCursor",
        constants$512.SetSystemCursor$FUNC
    );
    static final FunctionDescriptor LoadIconA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadIconA$MH = RuntimeHelper.downcallHandle(
        "LoadIconA",
        constants$512.LoadIconA$FUNC
    );
}


