// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1008 {

    static final FunctionDescriptor PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FSUNPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FSUNPROC$MH = RuntimeHelper.downcallHandle(
        "(FFFFFFFFFFFFFFF)V",
        constants$1008.PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FSUNPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FVSUNPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FVSUNPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1008.PFNGLTEXCOORD4FCOLOR4FNORMAL3FVERTEX4FVSUNPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROC$MH = RuntimeHelper.downcallHandle(
        "(IFFF)V",
        constants$1008.PFNGLREPLACEMENTCODEUIVERTEX3FSUNPROC$FUNC, false
    );
}

