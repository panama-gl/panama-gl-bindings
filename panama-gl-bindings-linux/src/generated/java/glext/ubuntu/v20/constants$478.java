// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$478 {

    static final FunctionDescriptor glPointParameterfvARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glPointParameterfvARB$MH = RuntimeHelper.downcallHandle(
        "glPointParameterfvARB",
        constants$478.glPointParameterfvARB$FUNC
    );
    static final FunctionDescriptor PFNGLGETGRAPHICSRESETSTATUSARBPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle PFNGLGETGRAPHICSRESETSTATUSARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$478.PFNGLGETGRAPHICSRESETSTATUSARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETNTEXIMAGEARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETNTEXIMAGEARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$478.PFNGLGETNTEXIMAGEARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLREADNPIXELSARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}

