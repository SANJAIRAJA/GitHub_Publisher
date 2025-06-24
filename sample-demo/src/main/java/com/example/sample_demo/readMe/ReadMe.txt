Creating Library
    > File → New → New Module → Android Library -> SetName
    > Add this in "build.gradle.kts" -> NewModule File -> plugins { id("maven-publish") }
    > Add this in "build.gradle.kts" -> NewModule File ->
        afterEvaluate {
              publishing {
                  publications {
                      create<MavenPublication>("release") {
                          from(components["release"])

                          groupId = "com.github.sanjairaja"
                          artifactId = "demoKitWebView"
                          version = "1.0.0"
                      }
                  }

                  repositories {
                      maven {
                          url = uri("$rootDir/repo") // Local repo in your project
                      }
                  }
              }
        }
    > Push


Push code to git
1. Add project to git
2. Must add "jitpack.yml" -> used to publish the code via jit.
3. In Github repository -> Create new release ->  add version and content and publish
4. Open jitpack.io in tab
