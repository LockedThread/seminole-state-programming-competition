plugins {
    java
}

group = "dev.warrensnipes.seminole_state_programming_competition"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "dev.warrensnipes.seminole_state_programming_competition.number_freqency.NumberFrequency"
    }
}

