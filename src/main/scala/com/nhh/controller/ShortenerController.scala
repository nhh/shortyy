package com.nhh.controller

import java.net.URI
import java.util.UUID

import com.nhh.services.LinkService

class ShortenerController extends ApplicationController {

  val linkService = new LinkService

  get ("/") {
    s"Hi there are ${linkService.count.toString} objects in database"
  }

  get("/:id") {
    redirect(linkService.findById(UUID.fromString(params("id"))).toString)
  }

  post("/") {
    linkService.createLink(new URI(params("link"))).toString
  }

  delete("/:id") {
    linkService.deleteLink(UUID.fromString(params("id"))).toString
  }

}
