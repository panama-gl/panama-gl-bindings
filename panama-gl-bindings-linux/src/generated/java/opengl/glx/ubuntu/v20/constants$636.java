// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$636 {

    static final FunctionDescriptor PFNGLMULTITEXGENDVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXGENDVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$636.PFNGLMULTITEXGENDVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXGENFEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLMULTITEXGENFEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIF)V",
        constants$636.PFNGLMULTITEXGENFEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXGENFVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXGENFVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$636.PFNGLMULTITEXGENFVEXTPROC$FUNC, false
    );
}


