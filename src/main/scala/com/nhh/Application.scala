package com.nhh

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.DefaultServlet
import org.eclipse.jetty.webapp.WebAppContext
import org.scalatra.servlet.ScalatraListener

object Application extends App {
  private final val port = if(System.getenv("PORT") != null) System.getenv("PORT").toInt else 8080

  private final val server = new Server(port)
  private final val context = new WebAppContext()

  context setContextPath "/"
  context.setResourceBase("src/main/webapp")
  context.addEventListener(new ScalatraListener)
  context.addServlet(classOf[DefaultServlet], "/")

  server.setHandler(context)

  server.start
  server.join

}
