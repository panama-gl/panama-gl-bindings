// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$618 {

    static final FunctionDescriptor PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_LONG,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIJI)V",
        constants$618.PFNGLVERTEXARRAYBINDVERTEXBUFFEREXTPROC$FUNC, false
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
        constants$618.PFNGLVERTEXARRAYVERTEXATTRIBFORMATEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXARRAYVERTEXATTRIBIFORMATEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXARRAYVERTEXATTRIBIFORMATEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$618.PFNGLVERTEXARRAYVERTEXATTRIBIFORMATEXTPROC$FUNC, false
    );
}

