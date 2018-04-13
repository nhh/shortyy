package com.nhh.services

import java.net.URI
import java.util.UUID

import com.nhh.utilities.{Logger, Storage}

class LinkService {

  private val storage = Storage

  def createLink(link : URI): UUID = {
    val id = UUID.randomUUID()
    Logger.info(s"${id.toString} -> ${link.toString}")
    storage.create(id, link.toString)
  }

  def findById(id : UUID): URI = {
    new URI(storage.get(id))
  }

  def deleteLink(id : UUID): URI = {
    new URI(storage.delete(id))
  }

  def count : Integer = {
    storage.count
  }

}
