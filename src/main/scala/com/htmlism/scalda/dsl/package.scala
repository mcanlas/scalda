package com.htmlism.scalda

import scala.language.postfixOps

package object dsl:
  val a: NoteOps = new NoteOps() // TODO
  val b: NoteOps = new NoteOps() // TODO
  val c: NoteOps = new NoteOps() // TODO
  val d: NoteOps = new NoteOps() // TODO
  val e: NoteOps = new NoteOps() // TODO
  val f: NoteOps = new NoteOps() // TODO
  val g: NoteOps = new NoteOps() // TODO

  val o: OctaveOps = new OctaveOps() // TODO

  // dsl compile test
  val _ =
    List(a +, b +, c -, d -, o <, o >, a / b / c)
