// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$296 {

    static final FunctionDescriptor CreateDirectoryExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateDirectoryExW$MH = RuntimeHelper.downcallHandle(
        "CreateDirectoryExW",
        constants$296.CreateDirectoryExW$FUNC
    );
    static final FunctionDescriptor CreateDirectoryTransactedA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateDirectoryTransactedA$MH = RuntimeHelper.downcallHandle(
        "CreateDirectoryTransactedA",
        constants$296.CreateDirectoryTransactedA$FUNC
    );
    static final FunctionDescriptor CreateDirectoryTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateDirectoryTransactedW$MH = RuntimeHelper.downcallHandle(
        "CreateDirectoryTransactedW",
        constants$296.CreateDirectoryTransactedW$FUNC
    );
    static final FunctionDescriptor RemoveDirectoryTransactedA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemoveDirectoryTransactedA$MH = RuntimeHelper.downcallHandle(
        "RemoveDirectoryTransactedA",
        constants$296.RemoveDirectoryTransactedA$FUNC
    );
    static final FunctionDescriptor RemoveDirectoryTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemoveDirectoryTransactedW$MH = RuntimeHelper.downcallHandle(
        "RemoveDirectoryTransactedW",
        constants$296.RemoveDirectoryTransactedW$FUNC
    );
    static final FunctionDescriptor GetFullPathNameTransactedA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFullPathNameTransactedA$MH = RuntimeHelper.downcallHandle(
        "GetFullPathNameTransactedA",
        constants$296.GetFullPathNameTransactedA$FUNC
    );
}


