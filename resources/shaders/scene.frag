#version 330
uniform vec4 uni_color;
out vec4 frag_color;

//Directional Light
struct Dirlight{
    vec3 direction;
    vec3 ambient;
    vec3 diffuse;
    vec3 specular;
};

uniform vec3 viewPos;

uniform Dirlight dirLight;

//uniform vec3 LightColor;
//uniform vec3 lightPos;
in vec3 Normal;
in vec3 FragPos;

void main(){
    //Properties
    vec3 normal;
    vec3 viewDir= normalize (viewPos - FragPos)
}

//void main() {
//    //ambient
//    float ambientStrength = 0.1f;
//    vec3 ambient = ambientStrength * LightColor;
//
//    //Diffuse
//    vec3 lightDirection = normalize(lightPos - FragPos);
//    float diff = max(dot(Normal, lightDirection), 0.0);
//    vec3 diffuse = diff * LightColor;
//
//    vec3 result = (ambient + diffuse) * vec3(uni_color);
//    frag_color = vec4(result, 1.0);
//}
