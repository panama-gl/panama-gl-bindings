// Generated by jextract

package glx.linux.x86;

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
 * typedef union __GLXEvent {
 *     GLXPbufferClobberEvent glxpbufferclobber;
 *     GLXBufferSwapComplete glxbufferswapcomplete;
 *     long pad[24];
 * } GLXEvent
 * }
 */
public class GLXEvent extends __GLXEvent {

    GLXEvent() {
        // Should not be called directly
    }
}

