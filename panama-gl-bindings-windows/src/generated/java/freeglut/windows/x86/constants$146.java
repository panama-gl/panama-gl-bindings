// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$146 {

    static final FunctionDescriptor ReadFileEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadFileEx$MH = RuntimeHelper.downcallHandle(
        "ReadFileEx",
        constants$146.ReadFileEx$FUNC
    );
    static final FunctionDescriptor ReadFileScatter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadFileScatter$MH = RuntimeHelper.downcallHandle(
        "ReadFileScatter",
        constants$146.ReadFileScatter$FUNC
    );
    static final FunctionDescriptor RemoveDirectoryA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemoveDirectoryA$MH = RuntimeHelper.downcallHandle(
        "RemoveDirectoryA",
        constants$146.RemoveDirectoryA$FUNC
    );
    static final FunctionDescriptor RemoveDirectoryW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemoveDirectoryW$MH = RuntimeHelper.downcallHandle(
        "RemoveDirectoryW",
        constants$146.RemoveDirectoryW$FUNC
    );
    static final FunctionDescriptor SetEndOfFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetEndOfFile$MH = RuntimeHelper.downcallHandle(
        "SetEndOfFile",
        constants$146.SetEndOfFile$FUNC
    );
    static final FunctionDescriptor SetFileAttributesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetFileAttributesA$MH = RuntimeHelper.downcallHandle(
        "SetFileAttributesA",
        constants$146.SetFileAttributesA$FUNC
    );
}


