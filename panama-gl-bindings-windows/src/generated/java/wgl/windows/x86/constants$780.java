// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$780 {

    static final FunctionDescriptor CertSerializeCRLStoreElement$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSerializeCRLStoreElement$MH = RuntimeHelper.downcallHandle(
        "CertSerializeCRLStoreElement",
        constants$780.CertSerializeCRLStoreElement$FUNC
    );
    static final FunctionDescriptor CertDuplicateCTLContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertDuplicateCTLContext$MH = RuntimeHelper.downcallHandle(
        "CertDuplicateCTLContext",
        constants$780.CertDuplicateCTLContext$FUNC
    );
    static final FunctionDescriptor CertCreateCTLContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertCreateCTLContext$MH = RuntimeHelper.downcallHandle(
        "CertCreateCTLContext",
        constants$780.CertCreateCTLContext$FUNC
    );
    static final FunctionDescriptor CertFreeCTLContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFreeCTLContext$MH = RuntimeHelper.downcallHandle(
        "CertFreeCTLContext",
        constants$780.CertFreeCTLContext$FUNC
    );
    static final FunctionDescriptor CertSetCTLContextProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSetCTLContextProperty$MH = RuntimeHelper.downcallHandle(
        "CertSetCTLContextProperty",
        constants$780.CertSetCTLContextProperty$FUNC
    );
    static final FunctionDescriptor CertGetCTLContextProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetCTLContextProperty$MH = RuntimeHelper.downcallHandle(
        "CertGetCTLContextProperty",
        constants$780.CertGetCTLContextProperty$FUNC
    );
}


