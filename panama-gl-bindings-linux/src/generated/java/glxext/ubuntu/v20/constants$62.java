// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$62 {

    static final FunctionDescriptor XGetOMValues$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetOMValues$MH = RuntimeHelper.downcallHandleVariadic(
        "XGetOMValues",
        constants$62.XGetOMValues$FUNC
    );
    static final FunctionDescriptor XDisplayOfOM$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XDisplayOfOM$MH = RuntimeHelper.downcallHandle(
        "XDisplayOfOM",
        constants$62.XDisplayOfOM$FUNC
    );
    static final FunctionDescriptor XLocaleOfOM$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XLocaleOfOM$MH = RuntimeHelper.downcallHandle(
        "XLocaleOfOM",
        constants$62.XLocaleOfOM$FUNC
    );
    static final FunctionDescriptor XCreateOC$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XCreateOC$MH = RuntimeHelper.downcallHandleVariadic(
        "XCreateOC",
        constants$62.XCreateOC$FUNC
    );
    static final FunctionDescriptor XDestroyOC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XDestroyOC$MH = RuntimeHelper.downcallHandle(
        "XDestroyOC",
        constants$62.XDestroyOC$FUNC
    );
    static final FunctionDescriptor XOMOfOC$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XOMOfOC$MH = RuntimeHelper.downcallHandle(
        "XOMOfOC",
        constants$62.XOMOfOC$FUNC
    );
}


