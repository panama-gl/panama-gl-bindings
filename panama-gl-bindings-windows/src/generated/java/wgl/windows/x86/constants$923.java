// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$923 {

    static final FunctionDescriptor _CoreCrtNonSecureSearchSortCompareFunction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _CoreCrtNonSecureSearchSortCompareFunction$MH = RuntimeHelper.downcallHandle(
        constants$923._CoreCrtNonSecureSearchSortCompareFunction$FUNC
    );
    static final FunctionDescriptor bsearch_s$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle bsearch_s$MH = RuntimeHelper.downcallHandle(
        "bsearch_s",
        constants$923.bsearch_s$FUNC
    );
    static final FunctionDescriptor qsort_s$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle qsort_s$MH = RuntimeHelper.downcallHandle(
        "qsort_s",
        constants$923.qsort_s$FUNC
    );
    static final FunctionDescriptor bsearch$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle bsearch$MH = RuntimeHelper.downcallHandle(
        "bsearch",
        constants$923.bsearch$FUNC
    );
    static final FunctionDescriptor qsort$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle qsort$MH = RuntimeHelper.downcallHandle(
        "qsort",
        constants$923.qsort$FUNC
    );
}

