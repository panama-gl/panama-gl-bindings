// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$205 {

    static final FunctionDescriptor ReadProcessMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadProcessMemory$MH = RuntimeHelper.downcallHandle(
        "ReadProcessMemory",
        constants$205.ReadProcessMemory$FUNC
    );
    static final FunctionDescriptor WriteProcessMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WriteProcessMemory$MH = RuntimeHelper.downcallHandle(
        "WriteProcessMemory",
        constants$205.WriteProcessMemory$FUNC
    );
    static final FunctionDescriptor CreateFileMappingW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFileMappingW$MH = RuntimeHelper.downcallHandle(
        "CreateFileMappingW",
        constants$205.CreateFileMappingW$FUNC
    );
    static final FunctionDescriptor OpenFileMappingW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenFileMappingW$MH = RuntimeHelper.downcallHandle(
        "OpenFileMappingW",
        constants$205.OpenFileMappingW$FUNC
    );
    static final FunctionDescriptor MapViewOfFile$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle MapViewOfFile$MH = RuntimeHelper.downcallHandle(
        "MapViewOfFile",
        constants$205.MapViewOfFile$FUNC
    );
    static final FunctionDescriptor MapViewOfFileEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MapViewOfFileEx$MH = RuntimeHelper.downcallHandle(
        "MapViewOfFileEx",
        constants$205.MapViewOfFileEx$FUNC
    );
}


