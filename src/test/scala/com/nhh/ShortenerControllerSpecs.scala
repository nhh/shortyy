package com.nhh

import com.nhh.controller.ShortenerController

class ShortenerControllerSpecs extends ApplicationTest {

  addServlet(classOf[ShortenerController], "/*")

  test("GET / on ApplicationController should return status 200"){
    get("/"){
      status should equal (200)
    }
  }

}