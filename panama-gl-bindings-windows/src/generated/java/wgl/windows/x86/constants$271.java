// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$271 {

    static final FunctionDescriptor GetCommPorts$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCommPorts$MH = RuntimeHelper.downcallHandle(
        "GetCommPorts",
        constants$271.GetCommPorts$FUNC
    );
    static final FunctionDescriptor SetTapePosition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetTapePosition$MH = RuntimeHelper.downcallHandle(
        "SetTapePosition",
        constants$271.SetTapePosition$FUNC
    );
    static final FunctionDescriptor GetTapePosition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTapePosition$MH = RuntimeHelper.downcallHandle(
        "GetTapePosition",
        constants$271.GetTapePosition$FUNC
    );
    static final FunctionDescriptor PrepareTape$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PrepareTape$MH = RuntimeHelper.downcallHandle(
        "PrepareTape",
        constants$271.PrepareTape$FUNC
    );
    static final FunctionDescriptor EraseTape$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EraseTape$MH = RuntimeHelper.downcallHandle(
        "EraseTape",
        constants$271.EraseTape$FUNC
    );
    static final FunctionDescriptor CreateTapePartition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateTapePartition$MH = RuntimeHelper.downcallHandle(
        "CreateTapePartition",
        constants$271.CreateTapePartition$FUNC
    );
}


