// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1214 {

    static final FunctionDescriptor VarBstrFromCy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                Constants$root.C_LONG$LAYOUT.withName("Hi")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
        ).withName("tagCY"),
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBstrFromCy$MH = RuntimeHelper.downcallHandle(
        "VarBstrFromCy",
        constants$1214.VarBstrFromCy$FUNC
    );
    static final FunctionDescriptor VarBstrFromDate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBstrFromDate$MH = RuntimeHelper.downcallHandle(
        "VarBstrFromDate",
        constants$1214.VarBstrFromDate$FUNC
    );
    static final FunctionDescriptor VarBstrFromDisp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBstrFromDisp$MH = RuntimeHelper.downcallHandle(
        "VarBstrFromDisp",
        constants$1214.VarBstrFromDisp$FUNC
    );
    static final FunctionDescriptor VarBstrFromBool$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBstrFromBool$MH = RuntimeHelper.downcallHandle(
        "VarBstrFromBool",
        constants$1214.VarBstrFromBool$FUNC
    );
    static final FunctionDescriptor VarBstrFromI1$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBstrFromI1$MH = RuntimeHelper.downcallHandle(
        "VarBstrFromI1",
        constants$1214.VarBstrFromI1$FUNC
    );
    static final FunctionDescriptor VarBstrFromUI2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBstrFromUI2$MH = RuntimeHelper.downcallHandle(
        "VarBstrFromUI2",
        constants$1214.VarBstrFromUI2$FUNC
    );
}


