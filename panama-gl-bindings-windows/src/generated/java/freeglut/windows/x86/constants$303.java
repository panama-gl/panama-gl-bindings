// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$303 {

    static final FunctionDescriptor CreateFileTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFileTransactedW$MH = RuntimeHelper.downcallHandle(
        "CreateFileTransactedW",
        constants$303.CreateFileTransactedW$FUNC
    );
    static final FunctionDescriptor ReOpenFile$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ReOpenFile$MH = RuntimeHelper.downcallHandle(
        "ReOpenFile",
        constants$303.ReOpenFile$FUNC
    );
    static final FunctionDescriptor SetFileAttributesTransactedA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetFileAttributesTransactedA$MH = RuntimeHelper.downcallHandle(
        "SetFileAttributesTransactedA",
        constants$303.SetFileAttributesTransactedA$FUNC
    );
    static final FunctionDescriptor SetFileAttributesTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetFileAttributesTransactedW$MH = RuntimeHelper.downcallHandle(
        "SetFileAttributesTransactedW",
        constants$303.SetFileAttributesTransactedW$FUNC
    );
    static final FunctionDescriptor GetFileAttributesTransactedA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileAttributesTransactedA$MH = RuntimeHelper.downcallHandle(
        "GetFileAttributesTransactedA",
        constants$303.GetFileAttributesTransactedA$FUNC
    );
    static final FunctionDescriptor GetFileAttributesTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileAttributesTransactedW$MH = RuntimeHelper.downcallHandle(
        "GetFileAttributesTransactedW",
        constants$303.GetFileAttributesTransactedW$FUNC
    );
}


