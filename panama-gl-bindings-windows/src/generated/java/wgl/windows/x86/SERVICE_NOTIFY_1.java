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
 * typedef struct _SERVICE_NOTIFY_1 {
 *     DWORD dwVersion;
 *     PFN_SC_NOTIFY_CALLBACK pfnNotifyCallback;
 *     PVOID pContext;
 *     DWORD dwNotificationStatus;
 *     SERVICE_STATUS_PROCESS ServiceStatus;
 * } SERVICE_NOTIFY_1
 * }
 */
public class SERVICE_NOTIFY_1 extends _SERVICE_NOTIFY_1 {

    SERVICE_NOTIFY_1() {
        // Should not be called directly
    }
}

