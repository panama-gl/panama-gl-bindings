// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$143 {

    static final FunctionDescriptor GetFileTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileTime$MH = RuntimeHelper.downcallHandle(
        "GetFileTime",
        constants$143.GetFileTime$FUNC
    );
    static final FunctionDescriptor GetFullPathNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFullPathNameW$MH = RuntimeHelper.downcallHandle(
        "GetFullPathNameW",
        constants$143.GetFullPathNameW$FUNC
    );
    static final FunctionDescriptor GetFullPathNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFullPathNameA$MH = RuntimeHelper.downcallHandle(
        "GetFullPathNameA",
        constants$143.GetFullPathNameA$FUNC
    );
    static final FunctionDescriptor GetLogicalDrives$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetLogicalDrives$MH = RuntimeHelper.downcallHandle(
        "GetLogicalDrives",
        constants$143.GetLogicalDrives$FUNC
    );
    static final FunctionDescriptor GetLogicalDriveStringsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLogicalDriveStringsW$MH = RuntimeHelper.downcallHandle(
        "GetLogicalDriveStringsW",
        constants$143.GetLogicalDriveStringsW$FUNC
    );
    static final FunctionDescriptor GetLongPathNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetLongPathNameA$MH = RuntimeHelper.downcallHandle(
        "GetLongPathNameA",
        constants$143.GetLongPathNameA$FUNC
    );
}

