// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1206 {

    static final FunctionDescriptor VarR8FromI8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR8FromI8$MH = RuntimeHelper.downcallHandle(
        "VarR8FromI8",
        constants$1206.VarR8FromI8$FUNC
    );
    static final FunctionDescriptor VarR8FromR4$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR8FromR4$MH = RuntimeHelper.downcallHandle(
        "VarR8FromR4",
        constants$1206.VarR8FromR4$FUNC
    );
    static final FunctionDescriptor VarR8FromCy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                Constants$root.C_LONG$LAYOUT.withName("Hi")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
        ).withName("tagCY"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR8FromCy$MH = RuntimeHelper.downcallHandle(
        "VarR8FromCy",
        constants$1206.VarR8FromCy$FUNC
    );
    static final FunctionDescriptor VarR8FromDate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR8FromDate$MH = RuntimeHelper.downcallHandle(
        "VarR8FromDate",
        constants$1206.VarR8FromDate$FUNC
    );
    static final FunctionDescriptor VarR8FromStr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR8FromStr$MH = RuntimeHelper.downcallHandle(
        "VarR8FromStr",
        constants$1206.VarR8FromStr$FUNC
    );
    static final FunctionDescriptor VarR8FromDisp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR8FromDisp$MH = RuntimeHelper.downcallHandle(
        "VarR8FromDisp",
        constants$1206.VarR8FromDisp$FUNC
    );
}

