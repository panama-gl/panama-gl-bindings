// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$640 {

    static final FunctionDescriptor PFNGLTEXTURELIGHTEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLTEXTURELIGHTEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$640.PFNGLTEXTURELIGHTEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXTUREMATERIALEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLTEXTUREMATERIALEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$640.PFNGLTEXTUREMATERIALEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETUNSIGNEDBYTEVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETUNSIGNEDBYTEVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$640.PFNGLGETUNSIGNEDBYTEVEXTPROC$FUNC, false
    );
}

