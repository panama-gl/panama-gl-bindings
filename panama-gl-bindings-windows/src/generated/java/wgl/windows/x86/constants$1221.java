// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1221 {

    static final FunctionDescriptor VarUI2FromI8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI2FromI8$MH = RuntimeHelper.downcallHandle(
        "VarUI2FromI8",
        constants$1221.VarUI2FromI8$FUNC
    );
    static final FunctionDescriptor VarUI2FromR4$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI2FromR4$MH = RuntimeHelper.downcallHandle(
        "VarUI2FromR4",
        constants$1221.VarUI2FromR4$FUNC
    );
    static final FunctionDescriptor VarUI2FromR8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI2FromR8$MH = RuntimeHelper.downcallHandle(
        "VarUI2FromR8",
        constants$1221.VarUI2FromR8$FUNC
    );
    static final FunctionDescriptor VarUI2FromDate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI2FromDate$MH = RuntimeHelper.downcallHandle(
        "VarUI2FromDate",
        constants$1221.VarUI2FromDate$FUNC
    );
    static final FunctionDescriptor VarUI2FromCy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                Constants$root.C_LONG$LAYOUT.withName("Hi")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
        ).withName("tagCY"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI2FromCy$MH = RuntimeHelper.downcallHandle(
        "VarUI2FromCy",
        constants$1221.VarUI2FromCy$FUNC
    );
    static final FunctionDescriptor VarUI2FromStr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUI2FromStr$MH = RuntimeHelper.downcallHandle(
        "VarUI2FromStr",
        constants$1221.VarUI2FromStr$FUNC
    );
}


