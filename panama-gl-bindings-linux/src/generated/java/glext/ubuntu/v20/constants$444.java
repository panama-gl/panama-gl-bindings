// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$444 {

    static final FunctionDescriptor PFNGLGETPROGRAMSTRINGARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETPROGRAMSTRINGARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$444.PFNGLGETPROGRAMSTRINGARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLISPROGRAMARBPROC$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLISPROGRAMARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$444.PFNGLISPROGRAMARBPROC$FUNC
    );
    static final FunctionDescriptor glProgramStringARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glProgramStringARB$MH = RuntimeHelper.downcallHandle(
        "glProgramStringARB",
        constants$444.glProgramStringARB$FUNC
    );
    static final FunctionDescriptor glBindProgramARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBindProgramARB$MH = RuntimeHelper.downcallHandle(
        "glBindProgramARB",
        constants$444.glBindProgramARB$FUNC
    );
    static final FunctionDescriptor glDeleteProgramsARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDeleteProgramsARB$MH = RuntimeHelper.downcallHandle(
        "glDeleteProgramsARB",
        constants$444.glDeleteProgramsARB$FUNC
    );
}

