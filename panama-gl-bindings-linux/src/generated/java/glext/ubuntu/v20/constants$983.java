// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$983 {

    static final FunctionDescriptor system$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle system$MH = RuntimeHelper.downcallHandle(
        "system",
        constants$983.system$FUNC
    );
    static final FunctionDescriptor realpath$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle realpath$MH = RuntimeHelper.downcallHandle(
        "realpath",
        constants$983.realpath$FUNC
    );
    static final FunctionDescriptor __compar_fn_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __compar_fn_t$MH = RuntimeHelper.downcallHandle(
        constants$983.__compar_fn_t$FUNC
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
        constants$983.bsearch$FUNC
    );
    static final FunctionDescriptor qsort$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle qsort$MH = RuntimeHelper.downcallHandle(
        "qsort",
        constants$983.qsort$FUNC
    );
}


