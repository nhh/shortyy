package com.nhh.utilities

import java.util.UUID

object Storage {

  private var STORAGE = Map("Genesis" -> "Block")

  def get(id : UUID): String = {
    STORAGE.getOrElse(id.toString, "Not found!")
    // Optional?
  }

  def create(id : UUID, value : String): String = {
    STORAGE += id.toString -> value
    value
  }

  def delete(id : UUID): String = {
    STORAGE -= id.toString
    id.toString
  }

  def update(id : UUID, value : String): String = {
    STORAGE(id.toString).replaceAll("*",value)
  }

}