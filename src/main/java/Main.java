import Engine.*;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;

public class Main {

    private Window window = new Window(640,640,"Hello World");

    ArrayList<Object2d> objects = new ArrayList<>();
    ArrayList<Object2d> objectsRectangle = new ArrayList<>();
    ArrayList<Object2d> objectsCircle = new ArrayList<>();
    ArrayList<Object2d> objectsStars = new ArrayList<>();
    ArrayList<Object2d> objectsPointsControl = new ArrayList<>();
    ArrayList<Object2d> objectsCurve = new ArrayList<>();
    ArrayList<Object2d> objectsSphere = new ArrayList<>();
    ArrayList<Mash> objectMash = new ArrayList<>();

    boolean baru;
    boolean baru2;

    public void init() {
        window.init();
        GL.createCapabilities();
        // Code
//        objects.add(new Object2d(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(0.0f, 0.5f, 0.0f),
//                                new Vector3f(-0.5f, -0.5f, 0.0f),
//                                new Vector3f(0.5f, -0.5f, 0.0f)
//                        )
//                ),
//                new Vector4f(0.0f, 1.0f, 1.0f, 1.0f)
//        ));
//        objects.add(new Object2d(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/sceneWithVerticesColor.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/sceneWithVerticesColor.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(0.0f, 0.5f, 0.0f),
//                                new Vector3f(-0.5f, -0.5f, 0.0f),
//                                new Vector3f(0.5f, -0.5f, 0.0f)
//
//                        )
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(1.0f, 0.0f, 0.0f),
//                                new Vector3f(1.0f, 0.0f, 0.0f),
//                                new Vector3f(1.0f, 0.0f, 0.0f)
//                        )
//                )
//        ));
//        objectsRectangle.add(new Rectangle(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(-1.0f, 1.0f, 0.0f),
//                                new Vector3f(1.0f, 1.0f, 0.0f),
//                                new Vector3f(-1.0f, -0.7f, 0.0f),
//                                new Vector3f(1.0f, -0.7f, 0.0f)
//                        )
//                ),
//                new Vector4f(0.0f, 0.6f, 1.0f, 1.0f),
//                Arrays.asList(0, 1, 2, 1, 2, 3)
//        ));
//        objectsRectangle.add(new Rectangle(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(-1.0f, -0.6f, 0.0f),
//                                new Vector3f(1.0f, -0.6f, 0.0f),
//                                new Vector3f(-1.0f, -1.0f, 0.0f),
//                                new Vector3f(1.0f, -1.0f, 0.0f)
//                        )
//                ),
//                new Vector4f(0.0f, 1.0f, 0.0f, 1.0f),
//                Arrays.asList(0, 1, 2, 1, 2, 3)
//        ));
//        objectsRectangle.add(new Rectangle(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(-0.5f, 0.1f, 0.0f),
//                                new Vector3f(-0.67f, -0.3f, 0.0f),
//                                new Vector3f(-0.33f, -0.3f, 0.0f)
//                        )
//                ),
//                new Vector4f(1.0f, 0.0f, 0.0f, 1.0f),
//                Arrays.asList(0, 1, 2)
//        ));
//        objectsRectangle.add(new Rectangle(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(-0.46f, 0.1f, 0.0f),
//                                new Vector3f(-0.61f, -0.27f, 0.0f),
//                                new Vector3f(-0.33f, -0.27f, 0.0f)
//                        )
//                ),
//                new Vector4f(0.694f, 0.502f, 0.0f, 0.0f),
//                Arrays.asList(0, 1, 2)
//        ));
//        objectsRectangle.add(new Rectangle(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(-0.61f, -0.27f, 0.0f),
//                                new Vector3f(0.6f, -0.27f, 0.0f),
//                                new Vector3f(0.6f, -0.7f, 0.0f),
//                                new Vector3f(-0.61f, -0.7f, 0.0f)
//                        )
//                ),
//                new Vector4f(0.694f, 0.502f, 0.0f, 0.0f),
//                Arrays.asList(0, 1, 2, 0, 2, 3)
//        ));
//        objectsRectangle.add(new Rectangle(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(-0.5f, 0.1f, 0.0f),
//                                new Vector3f(0.5f, 0.1f, 0.0f),
//                                new Vector3f(0.67f, -0.3f, 0.0f),
//                                new Vector3f(-0.33f, -0.3f, 0.0f)
//                        )
//                ),
//                new Vector4f(1.0f, 0.0f, 0.0f, 1.0f),
//                Arrays.asList(0, 1, 2, 0, 2, 3)
//        ));
//        objectsRectangle.add(new Rectangle(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(0.3f, 0.2f, 0.0f),
//                                new Vector3f(0.38f, 0.2f, 0.0f),
//                                new Vector3f(0.38f, 0.0f, 0.0f),
//                                new Vector3f(0.3f, 0.0f, 0.0f)
//                        )
//                ),
//                new Vector4f(0.694f, 0.502f, 0.0f, 0.0f),
//                Arrays.asList(0, 1, 2, 0, 2, 3)
//        ));
//        objectsRectangle.add(new Rectangle(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(0.28f, 0.23f, 0.0f),
//                                new Vector3f(0.4f, 0.23f, 0.0f),
//                                new Vector3f(0.4f, 0.2f, 0.0f),
//                                new Vector3f(0.28f, 0.2f, 0.0f)
//                        )
//                ),
//                new Vector4f(1.0f, 0.0f, 0.0f, 1.0f),
//                Arrays.asList(0, 1, 2, 0, 2, 3)
//        ));
//
//        // Bulan
//        objectsCircle.add(new Circles(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(-0.7f, 0.73f, 0.0f)
//                        )
//                ),
//                new Vector4f(1.0f, 1.0f, 0.0f, 1.0f),
//                -0.7f, 0.7f, 0.1f,0.1f,0
//        ));
//
//        objectsCircle.add(new Circles(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(-0.7f, 0.73f, 0.0f)
//                        )
//                ),
//                new Vector4f(0.0f, 0.6f, 1.0f, 1.0f),
//                -0.65f, 0.7f, 0.1f, 0.1f,0
//        ));
//
//        // Asap
//        objectsCircle.add(new Circles(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(-0.7f, 0.73f, 0.0f)
//                        )
//                ),
//                new Vector4f(0.502f, 0.502f, 0.502f, 1.0f),
//                0.34f, 0.3f, 0.06f,0.033f,0
//        ));
//        objectsCircle.add(new Circles(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(-0.7f, 0.73f, 0.0f)
//                        )
//                ),
//                new Vector4f(0.502f, 0.502f, 0.502f, 1.0f),
//                0.38f, 0.338f, 0.08f,0.043f,0
//        ));
//        objectsCircle.add(new Circles(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(
//                        List.of(
//                                new Vector3f(-0.7f, 0.73f, 0.0f)
//                        )
//                ),
//                new Vector4f(0.502f, 0.502f, 0.502f, 1.0f),
//                0.438f, 0.378f, 0.11f,0.041f,0
//        ));
//        objectsStars.add(new Stars(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
//                Arrays.asList(4, 1, 1, 3, 3, 0, 0, 2, 2, 4),
//                -0.33f, 0.57f, 0.045f
//        ));
//        objectsStars.add(new Stars(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
//                Arrays.asList(4, 1, 1, 3, 3, 0, 0, 2, 2, 4),
//                0.01f, 0.87f, 0.021f
//        ));
//        objectsStars.add(new Stars(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
//                Arrays.asList(4, 1, 1, 3, 3, 0, 0, 2, 2, 4),
//                0.68f, 0.75f, 0.05f
//        ));
//                objectsPointsControl.add(new Object2d(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f,1.0f,1.0f,1.0f)
//
//        ));
//                objectsCurve.add(new Object2d(
//                Arrays.asList(
//                        //shaderFile lokasi menyesuaikan objectnya
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.vert"
//                                        , GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData
//                                ("resources/shaders/scene.frag"
//                                        , GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.0f,1.0f,1.0f,1.0f)
//
//        ));
                objectsSphere.add(new Sphere(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(
                        List.of(
                                new Vector3f(-0.7f, 0.73f, 0.0f)
                        )
                ),
                new Vector4f(0.0f, 1.0f, 1.0f, 1.0f),
                0.01f, 0.01f, 0.01f,0.05f,0.05f, 0.05f
                ));
    }

    public void input() {
        if (window.isKeyPressed(GLFW_KEY_W)) {
            System.out.println("W");
        }
        if (window.getMouseInput().isLeftButtonPressed()){
            Vector2f pos = window.getMouseInput().getCurrentPos();
//            System.out.println("x :" + pos.x + " y: " + pos.y);
            pos.x = (pos.x - (window.getWidth())/2.0f)/(window.getWidth()/2.0f);
            pos.y = (pos.y - (window.getHeight())/2.0f)/(- window.getHeight()/2.0f);

            if((!(pos.x > 1 || pos.x < -0.97 ) && !(pos.y > 0.97 || pos.y < -1))) {
                System.out.println("x : " + pos.x + " y : " + pos.y);
                baru = true;
                int index = 0;
                for (Mash object : objectMash){
                    baru = object.check(pos.x, pos.y);
                    if(!baru){
                        break;
                    }
                }
                for (Mash object : objectMash){
                    baru2 = object.kotak(pos.x, pos.y);
                    if(!baru2){
                            objectsPointsControl.get(0).update(index, (new Vector3f(pos.x, pos.y, 0)));
                            object.change(pos.x, pos.y, 0.1f);
                    }
                    index++;
                }
                System.out.println(index);
                if (baru){
                    objectsPointsControl.get(0).addVertice(new Vector3f(pos.x, pos.y, 0));
                    objectMash.add(new Mash(
                            Arrays.asList(
                                    //shaderFile lokasi menyesuaikan objectnya
                                    new ShaderProgram.ShaderModuleData
                                            ("resources/shaders/scene.vert"
                                                    , GL_VERTEX_SHADER),
                                    new ShaderProgram.ShaderModuleData
                                            ("resources/shaders/scene.frag"
                                                    , GL_FRAGMENT_SHADER)
                            ),
                            new ArrayList<>(),
                            new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                            pos.x, pos.y, 0.1f
                    ));
                }
            }
        }
    }

    public void loop() {
        while (window.isOpen()) {
            window.update();
            glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GL.createCapabilities();
            input();
            // Code
            for (Object2d object : objects) {
                object.drawWithVerticesColor();
            }
            for (Object2d object : objectsRectangle) {
                object.draw();
            }

            for (Object2d object : objectsCircle) {
                object.draw();
            }

            for (Object2d object : objectsStars) {
                object.draw();
            }

            for (Object2d object : objectsPointsControl) {
                object.drawLine();
            }
            ArrayList<Object2d> objectsCurve = calculatePoint(objectMash);
            for (Object2d object : objectsCurve) {
                object.drawLine();
            }
            for (Mash object : objectMash) {
                object.draw();
            }
            for (Object2d object : objectsSphere) {
                object.draw();
            }
            // restore default
            glDisableVertexAttribArray(0);
            // Poll for window events.
            // The key callback above will only be
            // invoked during this call
            glfwPollEvents();

        }
    }

    public static ArrayList<Object2d> calculatePoint(ArrayList <Mash> list) {
        int n = list.size() - 1;
        ArrayList<Object2d> objectsCurve = new ArrayList<>();
        objectsCurve.add(new Object2d(
                Arrays.asList(
                        //shaderFile lokasi menyesuaikan objectnya
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.vert"
                                        , GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData
                                ("resources/shaders/scene.frag"
                                        , GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f,1.0f,1.0f,1.0f)

        ));

        for(float j = 0; j <= 1; j+=0.01f) {
            float x = 0;
            float y = 0;
            for (int i = 0; i <= n; i++) {
                double factor = combi(n, i) * Math.pow(1 - j, n - i) * Math.pow(j, i);
                x += factor * list.get(i).getCenterx();
                y += factor * list.get(i).getCentery();
            }
            objectsCurve.get(0).addVertice((new Vector3f(x, y, 0)));
        }
        return objectsCurve;
    }
    private static int combi(int n, int k) {
        int result = 1;
        for (int i = 1; i <= k; i++) {
            result *= n - i + 1;
            result /= i;
        }
        return result;
    }

    public void run() {
        init();
        loop();
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }

    public static void main(String[] args) {
        new Main().run();
    }
}