// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$63 {

    static final FunctionDescriptor XSetOCValues$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XSetOCValues$MH = RuntimeHelper.downcallHandleVariadic(
        "XSetOCValues",
        constants$63.XSetOCValues$FUNC
    );
    static final FunctionDescriptor XGetOCValues$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XGetOCValues$MH = RuntimeHelper.downcallHandleVariadic(
        "XGetOCValues",
        constants$63.XGetOCValues$FUNC
    );
    static final FunctionDescriptor XCreateFontSet$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XCreateFontSet$MH = RuntimeHelper.downcallHandle(
        "XCreateFontSet",
        constants$63.XCreateFontSet$FUNC
    );
    static final FunctionDescriptor XFreeFontSet$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XFreeFontSet$MH = RuntimeHelper.downcallHandle(
        "XFreeFontSet",
        constants$63.XFreeFontSet$FUNC
    );
    static final FunctionDescriptor XFontsOfFontSet$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XFontsOfFontSet$MH = RuntimeHelper.downcallHandle(
        "XFontsOfFontSet",
        constants$63.XFontsOfFontSet$FUNC
    );
    static final FunctionDescriptor XBaseFontNameListOfFontSet$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XBaseFontNameListOfFontSet$MH = RuntimeHelper.downcallHandle(
        "XBaseFontNameListOfFontSet",
        constants$63.XBaseFontNameListOfFontSet$FUNC
    );
}


