// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$502 {

    static final FunctionDescriptor UnionRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnionRect$MH = RuntimeHelper.downcallHandle(
        "UnionRect",
        constants$502.UnionRect$FUNC
    );
    static final FunctionDescriptor SubtractRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SubtractRect$MH = RuntimeHelper.downcallHandle(
        "SubtractRect",
        constants$502.SubtractRect$FUNC
    );
    static final FunctionDescriptor OffsetRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OffsetRect$MH = RuntimeHelper.downcallHandle(
        "OffsetRect",
        constants$502.OffsetRect$FUNC
    );
    static final FunctionDescriptor IsRectEmpty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsRectEmpty$MH = RuntimeHelper.downcallHandle(
        "IsRectEmpty",
        constants$502.IsRectEmpty$FUNC
    );
    static final FunctionDescriptor EqualRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EqualRect$MH = RuntimeHelper.downcallHandle(
        "EqualRect",
        constants$502.EqualRect$FUNC
    );
    static final FunctionDescriptor PtInRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT")
    );
    static final MethodHandle PtInRect$MH = RuntimeHelper.downcallHandle(
        "PtInRect",
        constants$502.PtInRect$FUNC
    );
}

