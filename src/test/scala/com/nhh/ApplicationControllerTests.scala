package com.nhh

import com.nhh.controller.ApplicationController
import org.scalatra.test.scalatest._

class ApplicationControllerTests extends ScalatraFunSuite {

  addServlet(classOf[ApplicationController], "/*")

  test("GET / on ApplicationController should return status 200"){
    get("/"){
      status should equal (200)
    }
  }

}
