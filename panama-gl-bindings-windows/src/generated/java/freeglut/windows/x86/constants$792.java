// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$792 {

    static final FunctionDescriptor glutSolidTeaspoon$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle glutSolidTeaspoon$MH = RuntimeHelper.downcallHandle(
        "glutSolidTeaspoon",
        constants$792.glutSolidTeaspoon$FUNC
    );
    static final FunctionDescriptor GLUTproc$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle GLUTproc$MH = RuntimeHelper.downcallHandle(
        constants$792.GLUTproc$FUNC
    );
    static final FunctionDescriptor glutGetProcAddress$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutGetProcAddress$MH = RuntimeHelper.downcallHandle(
        "glutGetProcAddress",
        constants$792.glutGetProcAddress$FUNC
    );
    static final FunctionDescriptor glutMultiEntryFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutMultiEntryFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$792.glutMultiEntryFunc$callback$FUNC
    );
}


