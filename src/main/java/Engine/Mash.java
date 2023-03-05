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

    public boolean check(float x, float y){
        float jarak = (float) Math.sqrt(Math.pow((x - centerx), 2) + Math.pow((y- centery), 2));
        if (jarak <= 0.2f){
            return false;
        }
        return true;
    }

    public boolean kotak(float x, float y){
        float jarak = (float) Math.sqrt(Math.pow((x - centerx), 2) + Math.pow((y- centery), 2));
        if (jarak <= 0.1f){
            return false;
        }
        return true;
    }
    public void change (float x, float y, float r){
        this.centerx = x;
        this.centery = y;
        this.radius = r;
        createRect();
        setupVAOVBO();
    }

    public void update(int index, Vector3f newVector){
    }

    public float getCenterx() {
        return centerx;
    }

    public void setCenterx(float centerx) {
        this.centerx = centerx;
    }

    public float getCentery() {
        return centery;
    }

    public void setCentery(float centery) {
        this.centery = centery;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}