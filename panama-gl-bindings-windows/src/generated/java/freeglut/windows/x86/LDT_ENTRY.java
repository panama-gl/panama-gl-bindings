// Generated by jextract

package freeglut.windows.x86;

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
 * typedef struct _LDT_ENTRY {
 *     WORD LimitLow;
 *     WORD BaseLow;
 *     union {
 *         struct {
 *             BYTE BaseMid;
 *             BYTE Flags1;
 *             BYTE Flags2;
 *             BYTE BaseHi;
 *         } Bytes;
 *         struct {
 *             DWORD BaseMid : 8;
 *             DWORD Type : 5;
 *             DWORD Dpl : 2;
 *             DWORD Pres : 1;
 *             DWORD LimitHi : 4;
 *             DWORD Sys : 1;
 *             DWORD Reserved_0 : 1;
 *             DWORD Default_Big : 1;
 *             DWORD Granularity : 1;
 *             DWORD BaseHi : 8;
 *         } Bits;
 *     } HighWord;
 * } LDT_ENTRY
 * }
 */
public class LDT_ENTRY extends _LDT_ENTRY {

    LDT_ENTRY() {
        // Should not be called directly
    }
}

