// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$517 {

    static final FunctionDescriptor PFNGLCOMPRESSEDTEXSUBIMAGE1DARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLCOMPRESSEDTEXSUBIMAGE1DARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$517.PFNGLCOMPRESSEDTEXSUBIMAGE1DARBPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETCOMPRESSEDTEXIMAGEARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETCOMPRESSEDTEXIMAGEARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$517.PFNGLGETCOMPRESSEDTEXIMAGEARBPROC$FUNC
    );
    static final FunctionDescriptor glCompressedTexImage3DARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glCompressedTexImage3DARB$MH = RuntimeHelper.downcallHandle(
        "glCompressedTexImage3DARB",
        constants$517.glCompressedTexImage3DARB$FUNC
    );
    static final FunctionDescriptor glCompressedTexImage2DARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glCompressedTexImage2DARB$MH = RuntimeHelper.downcallHandle(
        "glCompressedTexImage2DARB",
        constants$517.glCompressedTexImage2DARB$FUNC
    );
    static final FunctionDescriptor glCompressedTexImage1DARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glCompressedTexImage1DARB$MH = RuntimeHelper.downcallHandle(
        "glCompressedTexImage1DARB",
        constants$517.glCompressedTexImage1DARB$FUNC
    );
}

