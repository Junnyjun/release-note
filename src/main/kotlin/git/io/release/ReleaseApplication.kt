package git.io.release

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigClient
class ReleaseApplication

fun main(args: Array<String>) {
    runApplication<ReleaseApplication>(*args)
}
