// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$703 {

    static final FunctionDescriptor PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_CHAR
    );
    static final MethodHandle PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIB)V",
        constants$703.PFNGLTEXTURESTORAGE3DMULTISAMPLEEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_LONG,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIJI)V",
        constants$703.PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIBI)V",
        constants$703.PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROC$FUNC, false
    );
}

