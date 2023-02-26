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

public class Stars extends Object2d{
    List<Integer> index;
    int ibo;
    float centerx;
    float centery;
    float radius;
    public Stars(List<ShaderModuleData> shaderModuleDataList, List<Vector3f> vertices, Vector4f color, List<Integer> index, float centerX, float centerY, float radius) {
        super(shaderModuleDataList, vertices, color);
        this.index = index;
        ibo = glGenBuffers();
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, ibo);
        glBufferData(GL_ELEMENT_ARRAY_BUFFER,
                Utils.listoInt(index),
                GL_STATIC_DRAW);
        this.centerx = centerX;
        this.centery = centerY;
        this.radius = radius;

        createStar();
        setupVAOVBO();
    }
    public void createStar() {
    // vertices -> clear
        vertices.clear();

        for (double i = -36; i < 360; i += 72) {
            float x = (float) (radius * Math.cos(Math.toRadians(i)) + centerx);
            float y = (float) (radius * Math.sin(Math.toRadians(i)) + centery);
            vertices.add(new Vector3f(x, y, 0.0f));
        }
    }
    @Override
    public void draw()
    {
        drawSetup();
        glLineWidth(1.2f);
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, ibo);
        glDrawElements(GL_LINES, index.size(), GL_UNSIGNED_INT,0);
    }
}
