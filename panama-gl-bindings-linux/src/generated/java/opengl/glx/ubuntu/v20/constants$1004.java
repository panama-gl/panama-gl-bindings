// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1004 {

    static final FunctionDescriptor PFNGLTEXCOORD2FVERTEX3FSUNPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLTEXCOORD2FVERTEX3FSUNPROC$MH = RuntimeHelper.downcallHandle(
        "(FFFFF)V",
        constants$1004.PFNGLTEXCOORD2FVERTEX3FSUNPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXCOORD2FVERTEX3FVSUNPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLTEXCOORD2FVERTEX3FVSUNPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1004.PFNGLTEXCOORD2FVERTEX3FVSUNPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXCOORD4FVERTEX4FSUNPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLTEXCOORD4FVERTEX4FSUNPROC$MH = RuntimeHelper.downcallHandle(
        "(FFFFFFFF)V",
        constants$1004.PFNGLTEXCOORD4FVERTEX4FSUNPROC$FUNC, false
    );
}


