import java.io.File
import java.util.Properties
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

abstract class ProvideBuildClasspathTask : DefaultTask() {
  @get:OutputFile abstract var outFile: File

  @TaskAction
  @Throws(Exception::class)
  fun writeProperties() {
    val props = Properties()
    val usePreinstrumentedJars = System.getProperty(PREINSTRUMENTED_KEY, "true").toBoolean()

    AndroidSdk.ALL_SDKS.forEach { androidSdk ->
      val configurationName = "sdk${androidSdk.apiLevel}"
      val coordinates =
        if (usePreinstrumentedJars) {
          androidSdk.preinstrumentedCoordinates
        } else {
          androidSdk.coordinates
        }
      val config =
        project.configurations.create(configurationName) {
          dependencies.add(project.dependencies.create(coordinates))
        }

      props.setProperty(coordinates, config.files.joinToString(File.pathSeparator))
    }

    val outDir = outFile.parentFile
    if (!outDir.isDirectory) {
      outDir.mkdirs()
    }

    outFile.printWriter().use { out -> props.store(out, "# GENERATED by $this -- do not edit") }
  }

  private companion object {
    private const val PREINSTRUMENTED_KEY = "robolectric.usePreinstrumentedJars"
  }
}