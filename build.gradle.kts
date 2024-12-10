plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"
var asmVersion = 9.7

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.ow2.asm:asm-commons:$asmVersion")
    implementation("org.ow2.asm:asm-util:$asmVersion")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.9.21")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}