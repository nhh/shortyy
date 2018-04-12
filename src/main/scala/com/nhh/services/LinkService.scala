package com.nhh.services

import java.net.URI
import java.util.UUID

import org.eclipse.jetty.http.HttpURI

class LinkService {

  def createLink(link : URI): Unit = {

  }

  def getRedirectLink(uuid : UUID):  URI = {
    new URI("https://hello-world.com")
  }

}
