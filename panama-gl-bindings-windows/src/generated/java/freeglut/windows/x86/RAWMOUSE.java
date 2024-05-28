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
 * typedef struct tagRAWMOUSE {
 *     USHORT usFlags;
 *     union {
 *         ULONG ulButtons;
 *         struct {
 *             USHORT usButtonFlags;
 *             USHORT usButtonData;
 *         };
 *     };
 *     ULONG ulRawButtons;
 *     LONG lLastX;
 *     LONG lLastY;
 *     ULONG ulExtraInformation;
 * } RAWMOUSE
 * }
 */
public class RAWMOUSE extends tagRAWMOUSE {

    RAWMOUSE() {
        // Should not be called directly
    }
}

