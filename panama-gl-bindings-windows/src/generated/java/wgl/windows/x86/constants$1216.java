// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1216 {

    static final FunctionDescriptor VarBoolFromI8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBoolFromI8$MH = RuntimeHelper.downcallHandle(
        "VarBoolFromI8",
        constants$1216.VarBoolFromI8$FUNC
    );
    static final FunctionDescriptor VarBoolFromR4$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBoolFromR4$MH = RuntimeHelper.downcallHandle(
        "VarBoolFromR4",
        constants$1216.VarBoolFromR4$FUNC
    );
    static final FunctionDescriptor VarBoolFromR8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBoolFromR8$MH = RuntimeHelper.downcallHandle(
        "VarBoolFromR8",
        constants$1216.VarBoolFromR8$FUNC
    );
    static final FunctionDescriptor VarBoolFromDate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBoolFromDate$MH = RuntimeHelper.downcallHandle(
        "VarBoolFromDate",
        constants$1216.VarBoolFromDate$FUNC
    );
    static final FunctionDescriptor VarBoolFromCy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                Constants$root.C_LONG$LAYOUT.withName("Hi")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
        ).withName("tagCY"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBoolFromCy$MH = RuntimeHelper.downcallHandle(
        "VarBoolFromCy",
        constants$1216.VarBoolFromCy$FUNC
    );
    static final FunctionDescriptor VarBoolFromStr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarBoolFromStr$MH = RuntimeHelper.downcallHandle(
        "VarBoolFromStr",
        constants$1216.VarBoolFromStr$FUNC
    );
}


