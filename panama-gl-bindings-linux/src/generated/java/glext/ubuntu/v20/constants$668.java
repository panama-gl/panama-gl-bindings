// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$668 {

    static final FunctionDescriptor glDrawRangeElementArrayAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glDrawRangeElementArrayAPPLE$MH = RuntimeHelper.downcallHandle(
        "glDrawRangeElementArrayAPPLE",
        constants$668.glDrawRangeElementArrayAPPLE$FUNC
    );
    static final FunctionDescriptor glMultiDrawElementArrayAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glMultiDrawElementArrayAPPLE$MH = RuntimeHelper.downcallHandle(
        "glMultiDrawElementArrayAPPLE",
        constants$668.glMultiDrawElementArrayAPPLE$FUNC
    );
    static final FunctionDescriptor glMultiDrawRangeElementArrayAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glMultiDrawRangeElementArrayAPPLE$MH = RuntimeHelper.downcallHandle(
        "glMultiDrawRangeElementArrayAPPLE",
        constants$668.glMultiDrawRangeElementArrayAPPLE$FUNC
    );
    static final FunctionDescriptor PFNGLGENFENCESAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGENFENCESAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        constants$668.PFNGLGENFENCESAPPLEPROC$FUNC
    );
    static final FunctionDescriptor PFNGLDELETEFENCESAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


