// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$956 {

    static final FunctionDescriptor _searchenv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _searchenv$MH = RuntimeHelper.downcallHandle(
        "_searchenv",
        constants$956._searchenv$FUNC
    );
    static final FunctionDescriptor _seterrormode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _seterrormode$MH = RuntimeHelper.downcallHandle(
        "_seterrormode",
        constants$956._seterrormode$FUNC
    );
    static final FunctionDescriptor _beep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _beep$MH = RuntimeHelper.downcallHandle(
        "_beep",
        constants$956._beep$FUNC
    );
    static final FunctionDescriptor _sleep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _sleep$MH = RuntimeHelper.downcallHandle(
        "_sleep",
        constants$956._sleep$FUNC
    );
    static final FunctionDescriptor ecvt$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ecvt$MH = RuntimeHelper.downcallHandle(
        "ecvt",
        constants$956.ecvt$FUNC
    );
    static final FunctionDescriptor fcvt$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fcvt$MH = RuntimeHelper.downcallHandle(
        "fcvt",
        constants$956.fcvt$FUNC
    );
}

