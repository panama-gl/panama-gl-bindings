// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$808 {

    static final FunctionDescriptor CertFreeCertificateChainEngine$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFreeCertificateChainEngine$MH = RuntimeHelper.downcallHandle(
        "CertFreeCertificateChainEngine",
        constants$808.CertFreeCertificateChainEngine$FUNC
    );
    static final FunctionDescriptor CertResyncCertificateChainEngine$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertResyncCertificateChainEngine$MH = RuntimeHelper.downcallHandle(
        "CertResyncCertificateChainEngine",
        constants$808.CertResyncCertificateChainEngine$FUNC
    );
    static final FunctionDescriptor CertGetCertificateChain$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetCertificateChain$MH = RuntimeHelper.downcallHandle(
        "CertGetCertificateChain",
        constants$808.CertGetCertificateChain$FUNC
    );
    static final FunctionDescriptor CertFreeCertificateChain$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFreeCertificateChain$MH = RuntimeHelper.downcallHandle(
        "CertFreeCertificateChain",
        constants$808.CertFreeCertificateChain$FUNC
    );
    static final FunctionDescriptor CertDuplicateCertificateChain$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertDuplicateCertificateChain$MH = RuntimeHelper.downcallHandle(
        "CertDuplicateCertificateChain",
        constants$808.CertDuplicateCertificateChain$FUNC
    );
    static final FunctionDescriptor CertFindChainInStore$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFindChainInStore$MH = RuntimeHelper.downcallHandle(
        "CertFindChainInStore",
        constants$808.CertFindChainInStore$FUNC
    );
}

