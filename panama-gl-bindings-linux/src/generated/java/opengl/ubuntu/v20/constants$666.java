// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$666 {

    static final FunctionDescriptor PFNGLACTIVESTENCILFACEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLACTIVESTENCILFACEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$666.PFNGLACTIVESTENCILFACEEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXSUBIMAGE1DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLTEXSUBIMAGE1DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$666.PFNGLTEXSUBIMAGE1DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXSUBIMAGE2DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLTEXSUBIMAGE2DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$666.PFNGLTEXSUBIMAGE2DEXTPROC$FUNC, false
    );
}


