// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef struct _CTL_VERIFY_USAGE_STATUS {
 *     DWORD cbSize;
 *     DWORD dwError;
 *     DWORD dwFlags;
 *     PCCTL_CONTEXT *ppCtl;
 *     DWORD dwCtlEntryIndex;
 *     PCCERT_CONTEXT *ppSigner;
 *     DWORD dwSignerIndex;
 * } CTL_VERIFY_USAGE_STATUS
 * }
 */
public class CTL_VERIFY_USAGE_STATUS extends _CTL_VERIFY_USAGE_STATUS {

    CTL_VERIFY_USAGE_STATUS() {
        // Should not be called directly
    }
}

