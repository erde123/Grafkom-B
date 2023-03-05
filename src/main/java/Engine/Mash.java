package Engine;

import org.joml.Vector3f;
import org.joml.Vector4f;

import java.util.List;

import static org.lwjgl.opengl.GL11.GL_LINES;
import static org.lwjgl.opengl.GL11.GL_UNSIGNED_INT;
import static org.lwjgl.opengl.GL11.glDrawElements;
import static org.lwjgl.opengl.GL11.glLineWidth;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL15.GL_ELEMENT_ARRAY_BUFFER;

public class Mash extends Object2d {
    float centerx;
    float centery;
    float radius;

    public Mash(List<ShaderModuleData> shaderModuleDataList, List<Vector3f> vertices, Vector4f color, float centerx, float centery, float radius) {
        super(shaderModuleDataList, vertices, color);
        this.centerx = centerx;
        this.centery = centery;
        this.radius = radius;
        createRect();
        setupVAOVBO();
    }

    public void createRect() {
        //vertices -> clear dlu
        vertices.clear();
        for (double i = -45; i < 360; i += 90) {
            float x = (float) (centerx + radius * Math.cos(Math.toRadians(i)));
            float y = (float) (centery + radius * Math.sin(Math.toRadians(i)));
            vertices.add(new Vector3f(x, y, 0.0f));
        }
    }

    @Override
    public void draw() {
        drawSetup();
        glLineWidth(10);
        glPointSize(0);
        glDrawArrays(GL_POLYGON, 0, vertices.size());
    }
}