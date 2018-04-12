import org.scalatra._
import javax.servlet.ServletContext
import com.nhh.controller.ShortenerController

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new ShortenerController, "/*")
  }
}
