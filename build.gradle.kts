plugins {
    java
}

// グループ定義
group = "space.vectrix.example"
version = "1.0-SNAPSHOT"

java {
    // Javaのバージョンを指定
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
    // Paperの依存リポジトリ
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://oss.sonatype.org/content/groups/public/")
    // Mixinの依存リポジトリ
    maven("https://repo.spongepowered.org/maven/")
    // ローカルリポジトリ (NMSの依存関係を解決するため)
    mavenLocal()
}

dependencies {
    // PaperAPI
    compileOnly("com.destroystokyo.paper:paper-api:1.16.5-R0.1-SNAPSHOT")
    // NMS (事前にBuildTools.jarを実行しておく必要がある)
    compileOnly("org.spigotmc:spigot:1.16.5-R0.1-SNAPSHOT")
    // Ignite
    compileOnly("space.vectrix.ignite:ignite-api:0.8.0")
    // Mixin
    compileOnly("org.spongepowered:mixin:0.8.5")
}
