// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$263 {

    static final FunctionDescriptor LocalFree$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalFree$MH = RuntimeHelper.downcallHandle(
        "LocalFree",
        constants$263.LocalFree$FUNC
    );
    static final FunctionDescriptor LocalShrink$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LocalShrink$MH = RuntimeHelper.downcallHandle(
        "LocalShrink",
        constants$263.LocalShrink$FUNC
    );
    static final FunctionDescriptor LocalCompact$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LocalCompact$MH = RuntimeHelper.downcallHandle(
        "LocalCompact",
        constants$263.LocalCompact$FUNC
    );
    static final FunctionDescriptor GetBinaryTypeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetBinaryTypeA$MH = RuntimeHelper.downcallHandle(
        "GetBinaryTypeA",
        constants$263.GetBinaryTypeA$FUNC
    );
    static final FunctionDescriptor GetBinaryTypeW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetBinaryTypeW$MH = RuntimeHelper.downcallHandle(
        "GetBinaryTypeW",
        constants$263.GetBinaryTypeW$FUNC
    );
    static final FunctionDescriptor GetShortPathNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetShortPathNameA$MH = RuntimeHelper.downcallHandle(
        "GetShortPathNameA",
        constants$263.GetShortPathNameA$FUNC
    );
}

