// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$549 {

    static final FunctionDescriptor PFNGLMULTITEXENVFEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLMULTITEXENVFEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIF)V",
        constants$549.PFNGLMULTITEXENVFEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXENVFVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXENVFVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$549.PFNGLMULTITEXENVFVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXENVIEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTITEXENVIEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$549.PFNGLMULTITEXENVIEXTPROC$FUNC, false
    );
}


