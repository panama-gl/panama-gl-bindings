// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$230 {

    static final FunctionDescriptor ENUMRESTYPEPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ENUMRESTYPEPROCW$MH = RuntimeHelper.downcallHandle(
        constants$230.ENUMRESTYPEPROCW$FUNC
    );
    static final FunctionDescriptor DisableThreadLibraryCalls$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DisableThreadLibraryCalls$MH = RuntimeHelper.downcallHandle(
        "DisableThreadLibraryCalls",
        constants$230.DisableThreadLibraryCalls$FUNC
    );
    static final FunctionDescriptor FindResourceExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle FindResourceExW$MH = RuntimeHelper.downcallHandle(
        "FindResourceExW",
        constants$230.FindResourceExW$FUNC
    );
    static final FunctionDescriptor FindStringOrdinal$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle FindStringOrdinal$MH = RuntimeHelper.downcallHandle(
        "FindStringOrdinal",
        constants$230.FindStringOrdinal$FUNC
    );
    static final FunctionDescriptor FreeLibrary$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeLibrary$MH = RuntimeHelper.downcallHandle(
        "FreeLibrary",
        constants$230.FreeLibrary$FUNC
    );
}


