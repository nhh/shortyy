package com.nhh.controller

import java.net.URI
import java.util.UUID

import com.nhh.utilities.Storage

class ShortenerController extends ApplicationController {

  get("/:id") {
    val id = UUID.fromString(params("id"))
    val url = Storage.get(id)
    redirect(url)
  }

  post("/") {
    val url = new URI(params("link"))
    val id = UUID.randomUUID()
    Storage.create(id, url.toString)
    id.toString
  }

}
