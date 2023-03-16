/*
 * Copyright (c) 2020, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import static freeglut.windows.x86.freeglut_h.*;

import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;

import freeglut.windows.x86.*;

public class Teapot {
    private float rot = 0;

    Teapot(SegmentAllocator allocator) {
        // Reset Background
    	freeglut_h.glClearColor(0f, 0f, 0f, 0f);
        // Setup Lighting
    	freeglut_h.glShadeModel(freeglut_h.GL_SMOOTH());
        var pos = allocator.allocateArray(C_FLOAT, new float[] {0.0f, 15.0f, -15.0f, 0});
        freeglut_h.glLightfv(freeglut_h.GL_LIGHT0(), freeglut_h.GL_POSITION(), pos);
        var spec = allocator.allocateArray(C_FLOAT, new float[] {1, 1, 1, 0});
        freeglut_h.glLightfv(freeglut_h.GL_LIGHT0(), freeglut_h.GL_AMBIENT(), spec);
        freeglut_h.glLightfv(freeglut_h.GL_LIGHT0(), freeglut_h.GL_DIFFUSE(), spec);
        freeglut_h.glLightfv(freeglut_h.GL_LIGHT0(), freeglut_h.GL_SPECULAR(), spec);
        var shini = allocator.allocate(C_FLOAT, 113);
        freeglut_h.glMaterialfv(freeglut_h.GL_FRONT(), freeglut_h.GL_SHININESS(), shini);
        freeglut_h.glEnable(freeglut_h.GL_LIGHTING());
        freeglut_h.glEnable(freeglut_h.GL_LIGHT0());
        freeglut_h.glEnable(freeglut_h.GL_DEPTH_TEST());
    }

    void display() {
    	freeglut_h.glClear(freeglut_h.GL_COLOR_BUFFER_BIT() | freeglut_h.GL_DEPTH_BUFFER_BIT());
    	freeglut_h.glPushMatrix();
    	freeglut_h.glRotatef(-20f, 1f, 1f, 0f);
    	freeglut_h.glRotatef(rot, 0f, 1f, 0f);
    	freeglut_h.glutSolidTeapot(0.5d);
    	freeglut_h.glPopMatrix();
    	freeglut_h.glutSwapBuffers();
    }

    void onIdle() {
        rot += 0.1;
        freeglut_h.glutPostRedisplay();
    }

    public static void main(String[] args) {
    	System.loadLibrary("opengl32");
    	System.loadLibrary("glu32");
    	System.loadLibrary("freeglut");

        try (var scope = MemorySession.openConfined()) {
            var allocator = SegmentAllocator.newNativeArena(scope);
            var argc = allocator.allocate(C_INT, 0);
            freeglut_h.glutInit(argc, argc);
            freeglut_h.glutInitDisplayMode(freeglut_h.GLUT_DOUBLE() | freeglut_h.GLUT_RGB() | freeglut_h.GLUT_DEPTH());
            freeglut_h.glutInitWindowSize(500, 500);
            freeglut_h.glutCreateWindow(allocator.allocateUtf8String("Hello Panama!"));
            var teapot = new Teapot(allocator);
            var displayStub = glutDisplayFunc$callback.allocate(teapot::display, scope);
            var idleStub = glutIdleFunc$callback.allocate(teapot::onIdle, scope);
            freeglut_h.glutDisplayFunc(displayStub);
            freeglut_h.glutIdleFunc(idleStub);
            freeglut_h.glutMainLoop();
        }
    }
}