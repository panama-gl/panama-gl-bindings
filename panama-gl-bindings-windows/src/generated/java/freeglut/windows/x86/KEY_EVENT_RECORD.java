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
 * typedef struct _KEY_EVENT_RECORD {
 *     BOOL bKeyDown;
 *     WORD wRepeatCount;
 *     WORD wVirtualKeyCode;
 *     WORD wVirtualScanCode;
 *     union {
 *         WCHAR UnicodeChar;
 *         CHAR AsciiChar;
 *     } uChar;
 *     DWORD dwControlKeyState;
 * } KEY_EVENT_RECORD
 * }
 */
public class KEY_EVENT_RECORD extends _KEY_EVENT_RECORD {

    KEY_EVENT_RECORD() {
        // Should not be called directly
    }
}

