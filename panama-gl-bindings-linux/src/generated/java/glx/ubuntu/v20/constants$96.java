// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$96 {

    static final FunctionDescriptor glTranslated$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle glTranslated$MH = RuntimeHelper.downcallHandle(
        "glTranslated",
        constants$96.glTranslated$FUNC
    );
    static final FunctionDescriptor glTranslatef$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glTranslatef$MH = RuntimeHelper.downcallHandle(
        "glTranslatef",
        constants$96.glTranslatef$FUNC
    );
    static final FunctionDescriptor glIsList$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glIsList$MH = RuntimeHelper.downcallHandle(
        "glIsList",
        constants$96.glIsList$FUNC
    );
    static final FunctionDescriptor glDeleteLists$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glDeleteLists$MH = RuntimeHelper.downcallHandle(
        "glDeleteLists",
        constants$96.glDeleteLists$FUNC
    );
    static final FunctionDescriptor glGenLists$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glGenLists$MH = RuntimeHelper.downcallHandle(
        "glGenLists",
        constants$96.glGenLists$FUNC
    );
    static final FunctionDescriptor glNewList$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glNewList$MH = RuntimeHelper.downcallHandle(
        "glNewList",
        constants$96.glNewList$FUNC
    );
}

