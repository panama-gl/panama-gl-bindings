// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$812 {

    static final FunctionDescriptor CertAddRefServerOcspResponseContext$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddRefServerOcspResponseContext$MH = RuntimeHelper.downcallHandle(
        "CertAddRefServerOcspResponseContext",
        constants$812.CertAddRefServerOcspResponseContext$FUNC
    );
    static final FunctionDescriptor CertFreeServerOcspResponseContext$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFreeServerOcspResponseContext$MH = RuntimeHelper.downcallHandle(
        "CertFreeServerOcspResponseContext",
        constants$812.CertFreeServerOcspResponseContext$FUNC
    );
    static final FunctionDescriptor CertRetrieveLogoOrBiometricInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertRetrieveLogoOrBiometricInfo$MH = RuntimeHelper.downcallHandle(
        "CertRetrieveLogoOrBiometricInfo",
        constants$812.CertRetrieveLogoOrBiometricInfo$FUNC
    );
    static final FunctionDescriptor CertSelectCertificateChains$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSelectCertificateChains$MH = RuntimeHelper.downcallHandle(
        "CertSelectCertificateChains",
        constants$812.CertSelectCertificateChains$FUNC
    );
    static final FunctionDescriptor CertFreeCertificateChainList$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFreeCertificateChainList$MH = RuntimeHelper.downcallHandle(
        "CertFreeCertificateChainList",
        constants$812.CertFreeCertificateChainList$FUNC
    );
    static final FunctionDescriptor CryptRetrieveTimeStamp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptRetrieveTimeStamp$MH = RuntimeHelper.downcallHandle(
        "CryptRetrieveTimeStamp",
        constants$812.CryptRetrieveTimeStamp$FUNC
    );
}


