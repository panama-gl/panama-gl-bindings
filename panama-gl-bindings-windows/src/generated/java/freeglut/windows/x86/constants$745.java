// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$745 {

    static final FunctionDescriptor _msize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _msize$MH = RuntimeHelper.downcallHandle(
        "_msize",
        constants$745._msize$FUNC
    );
    static final FunctionDescriptor _realloc_base$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _realloc_base$MH = RuntimeHelper.downcallHandle(
        "_realloc_base",
        constants$745._realloc_base$FUNC
    );
    static final FunctionDescriptor realloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle realloc$MH = RuntimeHelper.downcallHandle(
        "realloc",
        constants$745.realloc$FUNC
    );
    static final FunctionDescriptor _recalloc_base$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _recalloc_base$MH = RuntimeHelper.downcallHandle(
        "_recalloc_base",
        constants$745._recalloc_base$FUNC
    );
    static final FunctionDescriptor _recalloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _recalloc$MH = RuntimeHelper.downcallHandle(
        "_recalloc",
        constants$745._recalloc$FUNC
    );
    static final FunctionDescriptor _aligned_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _aligned_free$MH = RuntimeHelper.downcallHandle(
        "_aligned_free",
        constants$745._aligned_free$FUNC
    );
}


