// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$788 {

    static final FunctionDescriptor CertVerifyCTLUsage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertVerifyCTLUsage$MH = RuntimeHelper.downcallHandle(
        "CertVerifyCTLUsage",
        constants$788.CertVerifyCTLUsage$FUNC
    );
    static final FunctionDescriptor CertVerifyRevocation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertVerifyRevocation$MH = RuntimeHelper.downcallHandle(
        "CertVerifyRevocation",
        constants$788.CertVerifyRevocation$FUNC
    );
    static final FunctionDescriptor CertCompareIntegerBlob$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertCompareIntegerBlob$MH = RuntimeHelper.downcallHandle(
        "CertCompareIntegerBlob",
        constants$788.CertCompareIntegerBlob$FUNC
    );
    static final FunctionDescriptor CertCompareCertificate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertCompareCertificate$MH = RuntimeHelper.downcallHandle(
        "CertCompareCertificate",
        constants$788.CertCompareCertificate$FUNC
    );
    static final FunctionDescriptor CertCompareCertificateName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertCompareCertificateName$MH = RuntimeHelper.downcallHandle(
        "CertCompareCertificateName",
        constants$788.CertCompareCertificateName$FUNC
    );
    static final FunctionDescriptor CertIsRDNAttrsInCertificateName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertIsRDNAttrsInCertificateName$MH = RuntimeHelper.downcallHandle(
        "CertIsRDNAttrsInCertificateName",
        constants$788.CertIsRDNAttrsInCertificateName$FUNC
    );
}


