// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1343 {

    static final FunctionDescriptor glTexParameteri$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glTexParameteri$MH = RuntimeHelper.downcallHandle(
        "glTexParameteri",
        constants$1343.glTexParameteri$FUNC
    );
    static final FunctionDescriptor glTexParameteriv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glTexParameteriv$MH = RuntimeHelper.downcallHandle(
        "glTexParameteriv",
        constants$1343.glTexParameteriv$FUNC
    );
    static final FunctionDescriptor glTexSubImage1D$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glTexSubImage1D$MH = RuntimeHelper.downcallHandle(
        "glTexSubImage1D",
        constants$1343.glTexSubImage1D$FUNC
    );
    static final FunctionDescriptor glTexSubImage2D$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glTexSubImage2D$MH = RuntimeHelper.downcallHandle(
        "glTexSubImage2D",
        constants$1343.glTexSubImage2D$FUNC
    );
    static final FunctionDescriptor glTranslated$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle glTranslated$MH = RuntimeHelper.downcallHandle(
        "glTranslated",
        constants$1343.glTranslated$FUNC
    );
    static final FunctionDescriptor glTranslatef$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glTranslatef$MH = RuntimeHelper.downcallHandle(
        "glTranslatef",
        constants$1343.glTranslatef$FUNC
    );
}


