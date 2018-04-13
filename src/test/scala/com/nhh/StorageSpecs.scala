package com.nhh

import java.util.UUID

import com.nhh.utilities.Storage

import org.scalatest._

class StorageSpecs extends FlatSpec with Matchers {

  "Storage#count" should "be 0 if no elements exists" in {
    Storage.count should be (1)
    val id = UUID.randomUUID()
    Storage.create(id, "Hallo Welt")
    Storage.count should be (2)
  }

  "Storage#get" should "provide return Hallo Welt" in {
    val id = UUID.randomUUID()
    Storage.create(id, "Hallo Welt")
    Storage.get(id) should be ("Hallo Welt")
  }

  "Storage#get" should "provide return Not found if the given key does not exist" in {
    val id = UUID.randomUUID()
    Storage.get(id) should be ("Not found")
  }

}