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
 * typedef struct mmtime_tag {
 *     UINT wType;
 *     union {
 *         DWORD ms;
 *         DWORD sample;
 *         DWORD cb;
 *         DWORD ticks;
 *         struct {
 *             BYTE hour;
 *             BYTE min;
 *             BYTE sec;
 *             BYTE frame;
 *             BYTE fps;
 *             BYTE dummy;
 *             BYTE pad[2];
 *         } smpte;
 *         struct {
 *             DWORD songptrpos;
 *         } midi;
 *     } u;
 * } MMTIME
 * }
 */
public class MMTIME extends mmtime_tag {

    MMTIME() {
        // Should not be called directly
    }
}

