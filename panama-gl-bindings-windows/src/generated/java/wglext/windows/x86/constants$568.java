// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$568 {

    static final FunctionDescriptor GetConsoleScreenBufferInfoEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleScreenBufferInfoEx$MH = RuntimeHelper.downcallHandle(
        "GetConsoleScreenBufferInfoEx",
        constants$568.GetConsoleScreenBufferInfoEx$FUNC
    );
    static final FunctionDescriptor SetConsoleScreenBufferInfoEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetConsoleScreenBufferInfoEx$MH = RuntimeHelper.downcallHandle(
        "SetConsoleScreenBufferInfoEx",
        constants$568.SetConsoleScreenBufferInfoEx$FUNC
    );
    static final FunctionDescriptor SetConsoleScreenBufferSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("_COORD")
    );
    static final MethodHandle SetConsoleScreenBufferSize$MH = RuntimeHelper.downcallHandle(
        "SetConsoleScreenBufferSize",
        constants$568.SetConsoleScreenBufferSize$FUNC
    );
    static final FunctionDescriptor SetConsoleCursorPosition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("_COORD")
    );
    static final MethodHandle SetConsoleCursorPosition$MH = RuntimeHelper.downcallHandle(
        "SetConsoleCursorPosition",
        constants$568.SetConsoleCursorPosition$FUNC
    );
    static final FunctionDescriptor GetLargestConsoleWindowSize$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("X"),
        Constants$root.C_SHORT$LAYOUT.withName("Y")
    ).withName("_COORD"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLargestConsoleWindowSize$MH = RuntimeHelper.downcallHandle(
        "GetLargestConsoleWindowSize",
        constants$568.GetLargestConsoleWindowSize$FUNC
    );
    static final FunctionDescriptor SetConsoleTextAttribute$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle SetConsoleTextAttribute$MH = RuntimeHelper.downcallHandle(
        "SetConsoleTextAttribute",
        constants$568.SetConsoleTextAttribute$FUNC
    );
}


