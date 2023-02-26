package Engine;

import org.joml.Vector3f;
import org.joml.Vector4f;

import java.util.List;

import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL15.GL_STATIC_DRAW;
import static org.lwjgl.opengl.GL20.glEnableVertexAttribArray;
import static org.lwjgl.opengl.GL20.glVertexAttribPointer;
import static org.lwjgl.opengl.GL30.glBindVertexArray;
import static org.lwjgl.opengl.GL30.glGenVertexArrays;

public class Circles extends Object2d {
    float centerx;
    float centery;
    float radiusX;
    float radiusY;
    int coba;

    public Circles(List<ShaderModuleData> shaderModuleDataList, List<Vector3f> vertices, Vector4f color, float centerx, float centery, float radiusX, float radiusY, int coba) {
        super(shaderModuleDataList, vertices, color);
        this.centerx = centerx;
        this.centery = centery;
        this.radiusX = radiusX;
        this.radiusY = radiusY;
        if (coba == 0){
            createCircle();
        } else if (coba == 1) {
            createdRectangle();
        } else if (coba == 2) {
            createdTriangle();
        }
        setupVAOVBO();
    }

    public void createCircle() {
        //vertices -> clear dlu
        vertices.clear();
        // batas kiri kanan -1 sm 1
        // int degree = 45;
        // i += biar loopnya 4 kali untuk persegi
        // kalo segitiga loopnya 3 kali
        // kalo elipse radius yang x sendiri terus radius y  juga sendiri beda2
        for (double i = 0; i < 360; i += 0.01f) {
            float x = (float) (centerx + radiusX * Math.cos(i));
            float y = (float) (centery + radiusY * Math.sin(i));
            vertices.add(new Vector3f(x, y, 0.0f));

            // setiap loop degree += 90 kalo rectangle
        }
    }

    @Override
    public void draw() {
        drawSetup();
        glLineWidth(10);
        glPointSize(10);
        glDrawArrays(GL_POLYGON, 0, vertices.size());
    }

    public void createdRectangle() {
        //vertices -> clear dlu
        vertices.clear();
        // batas kiri kanan -1 sm 1
        // int degree = 45;
        // i += biar loopnya 4 kali untuk persegi
        // kalo segitiga loopnya 3 kali
        // kalo elipse radius yang x sendiri terus radius y  juga sendiri beda2
        for (double i = -45; i < 360; i += 90) {
            float x = (float) (centerx + radiusX * Math.cos(Math.toRadians(i)));
            float y = (float) (centery + radiusY * Math.sin(Math.toRadians(i)));
            vertices.add(new Vector3f(x, y, 0.0f));

            // setiap loop degree += 90 kalo rectangle
        }
    }

    public void createdTriangle() {
        //vertices -> clear dlu
        vertices.clear();
        // batas kiri kanan -1 sm 1
        // int degree = 45;
        // i += biar loopnya 4 kali untuk persegi
        // kalo segitiga loopnya 3 kali
        // kalo elipse radius yang x sendiri terus radius y  juga sendiri beda2
        for (double i = -60; i < 360; i += 120) {
            float x = (float) (centerx + radiusX * Math.cos(Math.toRadians(i)));
            float y = (float) (centery + radiusY * Math.sin(Math.toRadians(i)));
            vertices.add(new Vector3f(x, y, 0.0f));

            // setiap loop degree += 90 kalo rectangle
        }
    }
}
