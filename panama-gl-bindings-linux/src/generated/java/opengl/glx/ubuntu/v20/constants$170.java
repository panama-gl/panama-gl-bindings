// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$170 {

    static final FunctionDescriptor PFNGLMULTITEXCOORD2IARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTITEXCOORD2IARBPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$170.PFNGLMULTITEXCOORD2IARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD2IVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXCOORD2IVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$170.PFNGLMULTITEXCOORD2IVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD2SARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLMULTITEXCOORD2SARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ISS)V",
        constants$170.PFNGLMULTITEXCOORD2SARBPROC$FUNC, false
    );
}


