// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$779 {

    static final FunctionDescriptor CertAddSerializedElementToStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddSerializedElementToStore$MH = RuntimeHelper.downcallHandle(
        "CertAddSerializedElementToStore",
        constants$779.CertAddSerializedElementToStore$FUNC
    );
    static final FunctionDescriptor CertDeleteCertificateFromStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertDeleteCertificateFromStore$MH = RuntimeHelper.downcallHandle(
        "CertDeleteCertificateFromStore",
        constants$779.CertDeleteCertificateFromStore$FUNC
    );
    static final FunctionDescriptor CertAddEncodedCRLToStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddEncodedCRLToStore$MH = RuntimeHelper.downcallHandle(
        "CertAddEncodedCRLToStore",
        constants$779.CertAddEncodedCRLToStore$FUNC
    );
    static final FunctionDescriptor CertAddCRLContextToStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddCRLContextToStore$MH = RuntimeHelper.downcallHandle(
        "CertAddCRLContextToStore",
        constants$779.CertAddCRLContextToStore$FUNC
    );
    static final FunctionDescriptor CertDeleteCRLFromStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertDeleteCRLFromStore$MH = RuntimeHelper.downcallHandle(
        "CertDeleteCRLFromStore",
        constants$779.CertDeleteCRLFromStore$FUNC
    );
    static final FunctionDescriptor CertSerializeCertificateStoreElement$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSerializeCertificateStoreElement$MH = RuntimeHelper.downcallHandle(
        "CertSerializeCertificateStoreElement",
        constants$779.CertSerializeCertificateStoreElement$FUNC
    );
}


