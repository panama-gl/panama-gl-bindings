// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$351 {

    static final FunctionDescriptor PFNGLPOPDEBUGGROUPPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLPOPDEBUGGROUPPROC$MH = RuntimeHelper.downcallHandle(
        constants$351.PFNGLPOPDEBUGGROUPPROC$FUNC
    );
    static final FunctionDescriptor PFNGLOBJECTLABELPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLOBJECTLABELPROC$MH = RuntimeHelper.downcallHandle(
        constants$351.PFNGLOBJECTLABELPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETOBJECTLABELPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETOBJECTLABELPROC$MH = RuntimeHelper.downcallHandle(
        constants$351.PFNGLGETOBJECTLABELPROC$FUNC
    );
}

