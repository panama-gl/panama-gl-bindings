// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1199 {

    static final FunctionDescriptor VarI4FromCy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                Constants$root.C_LONG$LAYOUT.withName("Hi")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
        ).withName("tagCY"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI4FromCy$MH = RuntimeHelper.downcallHandle(
        "VarI4FromCy",
        constants$1199.VarI4FromCy$FUNC
    );
    static final FunctionDescriptor VarI4FromDate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI4FromDate$MH = RuntimeHelper.downcallHandle(
        "VarI4FromDate",
        constants$1199.VarI4FromDate$FUNC
    );
    static final FunctionDescriptor VarI4FromStr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI4FromStr$MH = RuntimeHelper.downcallHandle(
        "VarI4FromStr",
        constants$1199.VarI4FromStr$FUNC
    );
    static final FunctionDescriptor VarI4FromDisp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI4FromDisp$MH = RuntimeHelper.downcallHandle(
        "VarI4FromDisp",
        constants$1199.VarI4FromDisp$FUNC
    );
    static final FunctionDescriptor VarI4FromBool$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI4FromBool$MH = RuntimeHelper.downcallHandle(
        "VarI4FromBool",
        constants$1199.VarI4FromBool$FUNC
    );
    static final FunctionDescriptor VarI4FromI1$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarI4FromI1$MH = RuntimeHelper.downcallHandle(
        "VarI4FromI1",
        constants$1199.VarI4FromI1$FUNC
    );
}


