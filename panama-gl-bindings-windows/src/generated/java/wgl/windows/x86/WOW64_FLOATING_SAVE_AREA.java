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
 * typedef struct _WOW64_FLOATING_SAVE_AREA {
 *     DWORD ControlWord;
 *     DWORD StatusWord;
 *     DWORD TagWord;
 *     DWORD ErrorOffset;
 *     DWORD ErrorSelector;
 *     DWORD DataOffset;
 *     DWORD DataSelector;
 *     BYTE RegisterArea[80];
 *     DWORD Cr0NpxState;
 * } WOW64_FLOATING_SAVE_AREA
 * }
 */
public class WOW64_FLOATING_SAVE_AREA extends _WOW64_FLOATING_SAVE_AREA {

    WOW64_FLOATING_SAVE_AREA() {
        // Should not be called directly
    }
}

